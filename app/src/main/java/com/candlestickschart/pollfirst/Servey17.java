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
                    jsonObject.put("q_18","0");

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
                    jsonObject.put("q_18","0");

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
                    jsonObject.put("q_18","0");

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
                    jsonObject.put("q_18","0");

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
                    jsonObject.put("q_18","0");

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
                    jsonObject.put("q_18","0");

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
                    jsonObject.put("q_18","0");

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
                    jsonObject.put("q_18","0");

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
                    jsonObject.put("q_18","0");

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
                    jsonObject.put("q_18","0");

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
                    jsonObject.put("q_18","0");

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
                    jsonObject.put("q_18","0");

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
                    jsonObject.put("q_18","0");

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
                    jsonObject.put("q_18","0");

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
                    jsonObject.put("q_18","0");

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
                    jsonObject.put("q_18","0");

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
                    jsonObject.put("q_18","0");

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
                    jsonObject.put("q_18","0");

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
                    jsonObject.put("q_18","0");

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
                    jsonObject.put("q_18","0");

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
                    jsonObject.put("q_18","0");

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
                    jsonObject.put("q_18","0");

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
                    jsonObject.put("q_18","0");

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
                    jsonObject.put("q_18","0");

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
                    jsonObject.put("q_18","0");

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
                    jsonObject.put("q_18","0");

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
                    jsonObject.put("q_18","0");

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
                    jsonObject.put("q_18","0");

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
                    jsonObject.put("q_18","0");

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
                    jsonObject.put("q_18","0");

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