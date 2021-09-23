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

import java.util.ArrayList;

public class Servey17 extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{
    CheckBox c71;
    CheckBox c72;
    CheckBox c73;
    CheckBox c74;
    CheckBox c75;
    CheckBox c76;

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
    CheckBox c725;

    CheckBox c726;
    CheckBox c727;
    CheckBox c728;
    CheckBox c729;
    CheckBox c730;
    CheckBox c731;


    Button forward;
    Button backward;
    JSONObject jsonObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servey17);


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
        c725 = findViewById(R.id.c725);



        c726 = findViewById(R.id.c726);
        c727 = findViewById(R.id.c727);
        c728 = findViewById(R.id.c728);
        c729 = findViewById(R.id.c729);
        c730 = findViewById(R.id.c730);
        c731 = findViewById(R.id.c731);


        try {
            ArrayList<String> bjplist = getIntent().getStringArrayListExtra("bjplist");
            for(int i = 0;i<bjplist.size();i++) {
                if (i==0) {
                    c71.setText(bjplist.get(i));
                }
                else if (i==1) {
                    c72.setText(bjplist.get(i));
                }
                else if (i==2) {
                    c73.setText(bjplist.get(i));
                }
                else if (i==3) {
                    c74.setText(bjplist.get(i));
                }
                else if (i==4) {
                    c75.setText(bjplist.get(i));
                }
                else if (i==5) {
                    c76.setText(bjplist.get(i));
                }
            }
            if (bjplist.size() == 0) {
                c71.setVisibility(View.GONE);
                c72.setVisibility(View.GONE);
                c73.setVisibility(View.GONE);
                c74.setVisibility(View.GONE);
                c75.setVisibility(View.GONE);
                c76.setVisibility(View.GONE);
            }
            else if (bjplist.size() == 1) {
                c72.setVisibility(View.GONE);
                c73.setVisibility(View.GONE);
                c74.setVisibility(View.GONE);
                c75.setVisibility(View.GONE);
                c76.setVisibility(View.GONE);
            }
            else if (bjplist.size() == 2) {
                c73.setVisibility(View.GONE);
                c74.setVisibility(View.GONE);
                c75.setVisibility(View.GONE);
                c76.setVisibility(View.GONE);
            }
            else if (bjplist.size() == 3) {

                c74.setVisibility(View.GONE);
                c75.setVisibility(View.GONE);
                c76.setVisibility(View.GONE);
            }
            else if (bjplist.size() == 4) {

                c75.setVisibility(View.GONE);
                c76.setVisibility(View.GONE);
            }
            else if (bjplist.size() == 5) {
                c76.setVisibility(View.GONE);
            }
            ArrayList<String>splist = getIntent().getStringArrayListExtra("splist");
            for(int i = 0;i<splist.size();i++) {
                if (i==0) {
                    c78.setText(splist.get(i));
                }
                else if (i==1) {
                    c79.setText(splist.get(i));
                }
                else if (i==2) {
                    c710.setText(splist.get(i));
                }
                else if (i==3) {
                    c711.setText(splist.get(i));
                }
                else if (i==4) {
                    c712.setText(splist.get(i));
                }
                else if (i==5) {
                    c713.setText(splist.get(i));
                }
            }
            if (splist.size() == 0) {
                c78.setVisibility(View.GONE);
                c79.setVisibility(View.GONE);
                c710.setVisibility(View.GONE);
                c711.setVisibility(View.GONE);
                c712.setVisibility(View.GONE);
                c713.setVisibility(View.GONE);
            }
            else if (splist.size() == 1) {
                c79.setVisibility(View.GONE);
                c710.setVisibility(View.GONE);
                c711.setVisibility(View.GONE);
                c712.setVisibility(View.GONE);
                c713.setVisibility(View.GONE);
            }
            else if (splist.size() == 2) {
                c710.setVisibility(View.GONE);
                c711.setVisibility(View.GONE);
                c712.setVisibility(View.GONE);
                c713.setVisibility(View.GONE);
            }
            else if (splist.size() == 3) {
                c711.setVisibility(View.GONE);
                c712.setVisibility(View.GONE);
                c713.setVisibility(View.GONE);
            }
            else if (splist.size() == 4) {
                c712.setVisibility(View.GONE);
                c713.setVisibility(View.GONE);
            }
            else if (splist.size() == 5) {
                c713.setVisibility(View.GONE);
            }
            ArrayList<String>bsplist = getIntent().getStringArrayListExtra("bsplist");
            for(int i = 0;i<bsplist.size();i++) {
                if (i==0) {
                    c714.setText(bsplist.get(i));
                }
                else if (i==1) {
                    c715.setText(bsplist.get(i));
                }
                else if (i==2) {
                    c716.setText(bsplist.get(i));
                }
                else if (i==3) {
                    c717.setText(bsplist.get(i));
                }
                else if (i==4) {
                    c718.setText(bsplist.get(i));
                }
                else if (i==5) {
                    c719.setText(bsplist.get(i));
                }
            }
            if (bsplist.size() == 0) {
                c714.setVisibility(View.GONE);
                c715.setVisibility(View.GONE);
                c716.setVisibility(View.GONE);
                c717.setVisibility(View.GONE);
                c718.setVisibility(View.GONE);
                c719.setVisibility(View.GONE);
            }
            else if (bsplist.size() == 1) {
                c715.setVisibility(View.GONE);
                c716.setVisibility(View.GONE);
                c717.setVisibility(View.GONE);
                c718.setVisibility(View.GONE);
                c719.setVisibility(View.GONE);
            }
            else if (bsplist.size() == 2) {

                c716.setVisibility(View.GONE);
                c717.setVisibility(View.GONE);
                c718.setVisibility(View.GONE);
                c719.setVisibility(View.GONE);
            }
            else if (bsplist.size() == 3) {

                c717.setVisibility(View.GONE);
                c718.setVisibility(View.GONE);
                c719.setVisibility(View.GONE);
            }
            else if (bsplist.size() == 4) {

                c718.setVisibility(View.GONE);
                c719.setVisibility(View.GONE);
            }
            else if (bsplist.size() == 5) {

                c719.setVisibility(View.GONE);
            }
            ArrayList<String>inclist = getIntent().getStringArrayListExtra("inclist");
            for(int i = 0;i<inclist.size();i++) {
                if (i==0) {
                    c720.setText(inclist.get(i));
                }
                else if (i==1) {
                    c721.setText(inclist.get(i));
                }
                else if (i==2) {
                    c722.setText(inclist.get(i));
                }
                else if (i==3) {
                    c723.setText(inclist.get(i));
                }
                else if (i==4) {
                    c724.setText(inclist.get(i));
                }
                else if (i==5) {
                    c725.setText(inclist.get(i));
                }
            }
            if (inclist.size() == 0) {
                c720.setVisibility(View.GONE);
                c721.setVisibility(View.GONE);
                c722.setVisibility(View.GONE);
                c723.setVisibility(View.GONE);
                c724.setVisibility(View.GONE);
                c725.setVisibility(View.GONE);
            }
            else if (inclist.size() == 1) {

                c721.setVisibility(View.GONE);
                c722.setVisibility(View.GONE);
                c723.setVisibility(View.GONE);
                c724.setVisibility(View.GONE);
                c725.setVisibility(View.GONE);
            }
            else if (inclist.size() == 2) {

                c722.setVisibility(View.GONE);
                c723.setVisibility(View.GONE);
                c724.setVisibility(View.GONE);
                c725.setVisibility(View.GONE);
            }
            else if (inclist.size() == 3) {

                c723.setVisibility(View.GONE);
                c724.setVisibility(View.GONE);
                c725.setVisibility(View.GONE);
            }
            else if (inclist.size() == 4) {

                c724.setVisibility(View.GONE);
                c725.setVisibility(View.GONE);
            }
            else if (inclist.size() == 5) {
                c725.setVisibility(View.GONE);
            }
            ArrayList<String>otherlist = getIntent().getStringArrayListExtra("otherlist");
            for(int i = 0;i<otherlist.size();i++) {
                if (i==0) {
                    c726.setText(otherlist.get(i));
                }
                else if (i==1) {
                    c727.setText(otherlist.get(i));
                }
                else if (i==2) {
                    c728.setText(otherlist.get(i));
                }
                else if (i==3) {
                    c729.setText(otherlist.get(i));
                }
                else if (i==4) {
                    c730.setText(otherlist.get(i));
                }
                else if (i==5) {
                    c731.setText(otherlist.get(i));
                }
            }
            if (otherlist.size() == 0) {
                c726.setVisibility(View.GONE);
                c727.setVisibility(View.GONE);
                c728.setVisibility(View.GONE);
                c729.setVisibility(View.GONE);
                c730.setVisibility(View.GONE);
//                c731.setVisibility(View.GONE);
            }
            else if (otherlist.size() == 1) {
                c727.setVisibility(View.GONE);
                c728.setVisibility(View.GONE);
                c729.setVisibility(View.GONE);
                c730.setVisibility(View.GONE);
//                c731.setVisibility(View.GONE);
            }
            else if (otherlist.size() == 2) {

                c728.setVisibility(View.GONE);
                c729.setVisibility(View.GONE);
                c730.setVisibility(View.GONE);
//                c731.setVisibility(View.GONE);
            }
            else if (otherlist.size() == 3) {

                c729.setVisibility(View.GONE);
                c730.setVisibility(View.GONE);
//                c731.setVisibility(View.GONE);
            }
            else if (otherlist.size() == 4) {

                c730.setVisibility(View.GONE);
//                c731.setVisibility(View.GONE);
            }
            else if (otherlist.size() == 5) {

//                c731.setVisibility(View.GONE);
            }
        }
        catch (NullPointerException e) {
            c71.setVisibility(View.GONE);
            c72.setVisibility(View.GONE);
            c73.setVisibility(View.GONE);
            c74.setVisibility(View.GONE);
            c75.setVisibility(View.GONE);
            c76.setVisibility(View.GONE);
            c78.setVisibility(View.GONE);
            c79.setVisibility(View.GONE);
            c710.setVisibility(View.GONE);
            c711.setVisibility(View.GONE);
            c712.setVisibility(View.GONE);
            c713.setVisibility(View.GONE);
            c714.setVisibility(View.GONE);
            c715.setVisibility(View.GONE);
            c716.setVisibility(View.GONE);
            c717.setVisibility(View.GONE);
            c718.setVisibility(View.GONE);
            c719.setVisibility(View.GONE);
            c720.setVisibility(View.GONE);
            c721.setVisibility(View.GONE);
            c722.setVisibility(View.GONE);
            c723.setVisibility(View.GONE);
            c724.setVisibility(View.GONE);
            c725.setVisibility(View.GONE);
            c726.setVisibility(View.GONE);
            c727.setVisibility(View.GONE);
            c728.setVisibility(View.GONE);
            c729.setVisibility(View.GONE);
            c730.setVisibility(View.GONE);
        }

        c71.setOnCheckedChangeListener(this);
        c72.setOnCheckedChangeListener(this);
        c73.setOnCheckedChangeListener(this);
        c74.setOnCheckedChangeListener(this);
        c75.setOnCheckedChangeListener(this);
        c76.setOnCheckedChangeListener(this);


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
        c725.setOnCheckedChangeListener(this);

        c726.setOnCheckedChangeListener(this);
        c727.setOnCheckedChangeListener(this);
        c728.setOnCheckedChangeListener(this);
        c729.setOnCheckedChangeListener(this);
        c730.setOnCheckedChangeListener(this);
        c731.setOnCheckedChangeListener(this);


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

                if (jsonObject.has("q_18")) {
                    Intent intent = new Intent(Servey17.this,Servey9.class);
                    intent.putExtra("json",jsonObject.toString());
                    intent.putExtra("bjplist",getIntent().getStringArrayListExtra("bjplist"));
                    intent.putExtra("bsplist",getIntent().getStringArrayListExtra("bsplist"));
                    intent.putExtra("splist",getIntent().getStringArrayListExtra("splist"));
                    intent.putExtra("inclist",getIntent().getStringArrayListExtra("inclist"));
                    intent.putExtra("otherlist",getIntent().getStringArrayListExtra("otherlist"));
                    startActivity(intent);
                }
                else {
                    Toast.makeText(Servey17.this,"Please check Q-19",Toast.LENGTH_SHORT).show();
                }


            }
        });
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
                    c725.setChecked(false);
                    c726.setChecked(false);
                    c727.setChecked(false);
                    c728.setChecked(false);
                    c729.setChecked(false);
                    c730.setChecked(false);
                    c731.setChecked(false);

                    jsonObject.put("q_18",compoundButton.getText());
