package com.candlestickschart.pollfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

public class Servey18 extends AppCompatActivity {

    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioButton radioButton4;
    RadioButton radioButton5;
    RadioButton radioButton6;
    RadioButton radioButton7;
    RadioButton radioButton8;
    RadioButton radioButton9;
    RadioButton radioButton10;
    RadioButton radioButton11;
    RadioButton radioButton12;
    RadioButton radioButton13;
    RadioButton radioButton14;
    RadioButton radioButton15;
    RadioButton radioButton16;
    RadioButton radioButton17;
    RadioButton radioButton18;
    RadioButton radioButton19;
    RadioButton radioButton20;
    RadioButton radioButton21;
    RadioButton radioButton22;
    RadioButton radioButton23;
    RadioButton radioButton24;
    RadioGroup radioGroup1;
    RadioGroup radioGroup2;
    RadioGroup radioGroup3;
    RadioGroup radioGroup4;
    RadioGroup radioGroup5;
    RadioGroup radioGroup6;
    RadioGroup radioGroup7;
    RadioGroup radioGroup8;
    JSONObject jsonObject =new JSONObject();

    Button forward;
    Button backward;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servey18);
//        try {
//            jsonObject = new JSONObject(getIntent().getStringExtra("json"));
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
        radioButton1 = findViewById(R.id.btn1);
        radioButton2 = findViewById(R.id.btn2);
        radioButton3 = findViewById(R.id.btn3);
        radioButton4 = findViewById(R.id.btn4);
        radioButton5 = findViewById(R.id.btn5);
        radioButton6 = findViewById(R.id.btn6);
        radioButton7 = findViewById(R.id.btn7);
        radioButton8 = findViewById(R.id.btn8);
        radioButton9 = findViewById(R.id.btn9);
        radioButton10 = findViewById(R.id.btn10);
        radioButton11 = findViewById(R.id.btn11);
        radioButton12 = findViewById(R.id.btn12);
        radioButton13 = findViewById(R.id.btn13);
        radioButton14 = findViewById(R.id.btn14);
        radioButton15 = findViewById(R.id.btn15);
        radioButton16 = findViewById(R.id.btn16);
        radioButton17 = findViewById(R.id.btn17);
        radioButton18 = findViewById(R.id.btn18);
        radioButton19 = findViewById(R.id.btn19);
        radioButton20 = findViewById(R.id.btn20);
        radioButton21 = findViewById(R.id.btn21);
        radioButton22 = findViewById(R.id.btn22);
        radioButton23 = findViewById(R.id.btn23);
        radioButton24 = findViewById(R.id.btn24);
        radioGroup1 = findViewById(R.id.radioGroup1);
        radioGroup2 = findViewById(R.id.radioGroup2);
        radioGroup3 = findViewById(R.id.radioGroup3);
        radioGroup4 = findViewById(R.id.radioGroup4);
        radioGroup5 = findViewById(R.id.radioGroup5);
        radioGroup6 = findViewById(R.id.radioGroup6);
        radioGroup7 = findViewById(R.id.radioGroup7);
        radioGroup8 = findViewById(R.id.radioGroup8);


        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (radioGroup.getCheckedRadioButtonId() == radioButton1.getId()) {
                    try {
                        jsonObject.put("q_20_1","0");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                else if (radioGroup.getCheckedRadioButtonId() == radioButton2.getId()) {
                    try {
                        jsonObject.put("q_20_1","1");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                else if (radioGroup.getCheckedRadioButtonId() == radioButton3.getId()) {
                    try {
                        jsonObject.put("q_20_1","2");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (radioGroup.getCheckedRadioButtonId() == radioButton4.getId()) {
                    try {
                        jsonObject.put("q_20_2","0");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                else if (radioGroup.getCheckedRadioButtonId() == radioButton5.getId()) {
                    try {
                        jsonObject.put("q_20_2","1");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                else if (radioGroup.getCheckedRadioButtonId() == radioButton6.getId()) {
                    try {
                        jsonObject.put("q_20_2","2");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (radioGroup.getCheckedRadioButtonId() == radioButton7.getId()) {
                    try {
                        jsonObject.put("q_20_3","0");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                else if (radioGroup.getCheckedRadioButtonId() == radioButton8.getId()) {
                    try {
                        jsonObject.put("q_20_3","1");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                else if (radioGroup.getCheckedRadioButtonId() == radioButton9.getId()) {
                    try {
                        jsonObject.put("q_20_3","2");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (radioGroup.getCheckedRadioButtonId() == radioButton10.getId()) {
                    try {
                        jsonObject.put("q_20_4","0");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                else if (radioGroup.getCheckedRadioButtonId() == radioButton11.getId()) {
                    try {
                        jsonObject.put("q_20_4","1");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                else if (radioGroup.getCheckedRadioButtonId() == radioButton12.getId()) {
                    try {
                        jsonObject.put("q_20_4","2");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        radioGroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (radioGroup.getCheckedRadioButtonId() == radioButton13.getId()) {
                    try {
                        jsonObject.put("q_20_5","0");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                else if (radioGroup.getCheckedRadioButtonId() == radioButton14.getId()) {
                    try {
                        jsonObject.put("q_20_5","1");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                else if (radioGroup.getCheckedRadioButtonId() == radioButton15.getId()) {
                    try {
                        jsonObject.put("q_20_5","2");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        radioGroup6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (radioGroup.getCheckedRadioButtonId() == radioButton16.getId()) {
                    try {
                        jsonObject.put("q_20_6","0");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                else if (radioGroup.getCheckedRadioButtonId() == radioButton17.getId()) {
                    try {
                        jsonObject.put("q_20_6","1");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                else if (radioGroup.getCheckedRadioButtonId() == radioButton18.getId()) {
                    try {
                        jsonObject.put("q_20_6","2");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        radioGroup7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (radioGroup.getCheckedRadioButtonId() == radioButton19.getId()) {
                    try {
                        jsonObject.put("q_20_7","0");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                else if (radioGroup.getCheckedRadioButtonId() == radioButton20.getId()) {
                    try {
                        jsonObject.put("q_20_7","1");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                else if (radioGroup.getCheckedRadioButtonId() == radioButton21.getId()) {
                    try {
                        jsonObject.put("q_20_7","2");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        radioGroup8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (radioGroup.getCheckedRadioButtonId() == radioButton22.getId()) {
                    try {
                        jsonObject.put("q_20_8","0");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                else if (radioGroup.getCheckedRadioButtonId() == radioButton23.getId()) {
                    try {
                        jsonObject.put("q_20_8","1");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                else if (radioGroup.getCheckedRadioButtonId() == radioButton24.getId()) {
                    try {
                        jsonObject.put("q_20_8","2");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
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
                Log.d("TAG", "onClick: "+jsonObject);
                if (jsonObject.has("q_20_1") && jsonObject.has("q_20_2") && jsonObject.has("q_20_3") && jsonObject.has("q_20_4") && jsonObject.has("q_20_5") && jsonObject.has("q_20_6") && jsonObject.has("q_20_7") && jsonObject.has("q_20_8")) {
                    Intent intent = new Intent(Servey18.this,Servey5.class);
                    intent.putExtra("json",jsonObject.toString());
                    startActivity(intent);

                }
                else {
                    Toast.makeText(Servey18.this,"Please check Q3",Toast.LENGTH_SHORT).show();
                }


            }
        });
        checkforUpdate();
    }
    public void checkforUpdate(){
        try {

            try {
                jsonObject = new JSONObject(getIntent().getStringExtra("json"));
                if (jsonObject.has("q_20_1")) {

                }

            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
        catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}