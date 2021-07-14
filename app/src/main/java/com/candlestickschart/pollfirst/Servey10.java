package com.candlestickschart.pollfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

public class Servey10 extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{

    CheckBox c41;
    CheckBox c42;
    CheckBox c43;
    CheckBox c44;
    CheckBox c45;
    CheckBox c46;

    CheckBox c51;
    CheckBox c52;
    CheckBox c53;
    

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
    CheckBox c716;
    CheckBox c717;

    CheckBox c81;
    CheckBox c82;
    CheckBox c83;
    CheckBox c84;
    CheckBox c85;
    CheckBox c86;
    CheckBox c87;
    CheckBox c88;
    CheckBox c89;
    CheckBox c810;
    CheckBox c811;

    LinearLayout general;
    LinearLayout obc;
    LinearLayout sc;
    LinearLayout others;

    Button forward;
    Button backward;
    JSONObject jsonObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servey10);


        try {
            jsonObject = new JSONObject(getIntent().getStringExtra("json"));
        } catch (JSONException e) {
            e.printStackTrace();
        }

        general = findViewById(R.id.general);
        obc = findViewById(R.id.obc);
        sc = findViewById(R.id.sc);
        others = findViewById(R.id.other);
        if (getIntent().getStringExtra("cat").equals("general")) {
            general.setVisibility(View.VISIBLE);
            obc.setVisibility(View.GONE);
            sc.setVisibility(View.GONE);
            others.setVisibility(View.GONE);
        }
        else if (getIntent().getStringExtra("cat").equals("obc")) {
            general.setVisibility(View.GONE);
            obc.setVisibility(View.VISIBLE);
            sc.setVisibility(View.GONE);
            others.setVisibility(View.GONE);
        }
        else if (getIntent().getStringExtra("cat").equals("sc")) {
            general.setVisibility(View.GONE);
            obc.setVisibility(View.GONE);
            sc.setVisibility(View.VISIBLE);
            others.setVisibility(View.GONE);
        }
        else if (getIntent().getStringExtra("cat").equals("other")) {
            general.setVisibility(View.GONE);
            obc.setVisibility(View.GONE);
            sc.setVisibility(View.GONE);
            others.setVisibility(View.VISIBLE);
        }
        c41 = findViewById(R.id.c41);
        c42 = findViewById(R.id.c42);
        c43 = findViewById(R.id.c43);
        c44 = findViewById(R.id.c44);
        c45 = findViewById(R.id.c45);
        c46 = findViewById(R.id.c46);

        c51 = findViewById(R.id.c51);
        c52 = findViewById(R.id.c52);
        c53 = findViewById(R.id.c53);
        

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
        c716 = findViewById(R.id.c716);
        c717 = findViewById(R.id.c717);

        c81 = findViewById(R.id.c81);
        c82 = findViewById(R.id.c82);
        c83 = findViewById(R.id.c83);
        c84 = findViewById(R.id.c84);
        c85 = findViewById(R.id.c85);
        c86 = findViewById(R.id.c86);

        c87 = findViewById(R.id.c87);
        c88 = findViewById(R.id.c88);
        c89 = findViewById(R.id.c89);
        c810 = findViewById(R.id.c810);
        c811 = findViewById(R.id.c811);

        c41.setOnCheckedChangeListener(this);
        c42.setOnCheckedChangeListener(this);
        c43.setOnCheckedChangeListener(this);
        c44.setOnCheckedChangeListener(this);
        c45.setOnCheckedChangeListener(this);
        c46.setOnCheckedChangeListener(this);

        c51.setOnCheckedChangeListener(this);
        c52.setOnCheckedChangeListener(this);
        c53.setOnCheckedChangeListener(this);


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
        c714.setOnCheckedChangeListener(this);
        c715.setOnCheckedChangeListener(this);
        c716.setOnCheckedChangeListener(this);
        c717.setOnCheckedChangeListener(this);

        c81.setOnCheckedChangeListener(this);
        c82.setOnCheckedChangeListener(this);
        c83.setOnCheckedChangeListener(this);
        c84.setOnCheckedChangeListener(this);
        c85.setOnCheckedChangeListener(this);
        c86.setOnCheckedChangeListener(this);

        c87.setOnCheckedChangeListener(this);
        c88.setOnCheckedChangeListener(this);
        c89.setOnCheckedChangeListener(this);
        c810.setOnCheckedChangeListener(this);

        c811.setOnCheckedChangeListener(this);

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
                if (jsonObject.has("category")) {
                    Intent intent = new Intent(Servey10.this,Servey11.class);
                    intent.putExtra("json",jsonObject.toString());
                    startActivity(intent);
                }
                else {
                    Toast.makeText(Servey10.this,"Please check Category",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    public void checkforUpdate(){
        try {

                try {
                    jsonObject = new JSONObject(getIntent().getStringExtra("json"));

                    if (jsonObject.has("category")) {
                        switch (jsonObject.get("category").toString()) {
                            case "यादव":
                                c71.setChecked(true);
                                break;
                            case "जाट":
                                c72.setChecked(true);
                                break;
                            case "गुर्जर":
                                c73.setChecked(true);
                                break;
                            case "कुर्मी":
                                c74.setChecked(true);
                                break;
                            case "लोध":
                                c75.setChecked(true);
                                break;
                            case "कुम्हार":
                                c76.setChecked(true);
                                break;
                            case "कोईरी":
                                c77.setChecked(true);
                                break;
                            case "मौर्य":
                                c78.setChecked(true);
                                break;
                            case "काछी":
                                c79.setChecked(true);
                                break;
                            case "गडरिया":
                                c710.setChecked(true);
                                break;
                            case "तेली":
                                c711.setChecked(true);
                                break;
                            case "मल्लाह":
                                c712.setChecked(true);
                                break;
                            case "सुनार":
                                c713.setChecked(true);
                                break;
                            case "सैनी":
                                c714.setChecked(true);
                                break;
                            case "भर/ राजभर":
                                c715.setChecked(true);
                                break;
                            case "बींद":
                                c716.setChecked(true);
                                break;
                            case "अन्य ओबीसी":
                                c717.setChecked(true);
                                break;

                            case "ब्राह्मण":
                                c41.setChecked(true);
                                break;
                            case "बनीया/जैन":
                                c42.setChecked(true);
                                break;
                            case "ठाकुर":
                                c43.setChecked(true);
                                break;
                            case "कायस्थ":
                                c44.setChecked(true);
                                break;
                            case "भूमिहार":
                                c45.setChecked(true);
                                break;
                            case "अन्य सवर्ण":
                                c46.setChecked(true);
                                break;

                            case "सिख":
                                c51.setChecked(true);
                                break;
                            case "ईसाई":
                                c52.setChecked(true);
                                break;
                            case "अन्य":
                                c53.setChecked(true);
                                break;

                            case "जाटव":
                                c81.setChecked(true);
                                break;
                            case "पासी":
                                c82.setChecked(true);
                                break;
                            case "धोबी":
                                c83.setChecked(true);
                                break;
                            case "कोरी":
                                c84.setChecked(true);
                                break;
                            case "वाल्मिकी":
                                c85.setChecked(true);
                                break;
                            case "नट":
                                c86.setChecked(true);
                                break;
                            case "खटिक":
                                c87.setChecked(true);
                                break;
                            case "गोंड":
                                c88.setChecked(true);
                                break;
                            case "धानुक":
                                c89.setChecked(true);
                                break;
                            case "डोम":
                                c810.setChecked(true);
                                break;
                            case "अन्य अनु. जा.":
                                c811.setChecked(true);
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
                if (compoundButton.isChecked()) {
                    c42.setChecked(false);
                    c43.setChecked(false);
                    c44.setChecked(false);
                    c45.setChecked(false);
                    c46.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c42) {
                if (compoundButton.isChecked()) {
                    c41.setChecked(false);
                    c43.setChecked(false);
                    c44.setChecked(false);
                    c45.setChecked(false);
                    c46.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c43) {
                if (compoundButton.isChecked()) {
                    c41.setChecked(false);
                    c42.setChecked(false);
                    c44.setChecked(false);
                    c45.setChecked(false);
                    c46.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c44) {
                if (compoundButton.isChecked()) {
                    c41.setChecked(false);
                    c43.setChecked(false);
                    c42.setChecked(false);
                    c45.setChecked(false);
                    c46.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c45) {
                if (compoundButton.isChecked()) {
                    c41.setChecked(false);
                    c43.setChecked(false);
                    c44.setChecked(false);
                    c42.setChecked(false);
                    c46.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c46) {
                if (compoundButton.isChecked()) {
                    c41.setChecked(false);
                    c43.setChecked(false);
                    c44.setChecked(false);
                    c45.setChecked(false);
                    c42.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c71) {
                if (compoundButton.isChecked()) {
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
                    c716.setChecked(false);
                    c717.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
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
                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);
                    c711.setChecked(false);
                    c712.setChecked(false);
                    c713.setChecked(false);
                    c714.setChecked(false);
                    c715.setChecked(false);
                    c716.setChecked(false);
                    c717.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
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
                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);
                    c711.setChecked(false);
                    c712.setChecked(false);
                    c713.setChecked(false);
                    c714.setChecked(false);
                    c715.setChecked(false);
                    c716.setChecked(false);
                    c717.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
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
                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);
                    c711.setChecked(false);
                    c712.setChecked(false);
                    c713.setChecked(false);
                    c714.setChecked(false);
                    c715.setChecked(false);
                    c716.setChecked(false);
                    c717.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
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
                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);
                    c711.setChecked(false);
                    c712.setChecked(false);
                    c713.setChecked(false);
                    c714.setChecked(false);
                    c715.setChecked(false);
                    c716.setChecked(false);
                    c717.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
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
                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);
                    c711.setChecked(false);
                    c712.setChecked(false);
                    c713.setChecked(false);
                    c714.setChecked(false);
                    c715.setChecked(false);
                    c716.setChecked(false);
                    c717.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
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
                    c79.setChecked(false);
                    c710.setChecked(false);
                    c711.setChecked(false);
                    c712.setChecked(false);
                    c713.setChecked(false);
                    c714.setChecked(false);
                    c715.setChecked(false);
                    c716.setChecked(false);
                    c717.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c78) {
                if (compoundButton.isChecked()) {
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
                    c716.setChecked(false);
                    c717.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c79) {
                if (compoundButton.isChecked()) {
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
                    c716.setChecked(false);
                    c717.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c710) {
                if (compoundButton.isChecked()) {
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
                    c716.setChecked(false);
                    c717.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c711) {
                if (compoundButton.isChecked()) {
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
                    c716.setChecked(false);
                    c717.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c712) {
                if (compoundButton.isChecked()) {
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
                    c716.setChecked(false);
                    c717.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c713) {
                if (compoundButton.isChecked()) {
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
                    c716.setChecked(false);
                    c717.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c714) {
                if (compoundButton.isChecked()) {
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
                    c716.setChecked(false);
                    c717.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c715) {
                if (compoundButton.isChecked()) {
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
                    c716.setChecked(false);
                    c717.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c716) {
                if (compoundButton.isChecked()) {
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
                    c715.setChecked(false);
                    c717.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c717) {
                if (compoundButton.isChecked()) {
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
                    c716.setChecked(false);
                    c715.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c51) {
                if (compoundButton.isChecked()) {
                    c52.setChecked(false);
                    c53.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c52) {
                if (compoundButton.isChecked()) {
                    c51.setChecked(false);
                    c53.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c53) {
                if (compoundButton.isChecked()) {
                    c52.setChecked(false);
                    c51.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
                }
            }

            else if (compoundButton.getId() == R.id.c81) {
                if (compoundButton.isChecked()) {
                    c82.setChecked(false);
                    c83.setChecked(false);
                    c84.setChecked(false);
                    c85.setChecked(false);
                    c86.setChecked(false);
                    c87.setChecked(false);
                    c88.setChecked(false);
                    c89.setChecked(false);
                    c810.setChecked(false);
                    c811.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c82) {
                if (compoundButton.isChecked()) {
                    c81.setChecked(false);
                    c83.setChecked(false);
                    c84.setChecked(false);
                    c85.setChecked(false);
                    c86.setChecked(false);
                    c87.setChecked(false);
                    c88.setChecked(false);
                    c89.setChecked(false);
                    c810.setChecked(false);
                    c811.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c83) {
                if (compoundButton.isChecked()) {
                    c82.setChecked(false);
                    c81.setChecked(false);
                    c84.setChecked(false);
                    c85.setChecked(false);
                    c86.setChecked(false);
                    c87.setChecked(false);
                    c88.setChecked(false);
                    c89.setChecked(false);
                    c810.setChecked(false);
                    c811.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c84) {
                if (compoundButton.isChecked()) {
                    c82.setChecked(false);
                    c83.setChecked(false);
                    c81.setChecked(false);
                    c85.setChecked(false);
                    c86.setChecked(false);
                    c87.setChecked(false);
                    c88.setChecked(false);
                    c89.setChecked(false);
                    c810.setChecked(false);
                    c811.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c85) {
                if (compoundButton.isChecked()) {
                    c82.setChecked(false);
                    c83.setChecked(false);
                    c84.setChecked(false);
                    c81.setChecked(false);
                    c86.setChecked(false);
                    c87.setChecked(false);
                    c88.setChecked(false);
                    c89.setChecked(false);
                    c810.setChecked(false);
                    c811.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c86) {
                if (compoundButton.isChecked()) {
                    c82.setChecked(false);
                    c83.setChecked(false);
                    c84.setChecked(false);
                    c85.setChecked(false);
                    c81.setChecked(false);
                    c87.setChecked(false);
                    c88.setChecked(false);
                    c89.setChecked(false);
                    c810.setChecked(false);
                    c811.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c87) {
                if (compoundButton.isChecked()) {
                    c82.setChecked(false);
                    c83.setChecked(false);
                    c84.setChecked(false);
                    c85.setChecked(false);
                    c86.setChecked(false);
                    c81.setChecked(false);
                    c88.setChecked(false);
                    c89.setChecked(false);
                    c810.setChecked(false);
                    c811.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c88) {
                if (compoundButton.isChecked()) {
                    c82.setChecked(false);
                    c83.setChecked(false);
                    c84.setChecked(false);
                    c85.setChecked(false);
                    c86.setChecked(false);
                    c87.setChecked(false);
                    c81.setChecked(false);
                    c89.setChecked(false);
                    c810.setChecked(false);
                    c811.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c89) {
                if (compoundButton.isChecked()) {
                    c82.setChecked(false);
                    c83.setChecked(false);
                    c84.setChecked(false);
                    c85.setChecked(false);
                    c86.setChecked(false);
                    c87.setChecked(false);
                    c88.setChecked(false);
                    c81.setChecked(false);
                    c810.setChecked(false);
                    c811.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
                }
            }

            else if (compoundButton.getId() == R.id.c810) {
                if (compoundButton.isChecked()) {
                    c82.setChecked(false);
                    c83.setChecked(false);
                    c84.setChecked(false);
                    c85.setChecked(false);
                    c86.setChecked(false);
                    c87.setChecked(false);
                    c88.setChecked(false);
                    c89.setChecked(false);
                    c81.setChecked(false);
                    c811.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c811) {
                if (compoundButton.isChecked()) {
                    c82.setChecked(false);
                    c83.setChecked(false);
                    c84.setChecked(false);
                    c85.setChecked(false);
                    c86.setChecked(false);
                    c87.setChecked(false);
                    c88.setChecked(false);
                    c89.setChecked(false);
                    c810.setChecked(false);
                    c81.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());

                }
                else {
                    jsonObject.remove("category");
                }
            }
        }
        catch (JSONException e) {

        }

    }
}