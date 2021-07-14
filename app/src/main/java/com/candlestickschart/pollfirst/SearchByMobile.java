package com.candlestickschart.pollfirst;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class SearchByMobile extends AppCompatActivity {

    EditText mobileText;
    Button forwardButton;
    ProgressBar progressBar;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_by_mobile);

        mobileText = findViewById(R.id.mobileText);
        forwardButton = findViewById(R.id.search);
        progressBar = findViewById(R.id.progressBar);
        sharedPreferences = getSharedPreferences("login",MODE_PRIVATE);
        editor = sharedPreferences.edit();

        forwardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mobileText.getText().length() < 10) {
                    Toast.makeText(SearchByMobile.this,"Enter valid mobile",Toast.LENGTH_LONG).show();
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


            String url = "https://linier.in/UK/Rishikesh/API/Values_SurveyRecord.php";
            Map<String, String> postParam= new HashMap<String, String>();
            postParam.put("mobile_no", mobileText.getText().toString());

            JsonObjectRequest postRequest = new JsonObjectRequest(Request.Method.POST, url,new JSONObject(postParam),
                    new Response.Listener<JSONObject>() {
                        @Override
                        public void onResponse(JSONObject response) {
                            // response
                            Log.e("Responselogin", response.toString());
                            progressBar.setVisibility(View.GONE);
                            try {

                                JSONObject jsonObject = new JSONObject(response.toString());
                                Intent intent = new Intent(SearchByMobile.this,Servey1.class);
                                intent.putExtra("json",jsonObject.toString());
                                intent.putExtra("mode","update");
                                editor.putString("record_id",jsonObject.getString("id"));
                                editor.commit();
                                startActivity(intent);
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
}