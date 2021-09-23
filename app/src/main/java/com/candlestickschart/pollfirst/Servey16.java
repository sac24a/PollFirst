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

public class Servey16 extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{
    CheckBox c71;
    CheckBox c72;
    CheckBox c73;
    CheckBox c74;
    CheckBox c75;
    CheckBox c76;
    Button forward;
    Button backward;
    JSONObject jsonObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servey16);


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
        try {
            ArrayList<String> bjplist = getIntent().getStringArrayListExtra("otherlist");
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
        }catch (NullPointerException e){
            c71.setVisibility(View.GONE);
            c72.setVisibility(View.GONE);
            c73.setVisibility(View.GONE);
            c74.setVisibility(View.GONE);
            c75.setVisibility(View.GONE);
        }

        c71.setOnCheckedChangeListener(this);
        c72.setOnCheckedChangeListener(this);
        c73.setOnCheckedChangeListener(this);
        c74.setOnCheckedChangeListener(this);
        c75.setOnCheckedChangeListener(this);
        c76.setOnCheckedChangeListener(this);

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

                if (jsonObject.has("q_17")) {

                        Intent intent = new Intent(Servey16.this,Servey17.class);
                        intent.putExtra("json",jsonObject.toString());
                    intent.putExtra("bjplist",getIntent().getStringArrayListExtra("bjplist"));
                    intent.putExtra("bsplist",getIntent().getStringArrayListExtra("bsplist"));
                    intent.putExtra("splist",getIntent().getStringArrayListExtra("splist"));
                    intent.putExtra("inclist",getIntent().getStringArrayListExtra("inclist"));
                    intent.putExtra("otherlist",getIntent().getStringArrayListExtra("otherlist"));
                        startActivity(intent);

                }
                else {
                    Toast.makeText(Servey16.this,"Please check Q-18",Toast.LENGTH_SHORT).show();
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

                    jsonObject.put("q_17",compoundButton.getText());
//                    jsonObject.put("q_17","0");

                }
                else {
                    jsonObject.remove("q_17");
                }
            }
            else if (compoundButton.getId() == R.id.c72) {
                if (compoundButton.isChecked()) {
                    c71.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);

                    jsonObject.put("q_17",compoundButton.getText());
//                    jsonObject.put("q_17","0");

                }
                else {
                    jsonObject.remove("q_17");
                }
            }
            else if (compoundButton.getId() == R.id.c73) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c71.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);

                    jsonObject.put("q_17",compoundButton.getText());
//                    jsonObject.put("q_17","0");

                }
                else {
                    jsonObject.remove("q_17");
                }
            }
            else if (compoundButton.getId() == R.id.c74) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c71.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);

                    jsonObject.put("q_17",compoundButton.getText());
//                    jsonObject.put("q_17","0");

                }
                else {
                    jsonObject.remove("q_17");
                }
            }
            else if (compoundButton.getId() == R.id.c75) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c71.setChecked(false);
                    c76.setChecked(false);

                    jsonObject.put("q_17",compoundButton.getText());
//                    jsonObject.put("q_17","0");
                }
                else {
                    jsonObject.remove("q_17");
                }
            }
            else if (compoundButton.getId() == R.id.c76) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c71.setChecked(false);

                    jsonObject.put("q_17",compoundButton.getText());
//                    jsonObject.put("q_17","0");

                }
                else {
                    jsonObject.remove("q_17");
                }
            }

        }
        catch (JSONException e) {

        }



    }
}