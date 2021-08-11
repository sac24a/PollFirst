package com.candlestickschart.pollfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

public class Servey3 extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{

    CheckBox c71;
    CheckBox c72;
    CheckBox c73;
    CheckBox c74;
    CheckBox c75;
    CheckBox c76;
    CheckBox c77;
    CheckBox c78;
    CheckBox c79;
    CheckBox c710;
    CheckBox c711;
    CheckBox c712;
    CheckBox c713;
    CheckBox c714;
    CheckBox c715;
    JSONObject jsonObject;

    Button forward;
    Button backward;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servey3);


        try {
            jsonObject = new JSONObject(getIntent().getStringExtra("json"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        c71 = findViewById(R.id.c71);
        c72 = findViewById(R.id.c72);
        c73 = findViewById(R.id.c73);
        c74 = findViewById(R.id.c74);
        c75 = findViewById(R.id.c75);
        c76 = findViewById(R.id.c76);

        c77 = findViewById(R.id.c77);
        c78 = findViewById(R.id.c78);
        c79 = findViewById(R.id.c79);
        c710 = findViewById(R.id.c710);


        c711 = findViewById(R.id.c711);
        c712 = findViewById(R.id.c712);
        c713 = findViewById(R.id.c713);
        c714 = findViewById(R.id.c714);
        c715 = findViewById(R.id.c715);

        c71.setOnCheckedChangeListener(this::onCheckedChanged);
        c72.setOnCheckedChangeListener(this::onCheckedChanged);
        c73.setOnCheckedChangeListener(this::onCheckedChanged);
        c74.setOnCheckedChangeListener(this::onCheckedChanged);
        c75.setOnCheckedChangeListener(this::onCheckedChanged);
        c76.setOnCheckedChangeListener(this::onCheckedChanged);

        c77.setOnCheckedChangeListener(this::onCheckedChanged);
        c78.setOnCheckedChangeListener(this::onCheckedChanged);
        c79.setOnCheckedChangeListener(this::onCheckedChanged);
        c710.setOnCheckedChangeListener(this::onCheckedChanged);

        c711.setOnCheckedChangeListener(this::onCheckedChanged);
        c712.setOnCheckedChangeListener(this::onCheckedChanged);
        c713.setOnCheckedChangeListener(this::onCheckedChanged);
        c714.setOnCheckedChangeListener(this::onCheckedChanged);
        c715.setOnCheckedChangeListener(this::onCheckedChanged);

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

                if (jsonObject.has("c_7")) {
                    Intent intent = new Intent(Servey3.this,servey4.class);
                    intent.putExtra("json",jsonObject.toString());
                    startActivity(intent);

                }
                else {
                    Toast.makeText(Servey3.this,"Please check C7",Toast.LENGTH_SHORT).show();
                }


            }
        });
        checkforUpdate();
    }

    public void checkforUpdate(){
        try {

                try {
                    jsonObject = new JSONObject(getIntent().getStringExtra("json"));
                    if (jsonObject.has("c_7")) {
                        switch (jsonObject.get("c_7").toString()) {
                            case "बेरोजगार":
                                c71.setChecked(true);
                                break;
                            case "सामान्य मजदूर":
                                c72.setChecked(true);
                                break;
                            case "औद्योगिक मजदूर":
                                c73.setChecked(true);
                                break;
                            case "सड़क विक्रेता":
                                c74.setChecked(true);
                                break;
                            case "गृहणी":
                                c75.setChecked(true);
                                break;
                            case "लघु उद्योग":
                                c76.setChecked(true);
                                break;
                            case "छात्र":
                                c77.setChecked(true);
                                break;
                            case "किसान":
                                c78.setChecked(true);
                                break;
                            case "सेवा निवृत":
                                c79.setChecked(true);
                                break;
                            case "छोटा व्यवसाय":
                                c710.setChecked(true);
                                break;
                            case "प्राइवेट नौकरी":
                                c711.setChecked(true);
                                break;
                            case "सरकारी नौकरी":
                                c712.setChecked(true);
                                break;
                            case "बड़ा व्यवसाय":
                                c713.setChecked(true);
                                break;
                            case "व्यावसायिक":
                                c714.setChecked(true);
                                break;
                            case "अन्य":
                                c715.setChecked(true);
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
            if (compoundButton.getId() == R.id.c71) {

                if (compoundButton.isChecked() == true) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
                    c77.setChecked(false);
                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);
                    c711.setChecked(false);
                    c712.setChecked(false);
                    c713.setChecked(false);
                    c714.setChecked(false);
                    c715.setChecked(false);

//                    jsonObject.put("c_7",compoundButton.getText());
                    jsonObject.put("c_7","1");

                }
                else {
                    jsonObject.remove("c_7");
                }
            }
            else if (compoundButton.getId() == R.id.c72) {
                if (compoundButton.isChecked() == true) {
                    c71.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
                    c77.setChecked(false);
                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);
                    c711.setChecked(false);
                    c712.setChecked(false);
                    c713.setChecked(false);
                    c714.setChecked(false);
                    c715.setChecked(false);
//                    jsonObject.put("c_7",compoundButton.getText());
                    jsonObject.put("c_7","2");

                }
                else {
                    jsonObject.remove("c_7");
                }
            }
            else if (compoundButton.getId() == R.id.c73) {
                if (compoundButton.isChecked() == true) {
                    c72.setChecked(false);
                    c71.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
                    c77.setChecked(false);
                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);
                    c711.setChecked(false);
                    c712.setChecked(false);
                    c713.setChecked(false);
                    c714.setChecked(false);
                    c715.setChecked(false);
                    jsonObject.put("c_7",compoundButton.getText());
                    jsonObject.put("c_7","3");

                }
                else {
                    jsonObject.remove("c_7");
                }
            }
            else if (compoundButton.getId() == R.id.c74) {
                if (compoundButton.isChecked() == true) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c71.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
                    c77.setChecked(false);
                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);
                    c711.setChecked(false);
                    c712.setChecked(false);
                    c713.setChecked(false);
                    c714.setChecked(false);
                    c715.setChecked(false);
                    jsonObject.put("c_7",compoundButton.getText());
                    jsonObject.put("c_7","4");

                }
                else {
                    jsonObject.remove("c_7");
                }
            }
            else if (compoundButton.getId() == R.id.c75) {
                if (compoundButton.isChecked() == true) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c71.setChecked(false);
                    c76.setChecked(false);
                    c77.setChecked(false);
                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);
                    c711.setChecked(false);
                    c712.setChecked(false);
                    c713.setChecked(false);
                    c714.setChecked(false);
                    c715.setChecked(false);
                    jsonObject.put("c_7",compoundButton.getText());
                    jsonObject.put("c_7","5");

                }
                else {
                    jsonObject.remove("c_7");
                }
            }
            else if (compoundButton.getId() == R.id.c76) {
                if (compoundButton.isChecked() == true) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c71.setChecked(false);
                    c77.setChecked(false);
                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);
                    c711.setChecked(false);
                    c712.setChecked(false);
                    c713.setChecked(false);
                    c714.setChecked(false);
                    c715.setChecked(false);
                    jsonObject.put("c_7",compoundButton.getText());
                    jsonObject.put("c_7","6");

                }
                else {
                    jsonObject.remove("c_7");
                }
            }
            else if (compoundButton.getId() == R.id.c77) {
                if (compoundButton.isChecked() == true) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
                    c71.setChecked(false);
                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);
                    c711.setChecked(false);
                    c712.setChecked(false);
                    c713.setChecked(false);
                    c714.setChecked(false);
                    c715.setChecked(false);
                    jsonObject.put("c_7",compoundButton.getText());
                    jsonObject.put("c_7","7");

                }
                else {
                    jsonObject.remove("c_7");
                }
            }
            else if (compoundButton.getId() == R.id.c78) {
                if (compoundButton.isChecked() == true) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
                    c77.setChecked(false);
                    c71.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);
                    c711.setChecked(false);
                    c712.setChecked(false);
                    c713.setChecked(false);
                    c714.setChecked(false);
                    c715.setChecked(false);
                    jsonObject.put("c_7",compoundButton.getText());
                    jsonObject.put("c_7","8");

                }
                else {
                    jsonObject.remove("c_7");
                }
            }
            else if (compoundButton.getId() == R.id.c79) {
                if (compoundButton.isChecked() == true) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
                    c77.setChecked(false);
                    c78.setChecked(false);
                    c71.setChecked(false);
                    c710.setChecked(false);
                    c711.setChecked(false);
                    c712.setChecked(false);
                    c713.setChecked(false);
                    c714.setChecked(false);
                    c715.setChecked(false);
                    jsonObject.put("c_7",compoundButton.getText());
                    jsonObject.put("c_7","9");

                }
                else {
                    jsonObject.remove("c_7");
                }
            }
            else if (compoundButton.getId() == R.id.c710) {
                if (compoundButton.isChecked() == true) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
                    c77.setChecked(false);
                    c78.setChecked(false);
                    c79.setChecked(false);
                    c71.setChecked(false);
                    c711.setChecked(false);
                    c712.setChecked(false);
                    c713.setChecked(false);
                    c714.setChecked(false);
                    c715.setChecked(false);
                    jsonObject.put("c_7",compoundButton.getText());
                    jsonObject.put("c_7","10");

                }
                else {
                    jsonObject.remove("c_7");
                }
            }
            else if (compoundButton.getId() == R.id.c711) {
                if (compoundButton.isChecked() == true) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
                    c77.setChecked(false);
                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);
                    c71.setChecked(false);
                    c712.setChecked(false);
                    c713.setChecked(false);
                    c714.setChecked(false);
                    c715.setChecked(false);
                    jsonObject.put("c_7",compoundButton.getText());
                    jsonObject.put("c_7","11");

                }
                else {
                    jsonObject.remove("c_7");
                }
            }
            else if (compoundButton.getId() == R.id.c712) {
                if (compoundButton.isChecked() == true) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
                    c77.setChecked(false);
                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);
                    c711.setChecked(false);
                    c71.setChecked(false);
                    c713.setChecked(false);
                    c714.setChecked(false);
                    c715.setChecked(false);
                    jsonObject.put("c_7",compoundButton.getText());
                    jsonObject.put("c_7","12");

                }
                else {
                    jsonObject.remove("c_7");
                }
            }
            else if (compoundButton.getId() == R.id.c713) {
                if (compoundButton.isChecked() == true) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
                    c77.setChecked(false);
                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);
                    c711.setChecked(false);
                    c712.setChecked(false);
                    c71.setChecked(false);
                    c714.setChecked(false);
                    c715.setChecked(false);
                    jsonObject.put("c_7",compoundButton.getText());
                    jsonObject.put("c_7","13");

                }
                else {
                    jsonObject.remove("c_7");
                }
            }
            else if (compoundButton.getId() == R.id.c714) {
                if (compoundButton.isChecked() == true) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
                    c77.setChecked(false);
                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);
                    c711.setChecked(false);
                    c712.setChecked(false);
                    c713.setChecked(false);
                    c71.setChecked(false);
                    c715.setChecked(false);
                    jsonObject.put("c_7",compoundButton.getText());
                    jsonObject.put("c_7","14");

                }
                else {
                    jsonObject.remove("c_7");
                }
            }
            else if (compoundButton.getId() == R.id.c715) {
                if (compoundButton.isChecked() == true) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
                    c77.setChecked(false);
                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);
                    c711.setChecked(false);
                    c712.setChecked(false);
                    c713.setChecked(false);
                    c714.setChecked(false);
                    c71.setChecked(false);
                    jsonObject.put("c_7",compoundButton.getText());
                    jsonObject.put("c_7","0");

                }
                else {
                    jsonObject.remove("c_7");
                }
            }
        }
        catch (JSONException e) {

        }
        


    }
}