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

import org.json.JSONException;
import org.json.JSONObject;

public class Servey12 extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{
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

    Button forward;
    Button backward;
    JSONObject jsonObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servey12);


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


        c71.setOnCheckedChangeListener(this);
        c72.setOnCheckedChangeListener(this);
        c73.setOnCheckedChangeListener(this);
        c74.setOnCheckedChangeListener(this);
        c75.setOnCheckedChangeListener(this);
        c76.setOnCheckedChangeListener(this);

        c77.setOnCheckedChangeListener(this);
        c78.setOnCheckedChangeListener(this);
        c79.setOnCheckedChangeListener(this);
        c710.setOnCheckedChangeListener(this);

        c711.setOnCheckedChangeListener(this);
        c712.setOnCheckedChangeListener(this);

        c713.setOnCheckedChangeListener(this);

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

                if (jsonObject.has("c_11")) {
                    if (jsonObject.has("c_12")) {

                        Intent intent = new Intent(Servey12.this,Servey13.class);
                        intent.putExtra("json",jsonObject.toString());
                        intent.putExtra("bjplist",getIntent().getStringArrayListExtra("bjplist"));
                        intent.putExtra("bsplist",getIntent().getStringArrayListExtra("bsplist"));
                        intent.putExtra("splist",getIntent().getStringArrayListExtra("splist"));
                        intent.putExtra("inclist",getIntent().getStringArrayListExtra("inclist"));
                        intent.putExtra("otherlist",getIntent().getStringArrayListExtra("otherlist"));
                        startActivity(intent);

                    }
                    else {
                        Toast.makeText(Servey12.this,"Please check C-12",Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(Servey12.this,"Please check C-11",Toast.LENGTH_SHORT).show();
                }


            }
        });
        checkforUpdate();

    }

    public void checkforUpdate(){
        try {

                try {
                    jsonObject = new JSONObject(getIntent().getStringExtra("json"));

                    if (jsonObject.has("c_11")) {
                        switch (jsonObject.get("c_11").toString()) {
                            case "भाजपा+ समर्थक दल":
                                c71.setChecked(true);
                                break;
                            case "सपा":
                                c72.setChecked(true);
                                break;
                            case "बसपा":
                                c73.setChecked(true);
                                break;
                            case "रालोद":
                                c74.setChecked(true);
                                break;
                            case "अन्य":
                                c75.setChecked(true);
                                break;
                            case "कांग्रेस":
                                c76.setChecked(true);
                                break;
                            case "तय नहीं किया है":
                                c77.setChecked(true);
                                break;
                            default:
                                break;
                        }

                    }
                    if (jsonObject.has("c_12")) {
                        switch (jsonObject.get("c_12").toString()) {
                            case "भाजपा+ समर्थक दल":
                                c78.setChecked(true);
                                break;
                            case "सपा":
                                c79.setChecked(true);
                                break;
                            case "बसपा":
                                c710.setChecked(true);
                                break;
                            case "कांग्रेस":
                                c711.setChecked(true);
                                break;
                            case "अन्य":
                                c712.setChecked(true);
                                break;
                            case "पता नहीं":
                                c713.setChecked(true);
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
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
                    c77.setChecked(false);
                    jsonObject.put("c_11",compoundButton.getText());
                    jsonObject.put("c_11","1");

                }
                else {
                    jsonObject.remove("c_11");
                }
            }
            else if (compoundButton.getId() == R.id.c72) {
                if (compoundButton.isChecked()) {
                    c71.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
                    c77.setChecked(false);
                    jsonObject.put("c_11",compoundButton.getText());
                    jsonObject.put("c_11","2");

                }
                else {
                    jsonObject.remove("c_11");
                }
            }
            else if (compoundButton.getId() == R.id.c73) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c71.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
                    c77.setChecked(false);
                    jsonObject.put("c_11",compoundButton.getText());
                    jsonObject.put("c_11","3");

                }
                else {
                    jsonObject.remove("c_11");
                }
            }
            else if (compoundButton.getId() == R.id.c74) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c71.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
                    c77.setChecked(false);
                    jsonObject.put("c_11",compoundButton.getText());
                    jsonObject.put("c_11","4");

                }
                else {
                    jsonObject.remove("c_11");
                }
            }
            else if (compoundButton.getId() == R.id.c75) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c71.setChecked(false);
                    c76.setChecked(false);
                    c77.setChecked(false);
                    jsonObject.put("c_11",compoundButton.getText());
                    jsonObject.put("c_11","5");

                }
                else {
                    jsonObject.remove("c_11");
                }
            }
            else if (compoundButton.getId() == R.id.c76) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c71.setChecked(false);
                    c77.setChecked(false);
                    jsonObject.put("c_11",compoundButton.getText());
                    jsonObject.put("c_11","6");

                }
                else {
                    jsonObject.remove("c_11");
                }
            }
            else if (compoundButton.getId() == R.id.c77) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
                    c71.setChecked(false);
                    c78.setChecked(false);
                    jsonObject.put("c_11",compoundButton.getText());
                    jsonObject.put("c_11","0");

                }
                else {
                    jsonObject.remove("c_11");
                }
            }
            else if (compoundButton.getId() == R.id.c78) {
                if (compoundButton.isChecked()) {

                    c79.setChecked(false);
                    c710.setChecked(false);
                    c711.setChecked(false);
                    c712.setChecked(false);
                    c713.setChecked(false);
                    jsonObject.put("c_12",compoundButton.getText());
                    jsonObject.put("c_12","1");

                }
                else {
                    jsonObject.remove("c_12");
                }
            }
            else if (compoundButton.getId() == R.id.c79) {
                if (compoundButton.isChecked()) {

                    c78.setChecked(false);
                    c710.setChecked(false);
                    c711.setChecked(false);
                    c712.setChecked(false);
                    c713.setChecked(false);
                    jsonObject.put("c_12",compoundButton.getText());
                    jsonObject.put("c_12","2");

                }
                else {
                    jsonObject.remove("c_12");
                }
            }
            else if (compoundButton.getId() == R.id.c710) {
                if (compoundButton.isChecked()) {

                    c78.setChecked(false);
                    c79.setChecked(false);
                    c711.setChecked(false);
                    c712.setChecked(false);
                    c713.setChecked(false);
                    jsonObject.put("c_12",compoundButton.getText());
                    jsonObject.put("c_12","3");

                }
                else {
                    jsonObject.remove("c_12");
                }
            }
            else if (compoundButton.getId() == R.id.c711) {
                if (compoundButton.isChecked()) {

                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);

                    c712.setChecked(false);
                    c713.setChecked(false);
                    jsonObject.put("c_12",compoundButton.getText());
                    jsonObject.put("c_12","4");

                }
                else {
                    jsonObject.remove("c_12");
                }
            }
            else if (compoundButton.getId() == R.id.c712) {
                if (compoundButton.isChecked()) {

                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);
                    c711.setChecked(false);

                    c713.setChecked(false);
                    jsonObject.put("c_12",compoundButton.getText());
                    jsonObject.put("c_12","6");

                }
                else {
                    jsonObject.remove("c_12");
                }
            }
            else if (compoundButton.getId() == R.id.c713) {
                if (compoundButton.isChecked()) {

                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);
                    c711.setChecked(false);
                    c712.setChecked(false);
                    jsonObject.put("c_12",compoundButton.getText());
                    jsonObject.put("c_12","0");

                }
                else {
                    jsonObject.remove("c_12");
                }
            }
        }
        catch (JSONException e) {

        }



    }
}