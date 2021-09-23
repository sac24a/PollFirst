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

public class Servey15 extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{
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


    Button forward;
    Button backward;
    JSONObject jsonObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servey15);


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



        try {
            ArrayList<String> bjplist = getIntent().getStringArrayListExtra("bsplist");
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
//                c76.setVisibility(View.GONE);
            }
            else if (bjplist.size() == 1) {
                c72.setVisibility(View.GONE);
                c73.setVisibility(View.GONE);
                c74.setVisibility(View.GONE);
                c75.setVisibility(View.GONE);
//                c76.setVisibility(View.GONE);
            }
            else if (bjplist.size() == 2) {
                c73.setVisibility(View.GONE);
                c74.setVisibility(View.GONE);
                c75.setVisibility(View.GONE);
//                c76.setVisibility(View.GONE);
            }
            else if (bjplist.size() == 3) {

                c74.setVisibility(View.GONE);
                c75.setVisibility(View.GONE);
//                c76.setVisibility(View.GONE);
            }
            else if (bjplist.size() == 4) {

                c75.setVisibility(View.GONE);
//                c76.setVisibility(View.GONE);
            }
            else if (bjplist.size() == 5) {
//                c76.setVisibility(View.GONE);
            }
        }
        catch (NullPointerException e) {
            c71.setVisibility(View.GONE);
            c72.setVisibility(View.GONE);
            c73.setVisibility(View.GONE);
            c74.setVisibility(View.GONE);
            c75.setVisibility(View.GONE);
        }
        try {
            ArrayList<String>splist = getIntent().getStringArrayListExtra("inclist");
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
//                c713.setVisibility(View.GONE);
            }
            else if (splist.size() == 1) {
                c79.setVisibility(View.GONE);
                c710.setVisibility(View.GONE);
                c711.setVisibility(View.GONE);
                c712.setVisibility(View.GONE);
//                c713.setVisibility(View.GONE);
            }
            else if (splist.size() == 2) {
                c710.setVisibility(View.GONE);
                c711.setVisibility(View.GONE);
                c712.setVisibility(View.GONE);
//                c713.setVisibility(View.GONE);
            }
            else if (splist.size() == 3) {
                c711.setVisibility(View.GONE);
                c712.setVisibility(View.GONE);
//                c713.setVisibility(View.GONE);
            }
            else if (splist.size() == 4) {
                c712.setVisibility(View.GONE);
//                c713.setVisibility(View.GONE);
            }
            else if (splist.size() == 5) {
//                c713.setVisibility(View.GONE);
            }
        }catch (NullPointerException e) {
            c78.setVisibility(View.GONE);
            c79.setVisibility(View.GONE);
            c710.setVisibility(View.GONE);
            c711.setVisibility(View.GONE);
            c712.setVisibility(View.GONE);
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

                if (jsonObject.has("q_15")) {
                    if (jsonObject.has("q_16")) {

                        Intent intent = new Intent(Servey15.this,Servey16.class);
                        intent.putExtra("json",jsonObject.toString());
                        intent.putExtra("bjplist",getIntent().getStringArrayListExtra("bjplist"));
                        intent.putExtra("bsplist",getIntent().getStringArrayListExtra("bsplist"));
                        intent.putExtra("splist",getIntent().getStringArrayListExtra("splist"));
                        intent.putExtra("inclist",getIntent().getStringArrayListExtra("inclist"));
                        intent.putExtra("otherlist",getIntent().getStringArrayListExtra("otherlist"));
                        startActivity(intent);

                    }
                    else {
                        Toast.makeText(Servey15.this,"Please check Q-17",Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(Servey15.this,"Please check Q-16",Toast.LENGTH_SHORT).show();
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

                    jsonObject.put("q_15",compoundButton.getText());
//                    jsonObject.put("q_15","0");

                }
                else {
                    jsonObject.remove("q_15");
                }
            }
            else if (compoundButton.getId() == R.id.c72) {
                if (compoundButton.isChecked()) {
                    c71.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);

                    jsonObject.put("q_15",compoundButton.getText());
//                    jsonObject.put("q_15","0");

                }
                else {
                    jsonObject.remove("q_15");
                }
            }
            else if (compoundButton.getId() == R.id.c73) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c71.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);

                    jsonObject.put("q_15",compoundButton.getText());
//                    jsonObject.put("q_15","0");

                }
                else {
                    jsonObject.remove("q_15");
                }
            }
            else if (compoundButton.getId() == R.id.c74) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c71.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);

                    jsonObject.put("q_15",compoundButton.getText());
//                    jsonObject.put("q_15","0");

                }
                else {
                    jsonObject.remove("q_15");
                }
            }
            else if (compoundButton.getId() == R.id.c75) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c71.setChecked(false);
                    c76.setChecked(false);

                    jsonObject.put("q_15",compoundButton.getText());
//                    jsonObject.put("q_15","0");

                }
                else {
                    jsonObject.remove("q_15");
                }
            }
            else if (compoundButton.getId() == R.id.c76) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c71.setChecked(false);

                    jsonObject.put("q_15",compoundButton.getText());
//                    jsonObject.put("q_15","0");

                }
                else {
                    jsonObject.remove("q_15");
                }
            }
            else if (compoundButton.getId() == R.id.c78) {
                if (compoundButton.isChecked()) {

                    c79.setChecked(false);
                    c710.setChecked(false);
                    c711.setChecked(false);
                    c712.setChecked(false);
                    c713.setChecked(false);

                    jsonObject.put("q_16",compoundButton.getText());
//                    jsonObject.put("q_16","0");

                }
                else {
                    jsonObject.remove("q_16");
                }
            }
            else if (compoundButton.getId() == R.id.c79) {
                if (compoundButton.isChecked()) {

                    c78.setChecked(false);
                    c710.setChecked(false);
                    c711.setChecked(false);
                    c712.setChecked(false);
                    c713.setChecked(false);

                    jsonObject.put("q_16",compoundButton.getText());
//                    jsonObject.put("q_16","0");

                }
                else {
                    jsonObject.remove("q_16");
                }
            }
            else if (compoundButton.getId() == R.id.c710) {
                if (compoundButton.isChecked()) {

                    c78.setChecked(false);
                    c79.setChecked(false);
                    c711.setChecked(false);
                    c712.setChecked(false);
                    c713.setChecked(false);

                    jsonObject.put("q_16",compoundButton.getText());
//                    jsonObject.put("q_16","0");

                }
                else {
                    jsonObject.remove("q_16");
                }
            }
            else if (compoundButton.getId() == R.id.c711) {
                if (compoundButton.isChecked()) {

                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);

                    c712.setChecked(false);
                    c713.setChecked(false);

                    jsonObject.put("q_16",compoundButton.getText());
//                    jsonObject.put("q_16","0");

                }
                else {
                    jsonObject.remove("q_16");
                }
            }
            else if (compoundButton.getId() == R.id.c712) {
                if (compoundButton.isChecked()) {

                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);
                    c711.setChecked(false);

                    c713.setChecked(false);

                    jsonObject.put("q_16",compoundButton.getText());
//                    jsonObject.put("q_16","0");

                }
                else {
                    jsonObject.remove("q_16");
                }
            }
            else if (compoundButton.getId() == R.id.c713) {
                if (compoundButton.isChecked()) {

                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);
                    c711.setChecked(false);
                    c712.setChecked(false);


                    jsonObject.put("q_16",compoundButton.getText());
//                    jsonObject.put("q_16","0");

                }
                else {
                    jsonObject.remove("q_16");
                }
            }

        }
        catch (JSONException e) {

        }



    }
}