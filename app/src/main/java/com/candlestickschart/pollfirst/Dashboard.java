package com.candlestickschart.pollfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class  Dashboard extends AppCompatActivity {

    Button newSample;
    Button searchSample;
    Button state;
    Button vidhansabha;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    PollFirstDataBase mDBb;
    ProgressBar progressBar;
    TextView insertedText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        newSample = findViewById(R.id.newSample);
        progressBar = findViewById(R.id.progressBar);
        searchSample = findViewById(R.id.searchSample);
        state = findViewById(R.id.state);
        vidhansabha = findViewById(R.id.vidhansabha);
        insertedText = findViewById(R.id.insertedText);
        sharedPreferences = getSharedPreferences("login",MODE_PRIVATE);
        editor = sharedPreferences.edit();
        mDBb = PollFirstDataBase.getInstance(this);
        insertedText.setText("Inserted Records: 0");
        newSample.setEnabled(false);


        newSample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editor.putString("record_id","0");
                editor.commit();
                Intent intent = new Intent(Dashboard.this,Servey1.class);
                intent.putExtra("bjplist",bjpList);
                intent.putExtra("bsplist",bspList);
                intent.putExtra("splist",spList);
                intent.putExtra("inclist",incList);
                intent.putExtra("otherlist",otherList);
                startActivity(intent);
            }
        });
        searchSample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.VISIBLE);
                getAllData();
            }
        });
        state.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this,Dashboard.class);
                startActivity(intent);
            }
        });
        vidhansabha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this,Dashboard.class);
                startActivity(intent);
            }
        });
        newSample.setBackgroundResource(R.drawable.newsample);
        checkDataForUpload();
        getInsertedData();
        getCandidateList();

    }

    public void checkDataForUpload() {
        AppExecutors.getInstance().diskIO().execute(new Runnable() {
            @Override
            public void run() {
                PollFirstDataBase pollFirstDataBase = PollFirstDataBase.getInstance(Dashboard.this);
                List<PollFirstData> pollFirstData = pollFirstDataBase.pollFirstDao().getPollfirstData();
                Log.d("Size", "onCreate: "+pollFirstData.size());
                try {
                    if (pollFirstData.size() == 0) {
                        AppExecutors.getInstance().mainThread().execute(new Runnable() {
                            @Override
                            public void run() {
                                progressBar.setVisibility(View.GONE);
                                searchSample.setBackgroundResource(R.drawable.newsample);
                                searchSample.setText("??????????????? ???????????? - "+"Pending - "+pollFirstData.size());
                            }
                        });

                    }
                    else  {
                        AppExecutors.getInstance().mainThread().execute(new Runnable() {
                            @Override
                            public void run() {
                                progressBar.setVisibility(View.GONE);
                                searchSample.setBackgroundResource(R.drawable.upload);
                                searchSample.setText("??????????????? ???????????? - "+"Pending - "+pollFirstData.size());
                            }
                        });
                    }

                }
                catch (IndexOutOfBoundsException e) {

                }
            }
        });
    }

    public void getAllData() {
        JSONArray jsonArray = new JSONArray();
        AppExecutors.getInstance().diskIO().execute(new Runnable() {
            @Override
            public void run() {
                PollFirstDataBase pollFirstDataBase = PollFirstDataBase.getInstance(Dashboard.this);
                List<PollFirstData> pollFirstData = pollFirstDataBase.pollFirstDao().getPollfirstData();
                Log.d("Size", "onCreate: "+pollFirstData.size());
                try {
                    if (pollFirstData.size() == 0) {
                        AppExecutors.getInstance().mainThread().execute(new Runnable() {
                            @Override
                            public void run() {
                                progressBar.setVisibility(View.GONE);
                                Toast.makeText(Dashboard.this,"Nothing to Upload",Toast.LENGTH_SHORT).show();
                            }
                        });

                    }
                    else  {
                        for (int i = 0; i< pollFirstData.size(); i++) {
                            JSONObject postParam = new JSONObject();
                            postParam.put("user_id",pollFirstData.get(i).user_id);
                            postParam.put("user_mobile_no",pollFirstData.get(i).user_mobile_no);
                            postParam.put("District",sharedPreferences.getString("District",""));
                            postParam.put("LS_name",sharedPreferences.getString("LS_name",""));
                            postParam.put("AC_no",sharedPreferences.getString("AC_no",""));
                            postParam.put("AC_Name",sharedPreferences.getString("AC_Name",""));
                            postParam.put("QC_Mobile_No",sharedPreferences.getString("QC_Mobile_No",""));
                            postParam.put("ZC_Mobile_No",sharedPreferences.getString("ZC_Mobile_No",""));
                            postParam.put("TL_Mobile_No",sharedPreferences.getString("TL_Mobile_No",""));
                            postParam.put("c_1",pollFirstData.get(i).c_1);
                            postParam.put("c_2",pollFirstData.get(i).c_2);
                            postParam.put("c_3",pollFirstData.get(i).c_3);
                            postParam.put("c_4",pollFirstData.get(i).c_4);
                            postParam.put("c_5",pollFirstData.get(i).c_5);
                            postParam.put("c_6",pollFirstData.get(i).c_6);
                            postParam.put("c_7",pollFirstData.get(i).c_7);
                            postParam.put("c_8",pollFirstData.get(i).c_8);
                            postParam.put("c_9",pollFirstData.get(i).c_9);
                            postParam.put("c_10",pollFirstData.get(i).c_10);
                            postParam.put("c_11",pollFirstData.get(i).c_11);
                            postParam.put("c_12",pollFirstData.get(i).c_12);
                            postParam.put("q_1",pollFirstData.get(i).q_1);
                            postParam.put("q_2_1",pollFirstData.get(i).q_2_1);
                            postParam.put("q_2_2",pollFirstData.get(i).q_2_2);
                            postParam.put("q_2_3",pollFirstData.get(i).q_2_3);
                            postParam.put("q_2_4",pollFirstData.get(i).q_2_4);
                            postParam.put("q_2_5",pollFirstData.get(i).q_2_5);
                            postParam.put("q_2_6",pollFirstData.get(i).q_2_6);
                            postParam.put("q_2_7",pollFirstData.get(i).q_2_7);
                            postParam.put("q_2_8",pollFirstData.get(i).q_2_8);
                            postParam.put("q_2_9",pollFirstData.get(i).q_2_9);
                            postParam.put("q_2_10",pollFirstData.get(i).q_2_10);
                            postParam.put("q_2_11",pollFirstData.get(i).q_2_11);
                            postParam.put("q_2_12",pollFirstData.get(i).q_2_12);
                            postParam.put("q_3_1",pollFirstData.get(i).q_20_1);
                            postParam.put("q_3_2",pollFirstData.get(i).q_20_2);
                            postParam.put("q_3_3",pollFirstData.get(i).q_20_3);
                            postParam.put("q_3_4",pollFirstData.get(i).q_20_4);
                            postParam.put("q_3_5",pollFirstData.get(i).q_20_5);
                            postParam.put("q_3_6",pollFirstData.get(i).q_20_6);
                            postParam.put("q_3_7",pollFirstData.get(i).q_20_7);
                            postParam.put("q_3_8",pollFirstData.get(i).q_20_8);

                            postParam.put("q_4",pollFirstData.get(i).q_3);
                            postParam.put("category",pollFirstData.get(i).category);
                            postParam.put("q_5",pollFirstData.get(i).q_4);
                            postParam.put("q_6",pollFirstData.get(i).q_5);
                            postParam.put("q_7",pollFirstData.get(i).q_6);
                            postParam.put("q_8",pollFirstData.get(i).q_7);
                            postParam.put("q_9",pollFirstData.get(i).q_8);
                            postParam.put("q_10",pollFirstData.get(i).q_9);
                            postParam.put("q_11",pollFirstData.get(i).q_10);
                            postParam.put("q_12",pollFirstData.get(i).q_11);
                            postParam.put("q_13",pollFirstData.get(i).q_12);
                            postParam.put("q_14",pollFirstData.get(i).q_13);
                            postParam.put("q_15",pollFirstData.get(i).q_14);
                            postParam.put("q_16",pollFirstData.get(i).q_15);
                            postParam.put("q_17",pollFirstData.get(i).q_16);
                            postParam.put("q_18",pollFirstData.get(i).q_17);
                            postParam.put("q_19",pollFirstData.get(i).q_18);
                            postParam.put("q_20",pollFirstData.get(i).q_19);
                            postParam.put("name",pollFirstData.get(i).name);
                            postParam.put("mobile_no",pollFirstData.get(i).mobile_no);
                            postParam.put("location",pollFirstData.get(i).location);
                            postParam.put("home_photo",pollFirstData.get(i).home_photo);
                            jsonArray.put(postParam);
                            Log.d("JsonToUpload", "run: "+jsonArray);
                        }
                        sendData(jsonArray);
                    }

                }
                catch (IndexOutOfBoundsException | JSONException e) {

                }
            }
        });
    }

    public void sendData(JSONArray array) throws JSONException {
            String url = "https://linier.in/UK/Rishikesh/API/Insert_SurveyRecord.php";
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("data",array);
            Log.d("JsonData", "sendData: "+jsonObject);
            JsonObjectRequest postRequest = new JsonObjectRequest(Request.Method.POST, url,jsonObject,
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
                                    AppExecutors.getInstance().diskIO().execute(new Runnable() {
                                        @Override
                                        public void run() {
                                            PollFirstDataBase pollFirstDataBase = PollFirstDataBase.getInstance(Dashboard.this);
                                            pollFirstDataBase.pollFirstDao().clearTable();
                                        }
                                    });
                                    Toast.makeText(Dashboard.this,jsonObject.getString("message"),Toast.LENGTH_SHORT).show();
                                    checkDataForUpload();
                                    getInsertedData();
                                }

                                else  {
                                    Toast.makeText(Dashboard.this,jsonObject.getString("message"),Toast.LENGTH_SHORT).show();
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

    public void getInsertedData(){
        try {
            String url = "https://linier.in/UK/Rishikesh/API/Researcher_TotalRecord.php";
            Map<String, String> postParam= new HashMap<String, String>();
            postParam.put("user_mobile_no", sharedPreferences.getString("mobile",""));
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
                                insertedText.setText("Inserted Records: "+jsonObject.getString("total_record"));
                            }
                            catch (JSONException e) {

                            }
                        }
                    },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Log.d("Its inserted error === >", "onErrorResponse: "+error);
                            progressBar.setVisibility(View.GONE);

                        }
                    }

            ) ;
            Mysingleton.getInstance(getApplicationContext()).addToRequestque(postRequest);



        }
        catch (NullPointerException e) {

        }
    }
    ArrayList<String> bjpList = new ArrayList<>();
    ArrayList<String> bspList = new ArrayList<>();
    ArrayList<String> spList = new ArrayList<>();
    ArrayList<String> incList = new ArrayList<>();
    ArrayList<String> otherList = new ArrayList<>();
    public void getCandidateList(){
        try {
            progressBar.setVisibility(View.VISIBLE);
            String url = "https://linier.in/UK/Rishikesh/API/Candidate_RecordList.php";
            Map<String, String> postParam= new HashMap<String, String>();
            postParam.put("AC_no", sharedPreferences.getString("AC_no",""));
            JSONObject jsonObject = new JSONObject(postParam);
            Log.d("TAG", "apicallToLogin: "+ jsonObject);
            JsonObjectRequest postRequest = new JsonObjectRequest(Request.Method.POST, url,new JSONObject(postParam),
                    new Response.Listener<JSONObject>() {
                        @Override
                        public void onResponse(JSONObject response) {
                            // response
                            Log.e("Responselogin", response.toString());
                            progressBar.setVisibility(View.GONE);
                            newSample.setEnabled(true);
                            try {

                                JSONObject jsonObject = new JSONObject(response.toString());
                                JSONArray jsonArray = jsonObject.getJSONArray("qual_candidate_name");
                                for (int i = 0; i<jsonArray.length();i++) {
                                    if (jsonArray.getJSONObject(i).getString("Party_name").equals("BJP")) {
                                        bjpList.add(jsonArray.getJSONObject(i).getString("name")+"("+jsonArray.getJSONObject(i).getString("Party_name")+")");
                                    }
                                    else if (jsonArray.getJSONObject(i).getString("Party_name").equals("BSP")) {
                                        bspList.add(jsonArray.getJSONObject(i).getString("name")+"("+jsonArray.getJSONObject(i).getString("Party_name")+")");
                                    }
                                    else if (jsonArray.getJSONObject(i).getString("Party_name").equals("SP")) {
                                        spList.add(jsonArray.getJSONObject(i).getString("name")+"("+jsonArray.getJSONObject(i).getString("Party_name")+")");
                                    }
                                    else if (jsonArray.getJSONObject(i).getString("Party_name").equals("INC")) {
                                        incList.add(jsonArray.getJSONObject(i).getString("name")+"("+jsonArray.getJSONObject(i).getString("Party_name")+")");
                                    }
                                    else if (jsonArray.getJSONObject(i).getString("Party_name").equals("Other")) {
                                        otherList.add(jsonArray.getJSONObject(i).getString("name")+"("+jsonArray.getJSONObject(i).getString("Party_name")+")");
                                    }
                                }
                            }
                            catch (JSONException e) {

                            }
                            Log.d("TAG", "onResponse: "+bjpList);
                            Log.d("TAG", "onResponse: "+bspList);
                            Log.d("TAG", "onResponse: "+spList);
                            Log.d("TAG", "onResponse: "+incList);
                            Log.d("TAG", "onResponse: "+otherList);

                        }
                    },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Log.d("Its inserted error === >", "onErrorResponse: "+error);
                            progressBar.setVisibility(View.GONE);
                            newSample.setEnabled(true);

                        }
                    }

            ) ;
            Mysingleton.getInstance(getApplicationContext()).addToRequestque(postRequest);



        }
        catch (NullPointerException e) {

        }
    }


}