//                    jsonObject.put("q_18","0");

                }
                else {
                    jsonObject.remove("q_18");
                }
            }
            else if (compoundButton.getId() == R.id.c72) {
                if (compoundButton.isChecked()) {
                    c71.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
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
                    c725.setChecked(false);
                    c726.setChecked(false);
                    c727.setChecked(false);
                    c728.setChecked(false);
                    c729.setChecked(false);
                    c730.setChecked(false);
                    c731.setChecked(false);

                    jsonObject.put("q_18",compoundButton.getText());
//                    jsonObject.put("q_18","0");

                }
                else {
                    jsonObject.remove("q_18");
                }
            }
            else if (compoundButton.getId() == R.id.c73) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c71.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
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
                    c725.setChecked(false);
                    c726.setChecked(false);
                    c727.setChecked(false);
                    c728.setChecked(false);
                    c729.setChecked(false);
                    c730.setChecked(false);
                    c731.setChecked(false);

                    jsonObject.put("q_18",compoundButton.getText());
//                    jsonObject.put("q_18","0");

                }
                else {
                    jsonObject.remove("q_18");
                }
            }
            else if (compoundButton.getId() == R.id.c74) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c71.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
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
                    c725.setChecked(false);
                    c726.setChecked(false);
                    c727.setChecked(false);
                    c728.setChecked(false);
                    c729.setChecked(false);
                    c730.setChecked(false);
                    c731.setChecked(false);

                    jsonObject.put("q_18",compoundButton.getText());
