package com.candlestickschart.pollfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONException;
import org.json.JSONObject;

public class Servey2 extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{

    CheckBox c41;
    CheckBox c42;
    CheckBox c43;
    CheckBox c44;
    CheckBox c45;
    CheckBox c46;

    CheckBox c51;
    CheckBox c52;
    CheckBox c53;
    CheckBox c54;

    CheckBox c61;
    CheckBox c62;
    CheckBox c63;
    CheckBox c64;
    CheckBox c65;
    Button forward;
    Button backward;
    JSONObject jsonObject;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servey2);




        c41 = findViewById(R.id.c41);
        c42 = findViewById(R.id.c42);
        c43 = findViewById(R.id.c43);
        c44 = findViewById(R.id.c44);
        c45 = findViewById(R.id.c45);
        c46 = findViewById(R.id.c46);

        c51 = findViewById(R.id.c51);
        c52 = findViewById(R.id.c52);
        c53 = findViewById(R.id.c53);
        c54 = findViewById(R.id.c54);


        c61 = findViewById(R.id.c61);
        c62 = findViewById(R.id.c62);
        c63 = findViewById(R.id.c63);
        c64 = findViewById(R.id.c64);
        c65 = findViewById(R.id.c65);


        c41.setOnCheckedChangeListener(this::onCheckedChanged);
        c42.setOnCheckedChangeListener(this::onCheckedChanged);
        c43.setOnCheckedChangeListener(this::onCheckedChanged);
        c44.setOnCheckedChangeListener(this::onCheckedChanged);
        c45.setOnCheckedChangeListener(this::onCheckedChanged);
        c46.setOnCheckedChangeListener(this::onCheckedChanged);

        c51.setOnCheckedChangeListener(this::onCheckedChanged);
        c52.setOnCheckedChangeListener(this::onCheckedChanged);
        c53.setOnCheckedChangeListener(this::onCheckedChanged);
        c54.setOnCheckedChangeListener(this::onCheckedChanged);

        c61.setOnCheckedChangeListener(this::onCheckedChanged);
        c62.setOnCheckedChangeListener(this::onCheckedChanged);
        c63.setOnCheckedChangeListener(this::onCheckedChanged);
        c64.setOnCheckedChangeListener(this::onCheckedChanged);
        c65.setOnCheckedChangeListener(this::onCheckedChanged);

        backward = findViewById(R.id.backward);
        forward= findViewById(R.id.forward);
        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jsonObject.has("c_4")) {
                    if (jsonObject.has("c_5")) {
                        if (jsonObject.has("c_6")) {
                            Intent intent = new Intent(Servey2.this,Servey3.class);
                            intent.putExtra("json",jsonObject.toString());
                            startActivity(intent);
                        }
                        else {
                            Toast.makeText(Servey2.this,"Please check C6",Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {
                        Toast.makeText(Servey2.this,"Please check C5",Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(Servey2.this,"Please check C4",Toast.LENGTH_SHORT).show();
                }


            }
        });
        checkforUpdate();

    }

    public void checkforUpdate(){
        try {

                try {
                    jsonObject = new JSONObject(getIntent().getStringExtra("json"));
                    if (jsonObject.has("c_4")) {
                        switch (jsonObject.get("c_4").toString()) {
                            case "अशिक्षित":
                                c41.setChecked(true);
                                break;
                            case "शिक्षित":
                                c42.setChecked(true);
                                break;
                            case "प्राइमरी":
                                c43.setChecked(true);
                                break;
                            case "दसवीं पास":
                                c44.setChecked(true);
                                break;
                            case "बाहरवीं पास":
                                c45.setChecked(true);
                                break;
                            case "स्नातक/स्नात्कोत्तर":
                                c46.setChecked(true);
                                break;
                            default:
                                break;
                        }

                    }
                    if (jsonObject.has("c_5")) {
                        switch (jsonObject.get("c_5").toString()) {
                            case "संभ्रांत":
                                c51.setChecked(true);
                                break;
                            case "मध्यम वर्ग":
                                c52.setChecked(true);
                                break;
                            case "गरीब":
                                c53.setChecked(true);
                                break;
                            case "अति गरीब":
                                c54.setChecked(true);
                                break;
                            default:
                                break;
                        }

                    }
                    if (jsonObject.has("c_6")) {
                        switch (jsonObject.get("c_6").toString()) {
                            case "बहुत अधिक":
                                c61.setChecked(true);
                                break;
                            case "अधिक":
                                c62.setChecked(true);
                                break;
                            case "ठीक-ठाक":
                                c63.setChecked(true);
                                break;
                            case "कम":
                                c64.setChecked(true);
                                break;
                            case "बहुत कम":
                                c65.setChecked(true);
                                break;
                            default:
                                break;
                        }

                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

        catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        try {
            if (compoundButton.getId() == R.id.c41) {
                if (compoundButton.isChecked() == true) {
                    c42.setChecked(false);
                    c43.setChecked(false);
                    c44.setChecked(false);
                    c45.setChecked(false);
                    c46.setChecked(false);
//                    jsonObject.put("c_4",compoundButton.getText());
                    jsonObject.put("c_4","1");

                }
                else {
                    jsonObject.remove("c_4");
                }
            }
            else if (compoundButton.getId() == R.id.c42) {
                if (compoundButton.isChecked() == true) {
                    c41.setChecked(false);
                    c43.setChecked(false);
                    c44.setChecked(false);
                    c45.setChecked(false);
                    c46.setChecked(false);
//                    jsonObject.put("c_4",compoundButton.getText());
                    jsonObject.put("c_4","2");

                }
                else {
                    jsonObject.remove("c_4");
                }
            }
            else if (compoundButton.getId() == R.id.c43) {
                if (compoundButton.isChecked() == true) {
                    c41.setChecked(false);
                    c42.setChecked(false);
                    c44.setChecked(false);
                    c45.setChecked(false);
                    c46.setChecked(false);
//                    jsonObject.put("c_4",compoundButton.getText());
                    jsonObject.put("c_4","3");

                }
                else {
                    jsonObject.remove("c_4");
                }
            }
            else if (compoundButton.getId() == R.id.c44) {
                if (compoundButton.isChecked() == true) {
                    c41.setChecked(false);
                    c43.setChecked(false);
                    c42.setChecked(false);
                    c45.setChecked(false);
                    c46.setChecked(false);
//                    jsonObject.put("c_4",compoundButton.getText());
                    jsonObject.put("c_4","4");

                }
                else {
                    jsonObject.remove("c_4");
                }
            }
            else if (compoundButton.getId() == R.id.c45) {
                if (compoundButton.isChecked() == true) {
                    c41.setChecked(false);
                    c43.setChecked(false);
                    c44.setChecked(false);
                    c42.setChecked(false);
                    c46.setChecked(false);
//                    jsonObject.put("c_4",compoundButton.getText());
                    jsonObject.put("c_4","5");

                }
                else {
                    jsonObject.remove("c_4");
                }
            }
            else if (compoundButton.getId() == R.id.c46) {
                if (compoundButton.isChecked() == true) {
                    c41.setChecked(false);
                    c43.setChecked(false);
                    c44.setChecked(false);
                    c45.setChecked(false);
                    c42.setChecked(false);
//                    jsonObject.put("c_4",compoundButton.getText());
                    jsonObject.put("c_4","6");

                }
                else {
                    jsonObject.remove("c_4");
                }
            }
            else if (compoundButton.getId() == R.id.c51) {
                if (compoundButton.isChecked() == true) {
                    c52.setChecked(false);
                    c53.setChecked(false);
                    c54.setChecked(false);
//                    jsonObject.put("c_5",compoundButton.getText());
                    jsonObject.put("c_5","4");

                }
                else {
                    jsonObject.remove("c_5");
                }
            }
            else if (compoundButton.getId() == R.id.c52) {
                if (compoundButton.isChecked() == true) {
                    c51.setChecked(false);
                    c53.setChecked(false);
                    c54.setChecked(false);
//                    jsonObject.put("c_5",compoundButton.getText());
                    jsonObject.put("c_5","3");

                }
                else {
                    jsonObject.remove("c_5");
                }
            }
            else if (compoundButton.getId() == R.id.c53) {
                if (compoundButton.isChecked() == true) {
                    c52.setChecked(false);
                    c51.setChecked(false);
                    c54.setChecked(false);
//                    jsonObject.put("c_5",compoundButton.getText());
                    jsonObject.put("c_5","2");

                }
                else {
                    jsonObject.remove("c_5");
                }
            }
            else if (compoundButton.getId() == R.id.c54) {
                if (compoundButton.isChecked() == true) {
                    c52.setChecked(false);
                    c53.setChecked(false);
                    c51.setChecked(false);
//                    jsonObject.put("c_5",compoundButton.getText());
                    jsonObject.put("c_5","1");

                }
                else {
                    jsonObject.remove("c_5");
                }
            }
            else if (compoundButton.getId() == R.id.c61) {
                if (compoundButton.isChecked() == true) {
                    c62.setChecked(false);
                    c63.setChecked(false);
                    c64.setChecked(false);
                    c65.setChecked(false);
//                    jsonObject.put("c_6",compoundButton.getText());
                    jsonObject.put("c_6","5");

                }
                else {
                    jsonObject.remove("c_6");
                }
            }
            else if (compoundButton.getId() == R.id.c62) {
                if (compoundButton.isChecked() == true) {
                    c61.setChecked(false);
                    c63.setChecked(false);
                    c64.setChecked(false);
                    c65.setChecked(false);
//                    jsonObject.put("c_6",compoundButton.getText());
                    jsonObject.put("c_6","4");

                }
                else {
                    jsonObject.remove("c_6");
                }
            }
            else if (compoundButton.getId() == R.id.c63) {
                if (compoundButton.isChecked() == true) {
                    c62.setChecked(false);
                    c61.setChecked(false);
                    c64.setChecked(false);
                    c65.setChecked(false);
//                    jsonObject.put("c_6",compoundButton.getText());
                    jsonObject.put("c_6","3");

                }
                else {
                    jsonObject.remove("c_6");
                }
            }
            else if (compoundButton.getId() == R.id.c64) {
                if (compoundButton.isChecked() == true) {
                    c62.setChecked(false);
                    c63.setChecked(false);
                    c61.setChecked(false);
                    c65.setChecked(false);
//                    jsonObject.put("c_6",compoundButton.getText());
                    jsonObject.put("c_6","2");

                }
                else {
                    jsonObject.remove("c_6");
                }
            }
            else if (compoundButton.getId() == R.id.c65) {
                if (compoundButton.isChecked() == true) {
                    c62.setChecked(false);
                    c63.setChecked(false);
                    c64.setChecked(false);
                    c61.setChecked(false);
//                    jsonObject.put("c_6",compoundButton.getText());
                    jsonObject.put("c_6","1");

                }
                else {
                    jsonObject.remove("c_6");
                }
            }
        }
        catch (JSONException e) {

        }



    }
}