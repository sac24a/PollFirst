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
    CheckBox c718;
    CheckBox c719;
    CheckBox c720;
    CheckBox c721;
    CheckBox c722;
    CheckBox c723;
    CheckBox c724;
    CheckBox c81;
    CheckBox c82;
    CheckBox c83;
    CheckBox c84;
    CheckBox c85;

    CheckBox c87;
    CheckBox c88;

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
        c718 = findViewById(R.id.c718);
        c719 = findViewById(R.id.c719);
        c720 = findViewById(R.id.c720);
        c721 = findViewById(R.id.c721);
        c722 = findViewById(R.id.c722);
        c723 = findViewById(R.id.c723);
        c724 = findViewById(R.id.c724);

        c81 = findViewById(R.id.c81);
        c82 = findViewById(R.id.c82);
        c83 = findViewById(R.id.c83);
        c84 = findViewById(R.id.c84);
        c85 = findViewById(R.id.c85);


        c87 = findViewById(R.id.c87);
        c88 = findViewById(R.id.c88);

        c810 = findViewById(R.id.c810);
        c811 = findViewById(R.id.c811);

        c41.setOnCheckedChangeListener(this);
        c42.setOnCheckedChangeListener(this);
        c43.setOnCheckedChangeListener(this);
        c44.setOnCheckedChangeListener(this);
        c45.setOnCheckedChangeListener(this);
        c46.setOnCheckedChangeListener(this);

        c51.setOnCheckedChangeListener(this);
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

        c718.setOnCheckedChangeListener(this);
        c719.setOnCheckedChangeListener(this);

        c720.setOnCheckedChangeListener(this);
        c721.setOnCheckedChangeListener(this);
        c722.setOnCheckedChangeListener(this);
        c723.setOnCheckedChangeListener(this);
        c724.setOnCheckedChangeListener(this);

        c81.setOnCheckedChangeListener(this);
        c82.setOnCheckedChangeListener(this);
        c83.setOnCheckedChangeListener(this);
        c84.setOnCheckedChangeListener(this);
        c85.setOnCheckedChangeListener(this);


        c87.setOnCheckedChangeListener(this);
        c88.setOnCheckedChangeListener(this);

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
                    intent.putExtra("bjplist",getIntent().getStringArrayListExtra("bjplist"));
                    intent.putExtra("bsplist",getIntent().getStringArrayListExtra("bsplist"));
                    intent.putExtra("splist",getIntent().getStringArrayListExtra("splist"));
                    intent.putExtra("inclist",getIntent().getStringArrayListExtra("inclist"));
                    intent.putExtra("otherlist",getIntent().getStringArrayListExtra("otherlist"));
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
                            case "????????????":
                                c71.setChecked(true);
                                break;
                            case "?????????":
                                c72.setChecked(true);
                                break;
                            case "??????????????????":
                                c73.setChecked(true);
                                break;
                            case "??????????????????":
                                c74.setChecked(true);
                                break;
                            case "?????????":
                                c75.setChecked(true);
                                break;
                            case "?????????????????????":
                                c76.setChecked(true);
                                break;
                            case "???????????????":
                                c77.setChecked(true);
                                break;
                            case "???????????????":
                                c78.setChecked(true);
                                break;
                            case "????????????":
                                c79.setChecked(true);
                                break;
                            case "??????????????????":
                                c710.setChecked(true);
                                break;
                            case "????????????":
                                c711.setChecked(true);
                                break;
                            case "??????????????????/ ????????????":
                                c712.setChecked(true);
                                break;
                            case "???????????????":
                                c713.setChecked(true);
                                break;
                            case "????????????":
                                c714.setChecked(true);
                                break;
                            case "??????/ ???????????????":
                                c715.setChecked(true);
                                break;
                            case "?????????-?????????":
                                c716.setChecked(true);
                                break;
                            case "???????????????-??????????????????":
                                c717.setChecked(true);
                                break;
                            case "????????????-?????????????????????????????????":
                                c718.setChecked(true);
                                break;
                            case "????????????":
                                c719.setChecked(true);
                                break;
                            case "???????????????":
                                c720.setChecked(true);
                                break;
                            case "?????????????????????":
                                c721.setChecked(true);
                                break;
                            case "??????????????????":
                                c722.setChecked(true);
                                break;
                            case "????????????":
                                c723.setChecked(true);
                                break;
                            case "???????????? OBC":
                                c724.setChecked(true);
                                break;

                            case "????????????????????????":
                                c41.setChecked(true);
                                break;
                            case "???????????????/?????????":
                                c42.setChecked(true);
                                break;
                            case "???????????????":
                                c43.setChecked(true);
                                break;
                            case "??????????????????":
                                c44.setChecked(true);
                                break;
                            case "?????????????????????":
                                c45.setChecked(true);
                                break;
                            case "???????????? ???????????????":
                                c46.setChecked(true);
                                break;

                            case "?????????":
                                c51.setChecked(true);
                                break;

                            case "????????????":
                                c53.setChecked(true);
                                break;

                            case "????????????":
                                c81.setChecked(true);
                                break;
                            case "????????????":
                                c82.setChecked(true);
                                break;
                            case "????????????":
                                c83.setChecked(true);
                                break;
                            case "????????????":
                                c84.setChecked(true);
                                break;
                            case "????????????????????????":
                                c85.setChecked(true);
                                break;
                            case "????????????":
                                c87.setChecked(true);
                                break;
                            case "????????????":
                                c88.setChecked(true);
                                break;

                            case "?????????":
                                c810.setChecked(true);
                                break;
                            case "???????????? ?????????. ??????.":
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
                    jsonObject.put("category","1");

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
                    jsonObject.put("category","2");

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
                    jsonObject.put("category","3");

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
                    jsonObject.put("category","4");

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
                    jsonObject.put("category","5");

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
                    jsonObject.put("category","6");

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
                    c718.setChecked(false);
                    c719.setChecked(false);
                    c720.setChecked(false);
                    c721.setChecked(false);
                    c722.setChecked(false);
                    c723.setChecked(false);
                    c724.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());
                    jsonObject.put("category","11");

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
                    c718.setChecked(false);
                    c719.setChecked(false);
                    c720.setChecked(false);
                    c721.setChecked(false);
                    c722.setChecked(false);
                    c723.setChecked(false);
                    c724.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());
                    jsonObject.put("category","12");

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
                    c718.setChecked(false);
                    c719.setChecked(false);
                    c720.setChecked(false);
                    c721.setChecked(false);
                    c722.setChecked(false);
                    c723.setChecked(false);
                    c724.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());
                    jsonObject.put("category","13");

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
                    c718.setChecked(false);
                    c719.setChecked(false);
                    c720.setChecked(false);
                    c721.setChecked(false);
                    c722.setChecked(false);
                    c723.setChecked(false);
                    c724.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());
                    jsonObject.put("category","14");

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
                    c718.setChecked(false);
                    c719.setChecked(false);
                    c720.setChecked(false);
                    c721.setChecked(false);
                    c722.setChecked(false);
                    c723.setChecked(false);
                    c724.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());
                    jsonObject.put("category","15");

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
                    c718.setChecked(false);
                    c719.setChecked(false);
                    c720.setChecked(false);
                    c721.setChecked(false);
                    c722.setChecked(false);
                    c723.setChecked(false);
                    c724.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());
                    jsonObject.put("category","16");

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
                    c718.setChecked(false);
                    c719.setChecked(false);
                    c720.setChecked(false);
                    c721.setChecked(false);
                    c722.setChecked(false);
                    c723.setChecked(false);
                    c724.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());
                    jsonObject.put("category","17");

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
                    c718.setChecked(false);
                    c719.setChecked(false);
                    c720.setChecked(false);
                    c721.setChecked(false);
                    c722.setChecked(false);
                    c723.setChecked(false);
                    c724.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());
                    jsonObject.put("category","18");

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
                    c718.setChecked(false);
                    c719.setChecked(false);
                    c720.setChecked(false);
                    c721.setChecked(false);
                    c722.setChecked(false);
                    c723.setChecked(false);
                    c724.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());
                    jsonObject.put("category","19");

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
                    c718.setChecked(false);
                    c719.setChecked(false);
                    c720.setChecked(false);
                    c721.setChecked(false);
                    c722.setChecked(false);
                    c723.setChecked(false);
                    c724.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());
                    jsonObject.put("category","20");

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
                    c718.setChecked(false);
                    c719.setChecked(false);
                    c720.setChecked(false);
                    c721.setChecked(false);
                    c722.setChecked(false);
                    c723.setChecked(false);
                    c724.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());
                    jsonObject.put("category","21");

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
                    c718.setChecked(false);
                    c719.setChecked(false);
                    c720.setChecked(false);
                    c721.setChecked(false);
                    c722.setChecked(false);
                    c723.setChecked(false);
                    c724.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());
                    jsonObject.put("category","22");

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
                    c718.setChecked(false);
                    c719.setChecked(false);
                    c720.setChecked(false);
                    c721.setChecked(false);
                    c722.setChecked(false);
                    c723.setChecked(false);
                    c724.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());
                    jsonObject.put("category","23");

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
                    c718.setChecked(false);
                    c719.setChecked(false);
                    c720.setChecked(false);
                    c721.setChecked(false);
                    c722.setChecked(false);
                    c723.setChecked(false);
                    c724.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());
                    jsonObject.put("category","24");

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
                    c718.setChecked(false);
                    c719.setChecked(false);
                    c720.setChecked(false);
                    c721.setChecked(false);
                    c722.setChecked(false);
                    c723.setChecked(false);
                    c724.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());
                    jsonObject.put("category","25");

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
                    c718.setChecked(false);
                    c719.setChecked(false);
                    c720.setChecked(false);
                    c721.setChecked(false);
                    c722.setChecked(false);
                    c723.setChecked(false);
                    c724.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());
                    jsonObject.put("category","26");

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
                    c718.setChecked(false);
                    c719.setChecked(false);
                    c720.setChecked(false);
                    c721.setChecked(false);
                    c722.setChecked(false);
                    c723.setChecked(false);
                    c724.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());
                    jsonObject.put("category","27");

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c718) {
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
                    c719.setChecked(false);
                    c720.setChecked(false);
                    c721.setChecked(false);
                    c722.setChecked(false);
                    c723.setChecked(false);
                    c724.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());
                    jsonObject.put("category","28");

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c719) {
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
                    c718.setChecked(false);

                    c720.setChecked(false);
                    c721.setChecked(false);
                    c722.setChecked(false);
                    c723.setChecked(false);
                    c724.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());
                    jsonObject.put("category","29");

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c720) {
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
                    c718.setChecked(false);
                    c719.setChecked(false);

                    c721.setChecked(false);
                    c722.setChecked(false);
                    c723.setChecked(false);
                    c724.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());
                    jsonObject.put("category","30");

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c721) {
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
                    c718.setChecked(false);
                    c719.setChecked(false);
                    c720.setChecked(false);

                    c722.setChecked(false);
                    c723.setChecked(false);
                    c724.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());
                    jsonObject.put("category","31");

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c722) {
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
                    c718.setChecked(false);
                    c719.setChecked(false);
                    c720.setChecked(false);
                    c721.setChecked(false);
                    c723.setChecked(false);
                    c724.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());
                    jsonObject.put("category","32");

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c723) {
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
                    c718.setChecked(false);
                    c719.setChecked(false);
                    c720.setChecked(false);
                    c721.setChecked(false);
                    c722.setChecked(false);
                    c724.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());
                    jsonObject.put("category","33");

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c724) {
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
                    c718.setChecked(false);
                    c719.setChecked(false);
                    c720.setChecked(false);
                    c721.setChecked(false);
                    c722.setChecked(false);
                    c723.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());
                    jsonObject.put("category","34");

                }
                else {
                    jsonObject.remove("category");
                }
            }
            else if (compoundButton.getId() == R.id.c51) {
                if (compoundButton.isChecked()) {

                    c53.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());
                    jsonObject.put("category","63");

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
                    c87.setChecked(false);
                    c88.setChecked(false);
                    c810.setChecked(false);
                    c811.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());
                    jsonObject.put("category","41");

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

                    c87.setChecked(false);
                    c88.setChecked(false);

                    c810.setChecked(false);
                    c811.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());
                    jsonObject.put("category","42");

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

                    c87.setChecked(false);
                    c88.setChecked(false);

                    c810.setChecked(false);
                    c811.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());
                    jsonObject.put("category","43");

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

                    c87.setChecked(false);
                    c88.setChecked(false);

                    c810.setChecked(false);
                    c811.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());
                    jsonObject.put("category","44");

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

                    c87.setChecked(false);
                    c88.setChecked(false);

                    c810.setChecked(false);
                    c811.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());
                    jsonObject.put("category","45");

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
                    c81.setChecked(false);
                    c88.setChecked(false);
                    c810.setChecked(false);
                    c811.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());
                    jsonObject.put("category","45");

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

                    c87.setChecked(false);
                    c81.setChecked(false);

                    c810.setChecked(false);
                    c811.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());
                    jsonObject.put("category","46");

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

                    c87.setChecked(false);
                    c88.setChecked(false);

                    c81.setChecked(false);
                    c811.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());
                    jsonObject.put("category","48");

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

                    c87.setChecked(false);
                    c88.setChecked(false);

                    c810.setChecked(false);
                    c81.setChecked(false);
                    jsonObject.put("category",compoundButton.getText());
                    jsonObject.put("category","50");

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