//                    jsonObject.put("q_18","0");

                }
                else {
                    jsonObject.remove("q_18");
                }
            }
            else if (compoundButton.getId() == R.id.c75) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c71.setChecked(false);
                    c76.setChecked(false);
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
                    c725.setChecked(false);
                    c726.setChecked(false);
                    c727.setChecked(false);
                    c728.setChecked(false);
                    c729.setChecked(false);
                    c730.setChecked(false);
                    c731.setChecked(false);

                    jsonObject.put("q_18",compoundButton.getText());
//                    jsonObject.put("q_18","0");

                }
                else {
                    jsonObject.remove("q_18");
                }
            }
            else if (compoundButton.getId() == R.id.c76) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
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
                    c725.setChecked(false);
                    c726.setChecked(false);
                    c727.setChecked(false);
                    c728.setChecked(false);
                    c729.setChecked(false);
                    c730.setChecked(false);
                    c731.setChecked(false);

                    jsonObject.put("q_18",compoundButton.getText());
//                    jsonObject.put("q_18","0");

                }
                else {
                    jsonObject.remove("q_18");
                }
            }
            else if (compoundButton.getId() == R.id.c78) {
                if (compoundButton.isChecked()) {

                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
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
                    c725.setChecked(false);
                    c726.setChecked(false);
                    c727.setChecked(false);
                    c728.setChecked(false);
                    c729.setChecked(false);
                    c730.setChecked(false);
                    c731.setChecked(false);

                    jsonObject.put("q_18",compoundButton.getText());
//                    jsonObject.put("q_18","0");

                }
                else {
                    jsonObject.remove("q_18");
                }
            }
            else if (compoundButton.getId() == R.id.c79) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
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
                    c725.setChecked(false);
                    c726.setChecked(false);
                    c727.setChecked(false);
                    c728.setChecked(false);
                    c729.setChecked(false);
                    c730.setChecked(false);
                    c731.setChecked(false);

                    jsonObject.put("q_18",compoundButton.getText());
