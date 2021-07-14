package com.candlestickschart.pollfirst;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Servey13 extends AppCompatActivity implements LocationListener {

    EditText name;
    EditText mobileNumber;
    Button locationButton;
    Button photo;
    Button upload;
    private FusedLocationProviderClient fusedLocationClient;
    JSONObject jsonObject;
    private static final int MY_CAMERA_PERMISSION_CODE = 100;
    private static final int CAMERA_REQUEST = 1888;
    ImageView capturedImage;
    Location newlocation;
    SharedPreferences sharedPreferences;
    ProgressBar progressBar;
    ProgressBar locprogressBar;

    protected LocationManager locationManager;
    protected LocationListener locationListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servey13);

        sharedPreferences = getSharedPreferences("login",MODE_PRIVATE);
        progressBar = findViewById(R.id.progressBar);
        locprogressBar = findViewById(R.id.locationProgress);

        try {
            if (ContextCompat.checkSelfPermission(getApplicationContext(), android.Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED ) {
                ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.CAMERA}, MY_CAMERA_PERMISSION_CODE);
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        name = findViewById(R.id.name);
        mobileNumber = findViewById(R.id.mobileNumber);
        locationButton = findViewById(R.id.location);
        upload = findViewById(R.id.upload);
        photo = findViewById(R.id.photo);
        capturedImage =  findViewById(R.id.capturedImage);
        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        try {
            jsonObject = new JSONObject(getIntent().getStringExtra("json"));
            jsonObject.put("user_id",sharedPreferences.getString("user_id",""));
            jsonObject.put("user_mobile_no",sharedPreferences.getString("user_mobile_no",""));
            jsonObject.put("record_id",sharedPreferences.getString("record_id","0"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        catch (NullPointerException e) {

        }
        Log.d("TAG", "record id: "+jsonObject);
        photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ActivityCompat.checkSelfPermission(Servey13.this,Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED)
                {
                    requestPermissions(new String[]{Manifest.permission.CAMERA}, MY_CAMERA_PERMISSION_CODE);
                }
                else
                {
                    Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivityForResult(cameraIntent, CAMERA_REQUEST);
                }
            }
        });
        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (!name.getText().toString().equals("")) {
                        jsonObject.put("name",name.getText().toString());
                        if (!mobileNumber.getText().toString().equals("") && (mobileNumber.getText().length() ==10)) {

                            jsonObject.put("mobile_no",mobileNumber.getText().toString());

                            if (newlocation !=null) {
                                try {
                                    jsonObject.put("location",String.valueOf(newlocation.getLatitude())+","+String.valueOf(newlocation.getLongitude()));
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                            }
                            else {
                                jsonObject.put("location","location");
//                                    Toast.makeText(Servey13.this,"Click location Button",Toast.LENGTH_SHORT).show();
                            }
                            if (jsonObject.has("home_photo")) {
                                progressBar.setVisibility(View.VISIBLE);
                                apicallToUpload();
                            }
                            else {
                                Toast.makeText(Servey13.this,"Please check Photo",Toast.LENGTH_SHORT).show();
                            }
                        }
                        else {
                            Toast.makeText(Servey13.this,"Please enter Mobile Number",Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {
                        Toast.makeText(Servey13.this,"Please enter Name",Toast.LENGTH_SHORT).show();
                    }
                }
                catch (JsonIOException | JSONException e) {
                    e.printStackTrace();
                }

            }
        });
        locationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ActivityCompat.checkSelfPermission(Servey13.this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(Servey13.this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                locprogressBar.setVisibility(View.VISIBLE);
                locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,0,0,Servey13.this);
            }
        });
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,0,0,this);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK)
        {
            try {
                Bitmap selectedImage = (Bitmap) data.getExtras().get("data");
                capturedImage.setImageBitmap(selectedImage);
                capturedImage.setVisibility(View.VISIBLE);
                String encodedImage = encodeImage(selectedImage);

                jsonObject.put("home_photo",encodedImage);
                Log.d("Encoded Image", "onActivityResult: "+encodedImage);
            } catch (JSONException | NullPointerException e) {

            }


        }

    }
    private String encodeImage(Bitmap bm)
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bm.compress(Bitmap.CompressFormat.PNG,100,baos);
        byte[] b = baos.toByteArray();
        String encImage = Base64.encodeToString(b, Base64.DEFAULT);
        return encImage;
    }
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults)
    {
        if (requestCode == MY_CAMERA_PERMISSION_CODE)
        {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED)
            {
                Toast.makeText(this, "camera permission granted", Toast.LENGTH_LONG).show();
                Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, CAMERA_REQUEST);
            }
            else
            {
                Toast.makeText(this, "camera permission denied", Toast.LENGTH_LONG).show();
            }
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

    }

    public void apicallToUpload(){
        try {
            AppExecutors.getInstance().diskIO().execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        PollFirstDataBase pollFirstDataBase = PollFirstDataBase.getInstance(Servey13.this);
                        List<PollFirstData> pollFirstData1 = pollFirstDataBase.pollFirstDao().getPollfirstData();
                        PollFirstData pollFirstData = new PollFirstData(jsonObject.getString("user_id"),jsonObject.getString("user_mobile_no"),jsonObject.getString("c_1"),jsonObject.getString("c_2"),jsonObject.getString("c_3"),jsonObject.getString("c_4"),jsonObject.getString("c_5"),jsonObject.getString("c_6"),jsonObject.getString("c_7"),jsonObject.getString("c_8"),jsonObject.getString("c_9"),jsonObject.getString("c_10"),jsonObject.getString("c_11"),jsonObject.getString("c_12"),jsonObject.getString("category"),jsonObject.getString("q_1"),jsonObject.getString("q_2_1"),jsonObject.getString("q_2_2"),jsonObject.getString("q_2_3"),jsonObject.getString("q_2_4"),jsonObject.getString("q_2_5"),jsonObject.getString("q_2_6"),jsonObject.getString("q_2_7"),jsonObject.getString("q_2_8"),jsonObject.getString("q_2_9"),jsonObject.getString("q_2_10"),jsonObject.getString("q_2_11"),jsonObject.getString("q_2_12"),jsonObject.getString("q_3"),jsonObject.getString("q_4"),jsonObject.getString("q_5"),jsonObject.getString("q_6"),jsonObject.getString("q_7"),jsonObject.getString("q_8"),jsonObject.getString("q_9"),jsonObject.getString("q_10"),jsonObject.getString("q_11"),jsonObject.getString("q_12"),jsonObject.getString("q_13"),jsonObject.getString("q_14"),jsonObject.getString("q_15"),jsonObject.getString("q_16"),jsonObject.getString("q_17"),jsonObject.getString("q_18"),jsonObject.getString("q_19"),jsonObject.getString("name"),jsonObject.getString("location"),jsonObject.getString("mobile_no"),jsonObject.getString("home_photo"));
                        pollFirstDataBase.pollFirstDao().insertPollFirst(pollFirstData);
                        List<PollFirstData> pollFirstData2 = pollFirstDataBase.pollFirstDao().getPollfirstData();
                        if (pollFirstData2.size()>pollFirstData1.size()) {
//                            Toast.makeText(Servey13.this,"Data Inserted",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(Servey13.this, Dashboard.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                            startActivity(intent);
                            Servey13.this.finish();
                        }
                        else {
                            AppExecutors.getInstance().mainThread().execute(new Runnable() {
                                @Override
                                public void run() {
                                    progressBar.setVisibility(View.GONE);
                                    Toast.makeText(Servey13.this,"Data not Inserted",Toast.LENGTH_SHORT).show();
                                }
                            });

                        }
                    }
                    catch (Exception e ) {
                        Toast.makeText(Servey13.this,e.toString(),Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
        catch (NullPointerException e) {

        }
    }

    @Override
    public void onLocationChanged(@NonNull Location location) {
        locprogressBar.setVisibility(View.GONE);
        newlocation = location;
        locationButton.setText(location.getLatitude()+","+location.getLongitude());
    }
    @Override
    public void onProviderEnabled(@NonNull String provider) {

    }

    @Override
    public void onProviderDisabled(@NonNull String provider) {

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }
}