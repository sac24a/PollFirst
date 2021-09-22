package com.candlestickschart.pollfirst;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    EditText mobileText;
    Button forwardButton;
    ProgressBar progressBar;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mobileText = findViewById(R.id.mobileText);
        forwardButton = findViewById(R.id.forward);
        progressBar = findViewById(R.id.progressBar);
        sharedPreferences = getSharedPreferences("login",MODE_PRIVATE);
        editor = sharedPreferences.edit();
        if (!sharedPreferences.getString("user_id","").equals("")) {
            Intent intent = new Intent(MainActivity.this,Dashboard.class);
            startActivity(intent);
            finish();
        }

        forwardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mobileText.getText().length() < 10) {
                    Toast.makeText(MainActivity.this,"Enter valid mobile",Toast.LENGTH_LONG).show();
                }
                else {
                    progressBar.setVisibility(View.VISIBLE);
                    apicallToLogin();

                }
            }
        });
        try {
            if (ContextCompat.checkSelfPermission(getApplicationContext(), android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED || ContextCompat.checkSelfPermission(getApplicationContext(), android.Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED ) {
                ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION,android.Manifest.permission.CAMERA}, 101);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void apicallToLogin(){
        try {
            String url = "https://linier.in/UK/Rishikesh/API/Member18VSLoginRecord.php";
            Map<String, String> postParam= new HashMap<String, String>();
            postParam.put("user_mobile_no", mobileText.getText().toString());
            JSONObject jsonObject = new JSONObject(postParam);
            Log.d("TAG", "apicallToLogin: "+ jsonObject);
            JsonObjectRequest postRequest = new JsonObjectRequest(Request.Method.POST, url,new JSONObject(postParam),
                    new Response.Listener<JSONObject>() {
                        @Override
                        public void onResponse(JSONObject response) {
                            // response
                            Log.e("Responselogin", response.toString());
                            progressBar.setVisibility(View.GONE);
                            try {

                                JSONObject jsonObject = new JSONObject(response.toString());
                                if (jsonObject.getBoolean("success"))
                                {
                                    Intent intent = new Intent(MainActivity.this,Dashboard.class);
                                    editor.putString("user_id",jsonObject.getString("user_id"));
                                    editor.putString("user_mobile_no",jsonObject.getString("user_mobile_no"));
                                    editor.putString("mobile",jsonObject.getString("user_mobile_no"));
                                    editor.putString("District",jsonObject.getString("District"));
                                    editor.putString("LS_name",jsonObject.getString("LS_name"));
                                    editor.putString("AC_no",jsonObject.getString("AC_no"));
                                    editor.putString("AC_Name",jsonObject.getString("AC_Name"));
                                    editor.putString("QC_Mobile_No",jsonObject.getString("QC_Mobile_No"));
                                    editor.putString("ZC_Mobile_No",jsonObject.getString("ZC_Mobile_No"));
                                    editor.putString("TL_Mobile_No",jsonObject.getString("TL_Mobile_No"));
                                    editor.commit();
                                    startActivity(intent);
                                }
                                else  {
                                    Toast.makeText(MainActivity.this,jsonObject.getString("message"),Toast.LENGTH_SHORT).show();
                                }
                            }
                            catch (JSONException e) {

                            }
                        }
                    },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Log.d("Its error === >", "onErrorResponse: "+error);
                            progressBar.setVisibility(View.GONE);

                        }
                    }

            ) ;
            Mysingleton.getInstance(getApplicationContext()).addToRequestque(postRequest);



        }
        catch (NullPointerException e) {

        }
    }

    public void moveToNextScreen(){
        Intent intent = new Intent(MainActivity.this,MainActivity.class);
        startActivity(intent);
    }

    public void checkVersion(){
        final String currentVersion = "1";

    }

}