//                    jsonObject.put("q_18","0");

                }
                else {
                    jsonObject.remove("q_18");
                }
            }
            else if (compoundButton.getId() == R.id.c710) {
                if (compoundButton.isChecked()) {

                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
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
                    c725.setChecked(false);
                    c726.setChecked(false);
                    c727.setChecked(false);
                    c728.setChecked(false);
                    c729.setChecked(false);
                    c730.setChecked(false);
                    c731.setChecked(false);
                    jsonObject.put("q_18",compoundButton.getText());
//                    jsonObject.put("q_18","0");

                }
                else {
                    jsonObject.remove("q_18");
                }
            }
            else if (compoundButton.getId() == R.id.c711) {
                if (compoundButton.isChecked()) {

                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
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
                    c725.setChecked(false);
                    c726.setChecked(false);
                    c727.setChecked(false);
                    c728.setChecked(false);
                    c729.setChecked(false);
                    c730.setChecked(false);
                    c731.setChecked(false);

                    jsonObject.put("q_18",compoundButton.getText());
//                    jsonObject.put("q_18","0");

                }
                else {
                    jsonObject.remove("q_18");
                }
            }
            else if (compoundButton.getId() == R.id.c712) {
                if (compoundButton.isChecked()) {

                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
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
                    c725.setChecked(false);
                    c726.setChecked(false);
                    c727.setChecked(false);
                    c728.setChecked(false);
                    c729.setChecked(false);
                    c730.setChecked(false);
                    c731.setChecked(false);

                    jsonObject.put("q_18",compoundButton.getText());
//                    jsonObject.put("q_18","0");

                }
                else {
                    jsonObject.remove("q_18");
                }
            }
            else if (compoundButton.getId() == R.id.c713) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
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
                    c725.setChecked(false);
                    c726.setChecked(false);
                    c727.setChecked(false);
                    c728.setChecked(false);
                    c729.setChecked(false);
                    c730.setChecked(false);
                    c731.setChecked(false);


                    jsonObject.put("q_18",compoundButton.getText());
