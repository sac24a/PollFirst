package com.candlestickschart.pollfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentProvider;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Servey1 extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    CheckBox age1;
    CheckBox age2;
    CheckBox age3;
    CheckBox age4;
    CheckBox age5;

    CheckBox male;
    CheckBox female;
    CheckBox other;

    CheckBox village;
    CheckBox town;
    CheckBox city;
    Button forward;
    Button backward;

    JSONObject jsonObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servey1);

        jsonObject = new JSONObject();
        age1 = findViewById(R.id.age1);
        age2 = findViewById(R.id.age2);
        age3 = findViewById(R.id.age3);
        age4 = findViewById(R.id.age4);
        age5 = findViewById(R.id.age5);

        village = findViewById(R.id.village);
        city = findViewById(R.id.city);
        town = findViewById(R.id.town);

        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        other = findViewById(R.id.other);
        age1.setOnCheckedChangeListener(this::onCheckedChanged);
        age2.setOnCheckedChangeListener(this::onCheckedChanged);
        age3.setOnCheckedChangeListener(this::onCheckedChanged);
        age4.setOnCheckedChangeListener(this::onCheckedChanged);
        age5.setOnCheckedChangeListener(this::onCheckedChanged);

        city.setOnCheckedChangeListener(this::onCheckedChanged);
        town.setOnCheckedChangeListener(this::onCheckedChanged);
        village.setOnCheckedChangeListener(this::onCheckedChanged);

        male.setOnCheckedChangeListener(this::onCheckedChanged);
        female.setOnCheckedChangeListener(this::onCheckedChanged);
        other.setOnCheckedChangeListener(this::onCheckedChanged);

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

                if (jsonObject.has("c_1")) {
                    if (jsonObject.has("c_2")) {
                        if (jsonObject.has("c_3")) {
                            Intent intent = new Intent(Servey1.this,Servey2.class);
                            intent.putExtra("json",jsonObject.toString());
                            intent.putExtra("bjplist",getIntent().getStringArrayListExtra("bjplist"));
                            intent.putExtra("bsplist",getIntent().getStringArrayListExtra("bsplist"));
                            intent.putExtra("splist",getIntent().getStringArrayListExtra("splist"));
                            intent.putExtra("inclist",getIntent().getStringArrayListExtra("inclist"));
                            intent.putExtra("otherlist",getIntent().getStringArrayListExtra("otherlist"));
                            startActivity(intent);
                        }
                        else {
                            Toast.makeText(Servey1.this,"Please check C3",Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {
                        Toast.makeText(Servey1.this,"Please check C2",Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(Servey1.this,"Please check C1",Toast.LENGTH_SHORT).show();
                }


            }
        });
        checkforUpdate();
    }

    public void checkforUpdate(){
        try {
            if (getIntent().getStringExtra("mode").equals("update")) {
                try {
                    jsonObject = new JSONObject(getIntent().getStringExtra("json"));
                    if (jsonObject.has("c_1")) {
                        switch (jsonObject.get("c_1").toString()) {
                            case "18 से 23":
                                age1.setChecked(true);
                                break;
                            case "24 से 35":
                                age2.setChecked(true);
                                break;
                            case "36 से 45":
                                age3.setChecked(true);
                                break;
                            case "46 से 60":
                                age4.setChecked(true);
                                break;
                            case "60 से अधिक":
                                age5.setChecked(true);
                                break;
                            default:
                                break;
                        }

                    }
                    if (jsonObject.has("c_2")) {
                        switch (jsonObject.get("c_2").toString()) {
                            case "महिला":
                                female.setChecked(true);
                                break;
                            case "पुरुष":
                                male.setChecked(true);
                                break;
                            case "अन्य":
                                other.setChecked(true);
                                break;
                            default:
                                break;
                        }

                    }
                    if (jsonObject.has("c_3")) {
                        switch (jsonObject.get("c_3").toString()) {
                            case "गांव":
                                village.setChecked(true);
                                break;
                            case "कस्बा":
                                town.setChecked(true);
                                break;
                            case "शहर":
                                city.setChecked(true);
                                break;
                            default:
                                break;
                        }

                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        catch (NullPointerException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        try {
            if (compoundButton.getId() == R.id.age1) {
                if (compoundButton.isChecked() == true) {
                    age2.setChecked(false);
                    age3.setChecked(false);
                    age4.setChecked(false);
                    age5.setChecked(false);
//                    jsonObject.put("c_1",compoundButton.getText());
                    jsonObject.put("c_1","1");

                }
                else {
                    jsonObject.remove("c_1");
                }
            }
            else if (compoundButton.getId() == R.id.age2) {
                if (compoundButton.isChecked() == true) {
                    age1.setChecked(false);
                    age3.setChecked(false);
                    age4.setChecked(false);
                    age5.setChecked(false);
//                    jsonObject.put("c_1",compoundButton.getText());
                    jsonObject.put("c_1","2");
                }
                else {
                    jsonObject.remove("c_1");
                }
            }
            else if (compoundButton.getId() == R.id.age3) {
                if (compoundButton.isChecked() == true) {
                    age1.setChecked(false);
                    age2.setChecked(false);
                    age4.setChecked(false);
                    age5.setChecked(false);
//                    jsonObject.put("c_1",compoundButton.getText());
                    jsonObject.put("c_1","2");
                }
                else {
                    jsonObject.remove("c_1");
                }
            }
            else if (compoundButton.getId() == R.id.age4) {
                if (compoundButton.isChecked() == true) {
                    age1.setChecked(false);
                    age3.setChecked(false);
                    age2.setChecked(false);
                    age5.setChecked(false);
//                    jsonObject.put("c_1",compoundButton.getText());
                    jsonObject.put("c_1","4");
                }
                else {
                    jsonObject.remove("c_1");
                }
            }
            else if (compoundButton.getId() == R.id.age5) {
                if (compoundButton.isChecked() == true) {
                    age1.setChecked(false);
                    age3.setChecked(false);
                    age4.setChecked(false);
                    age2.setChecked(false);
//                    jsonObject.put("c_1",compoundButton.getText());
                    jsonObject.put("c_1","5");
                }
                else {
                    jsonObject.remove("c_1");
                }
            }
            else if (compoundButton.getId() == R.id.male) {
                if (compoundButton.isChecked() == true) {
                    female.setChecked(false);
                    other.setChecked(false);
//                    jsonObject.put("c_2",compoundButton.getText());
                    jsonObject.put("c_2","2");
                }
                else {
                    jsonObject.remove("c_2");
                }
            }
            else if (compoundButton.getId() == R.id.female) {
                if (compoundButton.isChecked() == true) {
                    male.setChecked(false);
                    other.setChecked(false);
//                    jsonObject.put("c_2",compoundButton.getText());
                    jsonObject.put("c_2","1");
                }
                else {
                    jsonObject.remove("c_2");
                }
            }
            else if (compoundButton.getId() == R.id.other) {
                if (compoundButton.isChecked() == true) {
                    female.setChecked(false);
                    male.setChecked(false);
//                    jsonObject.put("c_2",compoundButton.getText());
                    jsonObject.put("c_2","3");
                }
                else {
                    jsonObject.remove("c_2");
                }
            }
            else if (compoundButton.getId() == R.id.village) {
                if (compoundButton.isChecked() == true) {
                    city.setChecked(false);
                    town.setChecked(false);
//                    jsonObject.put("c_3",compoundButton.getText());
                    jsonObject.put("c_3","1");
                }
                else {
                    jsonObject.remove("c_3");
                }
            }
            else if (compoundButton.getId() == R.id.town) {
                if (compoundButton.isChecked() == true) {
                    village.setChecked(false);
                    city.setChecked(false);
//                    jsonObject.put("c_3",compoundButton.getText());
                    jsonObject.put("c_3","2");
                }
                else {
                    jsonObject.remove("c_3");
                }
            }
            else if (compoundButton.getId() == R.id.city) {
                if (compoundButton.isChecked() == true) {
                    village.setChecked(false);
                    town.setChecked(false);
//                    jsonObject.put("c_3",compoundButton.getText());
                    jsonObject.put("c_3","3");
                }
                else {
                    jsonObject.remove("c_3");
                }
            }

        }
        catch (JSONException e) {

        }


    }
}