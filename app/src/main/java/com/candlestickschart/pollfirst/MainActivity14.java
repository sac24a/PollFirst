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

public class MainActivity14 extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{
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
        setContentView(R.layout.activity_main14);


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

                if (jsonObject.has("q_13")) {
                    if (jsonObject.has("q_14")) {

                        Intent intent = new Intent(MainActivity14.this,Servey15.class);
                        intent.putExtra("json",jsonObject.toString());
                        startActivity(intent);

                    }
                    else {
                        Toast.makeText(MainActivity14.this,"Please check Q-13",Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(MainActivity14.this,"Please check Q-14",Toast.LENGTH_SHORT).show();
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

                    jsonObject.put("q_13",compoundButton.getText());

                }
                else {
                    jsonObject.remove("q_13");
                }
            }
            else if (compoundButton.getId() == R.id.c72) {
                if (compoundButton.isChecked()) {
                    c71.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);

                    jsonObject.put("q_13",compoundButton.getText());

                }
                else {
                    jsonObject.remove("q_13");
                }
            }
            else if (compoundButton.getId() == R.id.c73) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c71.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);

                    jsonObject.put("q_13",compoundButton.getText());

                }
                else {
                    jsonObject.remove("q_13");
                }
            }
            else if (compoundButton.getId() == R.id.c74) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c71.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);

                    jsonObject.put("q_13",compoundButton.getText());

                }
                else {
                    jsonObject.remove("q_13");
                }
            }
            else if (compoundButton.getId() == R.id.c75) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c71.setChecked(false);
                    c76.setChecked(false);

                    jsonObject.put("q_13",compoundButton.getText());

                }
                else {
                    jsonObject.remove("q_13");
                }
            }
            else if (compoundButton.getId() == R.id.c76) {
                if (compoundButton.isChecked()) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c71.setChecked(false);

                    jsonObject.put("q_13",compoundButton.getText());

                }
                else {
                    jsonObject.remove("q_13");
                }
            }
            else if (compoundButton.getId() == R.id.c78) {
                if (compoundButton.isChecked()) {

                    c79.setChecked(false);
                    c710.setChecked(false);
                    c711.setChecked(false);
                    c712.setChecked(false);
                    c713.setChecked(false);

                    jsonObject.put("q_14",compoundButton.getText());

                }
                else {
                    jsonObject.remove("q_14");
                }
            }
            else if (compoundButton.getId() == R.id.c79) {
                if (compoundButton.isChecked()) {

                    c78.setChecked(false);
                    c710.setChecked(false);
                    c711.setChecked(false);
                    c712.setChecked(false);
                    c713.setChecked(false);

                    jsonObject.put("q_14",compoundButton.getText());

                }
                else {
                    jsonObject.remove("q_14");
                }
            }
            else if (compoundButton.getId() == R.id.c710) {
                if (compoundButton.isChecked()) {

                    c78.setChecked(false);
                    c79.setChecked(false);
                    c711.setChecked(false);
                    c712.setChecked(false);
                    c713.setChecked(false);

                    jsonObject.put("q_14",compoundButton.getText());

                }
                else {
                    jsonObject.remove("q_14");
                }
            }
            else if (compoundButton.getId() == R.id.c711) {
                if (compoundButton.isChecked()) {

                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);

                    c712.setChecked(false);
                    c713.setChecked(false);

                    jsonObject.put("q_14",compoundButton.getText());

                }
                else {
                    jsonObject.remove("q_14");
                }
            }
            else if (compoundButton.getId() == R.id.c712) {
                if (compoundButton.isChecked()) {

                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);
                    c711.setChecked(false);

                    c713.setChecked(false);

                    jsonObject.put("q_14",compoundButton.getText());

                }
                else {
                    jsonObject.remove("q_14");
                }
            }
            else if (compoundButton.getId() == R.id.c713) {
                if (compoundButton.isChecked()) {

                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);
                    c711.setChecked(false);
                    c712.setChecked(false);


                    jsonObject.put("q_14",compoundButton.getText());

                }
                else {
                    jsonObject.remove("q_14");
                }
            }

        }
        catch (JSONException e) {

        }



    }
}