//                    jsonObject.put("q_18","0");

                }
                else {
                    jsonObject.remove("q_18");
                }
            }
            else if (compoundButton.getId() == R.id.c714) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);
                    c711.setChecked(false);
                    c712.setChecked(false);
                    c71.setChecked(false);
                    c713.setChecked(false);
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
                    c725.setChecked(false);
                    c726.setChecked(false);
                    c727.setChecked(false);
                    c728.setChecked(false);
                    c729.setChecked(false);
                    c730.setChecked(false);
                    c731.setChecked(false);


                    jsonObject.put("q_18",compoundButton.getText());
//                    jsonObject.put("q_18","0");

                }
                else {
                    jsonObject.remove("q_18");
                }
            }
            else if (compoundButton.getId() == R.id.c715) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);
                    c711.setChecked(false);
                    c712.setChecked(false);
                    c71.setChecked(false);
                    c714.setChecked(false);
                    c713.setChecked(false);
                    c716.setChecked(false);
                    c717.setChecked(false);
                    c718.setChecked(false);
                    c719.setChecked(false);
                    c720.setChecked(false);
                    c721.setChecked(false);
                    c722.setChecked(false);
                    c723.setChecked(false);
                    c724.setChecked(false);
                    c725.setChecked(false);
                    c726.setChecked(false);
                    c727.setChecked(false);
                    c728.setChecked(false);
                    c729.setChecked(false);
                    c730.setChecked(false);
                    c731.setChecked(false);


                    jsonObject.put("q_18",compoundButton.getText());
//                    jsonObject.put("q_18","0");

                }
                else {
                    jsonObject.remove("q_18");
                }
            }
            else if (compoundButton.getId() == R.id.c716) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);
                    c711.setChecked(false);
                    c712.setChecked(false);
                    c71.setChecked(false);
                    c714.setChecked(false);
                    c715.setChecked(false);
                    c713.setChecked(false);
                    c717.setChecked(false);
                    c718.setChecked(false);
                    c719.setChecked(false);
                    c720.setChecked(false);
                    c721.setChecked(false);
                    c722.setChecked(false);
                    c723.setChecked(false);
                    c724.setChecked(false);
                    c725.setChecked(false);
                    c726.setChecked(false);
                    c727.setChecked(false);
                    c728.setChecked(false);
                    c729.setChecked(false);
                    c730.setChecked(false);
                    c731.setChecked(false);


                    jsonObject.put("q_18",compoundButton.getText());
//                    jsonObject.put("q_18","0");

                }
                else {
                    jsonObject.remove("q_18");
                }
            }
            else if (compoundButton.getId() == R.id.c717) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);
                    c711.setChecked(false);
                    c712.setChecked(false);
                    c71.setChecked(false);
                    c714.setChecked(false);
                    c715.setChecked(false);
                    c716.setChecked(false);
                    c713.setChecked(false);
                    c718.setChecked(false);
                    c719.setChecked(false);
                    c720.setChecked(false);
                    c721.setChecked(false);
                    c722.setChecked(false);
                    c723.setChecked(false);
                    c724.setChecked(false);
                    c725.setChecked(false);
                    c726.setChecked(false);
                    c727.setChecked(false);
                    c728.setChecked(false);
                    c729.setChecked(false);
                    c730.setChecked(false);
                    c731.setChecked(false);


                    jsonObject.put("q_18",compoundButton.getText());
//                    jsonObject.put("q_18","0");

                }
                else {
                    jsonObject.remove("q_18");
                }
            }
            else if (compoundButton.getId() == R.id.c718) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
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
                    c713.setChecked(false);
                    c719.setChecked(false);
                    c720.setChecked(false);
                    c721.setChecked(false);
                    c722.setChecked(false);
                    c723.setChecked(false);
                    c724.setChecked(false);
                    c725.setChecked(false);
                    c726.setChecked(false);
                    c727.setChecked(false);
                    c728.setChecked(false);
                    c729.setChecked(false);
                    c730.setChecked(false);
                    c731.setChecked(false);
                    jsonObject.put("q_18",compoundButton.getText());
//                    jsonObject.put("q_18","0");

                }
                else {
                    jsonObject.remove("q_18");
                }
            }
            else if (compoundButton.getId() == R.id.c719) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
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
                    c713.setChecked(false);
                    c720.setChecked(false);
                    c721.setChecked(false);
                    c722.setChecked(false);
                    c723.setChecked(false);
                    c724.setChecked(false);
                    c725.setChecked(false);
                    c726.setChecked(false);
                    c727.setChecked(false);
                    c728.setChecked(false);
                    c729.setChecked(false);
                    c730.setChecked(false);
                    c731.setChecked(false);
                    jsonObject.put("q_18",compoundButton.getText());
//                    jsonObject.put("q_18","0");

                }
                else {
                    jsonObject.remove("q_18");
                }
            }
            else if (compoundButton.getId() == R.id.c720) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
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
                    c713.setChecked(false);
                    c721.setChecked(false);
                    c722.setChecked(false);
                    c723.setChecked(false);
                    c724.setChecked(false);
                    c725.setChecked(false);
                    c726.setChecked(false);
                    c727.setChecked(false);
                    c728.setChecked(false);
                    c729.setChecked(false);
                    c730.setChecked(false);
                    c731.setChecked(false);


                    jsonObject.put("q_18",compoundButton.getText());
//                    jsonObject.put("q_18","0");

                }
                else {
                    jsonObject.remove("q_18");
                }
            }
            else if (compoundButton.getId() == R.id.c721) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
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
                    c713.setChecked(false);
                    c722.setChecked(false);
                    c723.setChecked(false);
                    c724.setChecked(false);
                    c725.setChecked(false);
                    c726.setChecked(false);
                    c727.setChecked(false);
                    c728.setChecked(false);
                    c729.setChecked(false);
                    c730.setChecked(false);
                    c731.setChecked(false);


                    jsonObject.put("q_18",compoundButton.getText());
//                    jsonObject.put("q_18","0");

                }
                else {
                    jsonObject.remove("q_18");
                }
            }
            else if (compoundButton.getId() == R.id.c722) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
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
                    c713.setChecked(false);
                    c723.setChecked(false);
                    c724.setChecked(false);
                    c725.setChecked(false);
                    c726.setChecked(false);
                    c727.setChecked(false);
                    c728.setChecked(false);
                    c729.setChecked(false);
                    c730.setChecked(false);
                    c731.setChecked(false);


                    jsonObject.put("q_18",compoundButton.getText());
//                    jsonObject.put("q_18","0");

                }
                else {
                    jsonObject.remove("q_18");
                }
            }
            else if (compoundButton.getId() == R.id.c723) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
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
                    c713.setChecked(false);
                    c724.setChecked(false);
                    c725.setChecked(false);
                    c726.setChecked(false);
                    c727.setChecked(false);
                    c728.setChecked(false);
                    c729.setChecked(false);
                    c730.setChecked(false);
                    c731.setChecked(false);


                    jsonObject.put("q_18",compoundButton.getText());
//                    jsonObject.put("q_18","0");

                }
                else {
                    jsonObject.remove("q_18");
                }
            }
            else if (compoundButton.getId() == R.id.c724) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
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
                    c713.setChecked(false);
                    c725.setChecked(false);
                    c726.setChecked(false);
                    c727.setChecked(false);
                    c728.setChecked(false);
                    c729.setChecked(false);
                    c730.setChecked(false);
                    c731.setChecked(false);


                    jsonObject.put("q_18",compoundButton.getText());
//                    jsonObject.put("q_18","0");

                }
                else {
                    jsonObject.remove("q_18");
                }
            }
            else if (compoundButton.getId() == R.id.c725) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
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
                    c713.setChecked(false);
                    c726.setChecked(false);
                    c727.setChecked(false);
                    c728.setChecked(false);
                    c729.setChecked(false);
                    c730.setChecked(false);
                    c731.setChecked(false);


                    jsonObject.put("q_18",compoundButton.getText());
//                    jsonObject.put("q_18","0");

                }
                else {
                    jsonObject.remove("q_18");
                }
            }
            else if (compoundButton.getId() == R.id.c726) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
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
                    c725.setChecked(false);
                    c713.setChecked(false);
                    c727.setChecked(false);
                    c728.setChecked(false);
                    c729.setChecked(false);
                    c730.setChecked(false);
                    c731.setChecked(false);


                    jsonObject.put("q_18",compoundButton.getText());
//                    jsonObject.put("q_18","0");

                }
                else {
                    jsonObject.remove("q_18");
                }
            }
            else if (compoundButton.getId() == R.id.c727) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
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
                    c725.setChecked(false);
                    c726.setChecked(false);
                    c713.setChecked(false);
                    c728.setChecked(false);
                    c729.setChecked(false);
                    c730.setChecked(false);
                    c731.setChecked(false);


                    jsonObject.put("q_18",compoundButton.getText());
//                    jsonObject.put("q_18","0");

                }
                else {
                    jsonObject.remove("q_18");
                }
            }
            else if (compoundButton.getId() == R.id.c728) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
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
                    c725.setChecked(false);
                    c726.setChecked(false);
                    c727.setChecked(false);
                    c713.setChecked(false);
                    c729.setChecked(false);
                    c730.setChecked(false);
                    c731.setChecked(false);


                    jsonObject.put("q_18",compoundButton.getText());
//                    jsonObject.put("q_18","0");

                }
                else {
                    jsonObject.remove("q_18");
                }
            }
            else if (compoundButton.getId() == R.id.c729) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
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
                    c725.setChecked(false);
                    c726.setChecked(false);
                    c727.setChecked(false);
                    c728.setChecked(false);
                    c713.setChecked(false);
                    c730.setChecked(false);
                    c731.setChecked(false);


                    jsonObject.put("q_18",compoundButton.getText());
//                    jsonObject.put("q_18","0");

                }
                else {
                    jsonObject.remove("q_18");
                }
            }
            else if (compoundButton.getId() == R.id.c730) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
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
                    c725.setChecked(false);
                    c726.setChecked(false);
                    c727.setChecked(false);
                    c728.setChecked(false);
                    c729.setChecked(false);
                    c713.setChecked(false);
                    c731.setChecked(false);


                    jsonObject.put("q_18",compoundButton.getText());
//                    jsonObject.put("q_18","0");

                }
                else {
                    jsonObject.remove("q_18");
                }
            }
            else if (compoundButton.getId() == R.id.c731) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
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
                    c725.setChecked(false);
                    c726.setChecked(false);
                    c727.setChecked(false);
                    c728.setChecked(false);
                    c729.setChecked(false);
                    c730.setChecked(false);
                    c713.setChecked(false);
                    jsonObject.put("q_18",compoundButton.getText());
//                    jsonObject.put("q_18","0");

                }
                else {
                    jsonObject.remove("q_18");
                }
            }

        }
        catch (JSONException e) {

        }



    }
}