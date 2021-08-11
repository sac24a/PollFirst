package com.candlestickschart.pollfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

public class servey4 extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{


    Button veryhappy;
    Button happy;
    Button nutral;
    Button sad;
    Button verysad;

    ImageView vhappyimageView;
    ImageView happyimageView;
    ImageView nutralimageView;
    ImageView sadimageView;
    ImageView vsadimageView;

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

    Button forward;
    Button backward;
    JSONObject jsonObject;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servey4);

        try {
            jsonObject = new JSONObject(getIntent().getStringExtra("json"));
            jsonObject.put("q_2_1","0");
            jsonObject.put("q_2_2","0");
            jsonObject.put("q_2_3","0");
            jsonObject.put("q_2_4","0");
            jsonObject.put("q_2_5","0");
            jsonObject.put("q_2_6","0");
            jsonObject.put("q_2_7","0");
            jsonObject.put("q_2_8","0");
            jsonObject.put("q_2_9","0");
            jsonObject.put("q_2_10","0");
            jsonObject.put("q_2_11","0");
            jsonObject.put("q_2_12","0");
            Log.d("TAG", "onCreate: "+jsonObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }


        veryhappy = findViewById(R.id.veryhappy);
        happy = findViewById(R.id.happy);
        nutral = findViewById(R.id.nutral);
        sad = findViewById(R.id.sad);
        verysad = findViewById(R.id.verysad);

        vhappyimageView = findViewById(R.id.veryhappyImage);
        happyimageView = findViewById(R.id.happyImage);
        nutralimageView = findViewById(R.id.nutralImage);
        sadimageView = findViewById(R.id.sadImage);
        vsadimageView = findViewById(R.id.verysadImage);

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
                try {
                    if (jsonObject.has("q_1")) {
                        if (jsonObject.get("q_2_1").equals("0") && jsonObject.get("q_2_2").equals("0") && jsonObject.get("q_2_3").equals("0")&& jsonObject.get("q_2_4").equals("0") && jsonObject.get("q_2_5").equals("0") && jsonObject.get("q_2_6").equals("0") && jsonObject.get("q_2_7").equals("0") && jsonObject.get("q_2_8").equals("0")&& jsonObject.get("q_2_9").equals("0") && jsonObject.get("q_2_10").equals("0") && jsonObject.get("q_2_11").equals("0") && jsonObject.get("q_2_12").equals("0")) {
                            Toast.makeText(servey4.this,"Please check Q-2",Toast.LENGTH_SHORT).show();
                        }
                        else {
                            String checkedValue = "";
                            if (c71.isChecked()) {
                                if (checkedValue.equals("") ){
                                    checkedValue = c71.getText().toString();
                                }
                                else {
                                    checkedValue = checkedValue + ","+c71.getText().toString();
                                }

                            }
                            if (c72.isChecked()) {
                                if (checkedValue.equals("") ){
                                    checkedValue = c72.getText().toString();
                                }
                                else {
                                    checkedValue = checkedValue + ","+c72.getText().toString();
                                }

                            }
                            if (c73.isChecked()) {
                                if (checkedValue.equals("") ){
                                    checkedValue = c73.getText().toString();
                                }
                                else {
                                    checkedValue = checkedValue + ","+c73.getText().toString();
                                }

                            }
                            if (c74.isChecked()) {
                                if (checkedValue.equals("") ){
                                    checkedValue = c74.getText().toString();
                                }
                                else {
                                    checkedValue = checkedValue + ","+c74.getText().toString();
                                }

                            }
                            if (c75.isChecked()) {
                                if (checkedValue.equals("") ){
                                    checkedValue = c75.getText().toString();
                                }
                                else {
                                    checkedValue = checkedValue + ","+c75.getText().toString();
                                }

                            }
                            if (c76.isChecked()) {
                                if (checkedValue.equals("") ){
                                    checkedValue = c76.getText().toString();
                                }
                                else {
                                    checkedValue = checkedValue + ","+c76.getText().toString();
                                }

                            }
                            if (c77.isChecked()) {
                                if (checkedValue.equals("") ){
                                    checkedValue = c77.getText().toString();
                                }
                                else {
                                    checkedValue = checkedValue + ","+c77.getText().toString();
                                }

                            }
                            if (c78.isChecked()) {
                                if (checkedValue.equals("") ){
                                    checkedValue = c78.getText().toString();
                                }
                                else {
                                    checkedValue = checkedValue + ","+c78.getText().toString();
                                }

                            }
                            if (c79.isChecked()) {
                                if (checkedValue.equals("") ){
                                    checkedValue = c79.getText().toString();
                                }
                                else {
                                    checkedValue = checkedValue + ","+c79.getText().toString();
                                }

                            }
                            if (c710.isChecked()) {
                                if (checkedValue.equals("") ){
                                    checkedValue = c710.getText().toString();
                                }
                                else {
                                    checkedValue = checkedValue + ","+c710.getText().toString();
                                }

                            }
                            if (c711.isChecked()) {
                                if (checkedValue.equals("") ){
                                    checkedValue = c711.getText().toString();
                                }
                                else {
                                    checkedValue = checkedValue + ","+c711.getText().toString();
                                }

                            }
                            if (c712.isChecked()) {
                                if (checkedValue.equals("") ){
                                    checkedValue = c712.getText().toString();
                                }
                                else {
                                    checkedValue = checkedValue + ","+c712.getText().toString();
                                }

                            }

                            Intent intent = new Intent(servey4.this,Servey18.class);
                            intent.putExtra("json",jsonObject.toString());
                            startActivity(intent);

                        }
                    }
                    else {
                        Toast.makeText(servey4.this,"Please check Q-1",Toast.LENGTH_SHORT).show();
                    }
                }
                catch (JSONException e) {
                    e.printStackTrace();
                }

                }

        });


        veryhappy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vhappyimageView.setVisibility(View.VISIBLE);
                happyimageView.setVisibility(View.GONE);
                nutralimageView.setVisibility(View.GONE);
                sadimageView.setVisibility(View.GONE);
                vsadimageView.setVisibility(View.GONE);
                try {
                    jsonObject.put("q_1","बहुत खुश");
                    jsonObject.put("q_1","5");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });

        happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vhappyimageView.setVisibility(View.GONE);
                happyimageView.setVisibility(View.VISIBLE);
                nutralimageView.setVisibility(View.GONE);
                sadimageView.setVisibility(View.GONE);
                vsadimageView.setVisibility(View.GONE);
                try {
                    jsonObject.put("q_1","खुश");
                    jsonObject.put("q_1","4");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });

        nutral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vhappyimageView.setVisibility(View.GONE);
                happyimageView.setVisibility(View.GONE);
                nutralimageView.setVisibility(View.VISIBLE);
                sadimageView.setVisibility(View.GONE);
                vsadimageView.setVisibility(View.GONE);
                try {
                    jsonObject.put("q_1","पता नहीं");
                    jsonObject.put("q_1","3");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });

        sad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vhappyimageView.setVisibility(View.GONE);
                happyimageView.setVisibility(View.GONE);
                nutralimageView.setVisibility(View.GONE);
                sadimageView.setVisibility(View.VISIBLE);
                vsadimageView.setVisibility(View.GONE);
                try {
                    jsonObject.put("q_1","दुखी");
                    jsonObject.put("q_1","2");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });

        verysad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vhappyimageView.setVisibility(View.GONE);
                happyimageView.setVisibility(View.GONE);
                nutralimageView.setVisibility(View.GONE);
                sadimageView.setVisibility(View.GONE);
                vsadimageView.setVisibility(View.VISIBLE);
                try {
                    jsonObject.put("q_1","बहुत दुखी");
                    jsonObject.put("q_1","1");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
//        checkforUpdate();
    }

    public void checkforUpdate(){
        try {

                try {
                    jsonObject = new JSONObject(getIntent().getStringExtra("json"));
                    if (jsonObject.has("q_1")) {
                        switch (jsonObject.get("q_1").toString()) {
                            case "बहुत खुश":
                                vhappyimageView.setVisibility(View.VISIBLE);
                                break;
                            case "खुश":
                                happyimageView.setVisibility(View.VISIBLE);
                                break;
                            case "पता नहीं":
                                nutralimageView.setVisibility(View.VISIBLE);
                                break;
                            case "बहुत दुखी":
                                vsadimageView.setVisibility(View.VISIBLE);
                                break;
                            case "दुखी":
                                sadimageView.setVisibility(View.VISIBLE);
                                break;
                            default:
                                break;
                        }

                    }
                    if (jsonObject.has("q_2")) {
                        switch (jsonObject.get("q_2").toString()) {
                            case "दो समय का भोजन":
                                c71.setChecked(true);
                                break;
                            case "बेरोजगारी":
                                c72.setChecked(true);
                                break;
                            case "कानून व्यवस्था":
                                c73.setChecked(true);
                                break;
                            case "भ्रष्टाचार":
                                c74.setChecked(true);
                                break;
                            case "महंगाई":
                                c75.setChecked(true);
                                break;
                            case "सामंप्रदायिक तनाव":
                                c76.setChecked(true);
                                break;
                            case "सरकारी स्वास्थ्य सुविधाएं":
                                c77.setChecked(true);
                                break;
                            case "पीने का पानी":
                                c78.setChecked(true);
                                break;
                            case "शिक्षा व्यवस्था":
                                c79.setChecked(true);
                                break;
                            case "सड़कें":
                                c710.setChecked(true);
                                break;
                            case "समाज में सम्मान":
                                c711.setChecked(true);
                                break;
                            case "विकास की कमी":
                                c712.setChecked(true);
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

                    jsonObject.put("q_2_1",compoundButton.getText());
                    jsonObject.put("q_2_1","1");
                }
                else {
                    jsonObject.put("q_2_1","0");
                }
            }
            else if (compoundButton.getId() == R.id.c72) {
                if (compoundButton.isChecked() == true) {
                    jsonObject.put("q_2_2",compoundButton.getText());
                    jsonObject.put("q_2_2","1");
                }
                else {
                    jsonObject.put("q_2_2","0");
                }
            }
            else if (compoundButton.getId() == R.id.c73) {
                if (compoundButton.isChecked() == true) {


                    jsonObject.put("q_2_3",compoundButton.getText());
                    jsonObject.put("q_2_3","1");

                }
                else {
                    jsonObject.put("q_2_3","0");
                }
            }
            else if (compoundButton.getId() == R.id.c74) {
                if (compoundButton.isChecked() == true) {
                    jsonObject.put("q_2_4",compoundButton.getText());
                    jsonObject.put("q_2_4","1");
                }
                else {
                    jsonObject.put("q_2_4","0");
                }
            }
            else if (compoundButton.getId() == R.id.c75) {
                if (compoundButton.isChecked() == true) {
                    jsonObject.put("q_2_5",compoundButton.getText());
                    jsonObject.put("q_2_5","1");
                }
                else {
                    jsonObject.put("q_2_5","0");
                }
            }
            else if (compoundButton.getId() == R.id.c76) {
                if (compoundButton.isChecked() == true) {
                    jsonObject.put("q_2_6",compoundButton.getText());
                    jsonObject.put("q_2_6","1");
                }
                else {
                    jsonObject.put("q_2_6","0");
                }
            }
            else if (compoundButton.getId() == R.id.c77) {
                if (compoundButton.isChecked() == true) {
                    jsonObject.put("q_2_7",compoundButton.getText());
                    jsonObject.put("q_2_7","1");
                }
                else {
                    jsonObject.put("q_2_7","0");
                }
            }
            else if (compoundButton.getId() == R.id.c78) {
                if (compoundButton.isChecked() == true) {
                    jsonObject.put("q_2_8",compoundButton.getText());
                    jsonObject.put("q_2_8","1");
                }
                else {
                    jsonObject.put("q_2_8","0");
                }
            }
            else if (compoundButton.getId() == R.id.c79) {
                if (compoundButton.isChecked() == true) {
                    jsonObject.put("q_2_9",compoundButton.getText());
                    jsonObject.put("q_2_9","1");
                }
                else {
                    jsonObject.put("q_2_9","0");
                }
            }
            else if (compoundButton.getId() == R.id.c710) {
                if (compoundButton.isChecked() == true) {
                    jsonObject.put("q_2_10",compoundButton.getText());
                    jsonObject.put("q_2_10","1");
                }
                else {
                    jsonObject.put("q_2_10","0");
                }
            }
            else if (compoundButton.getId() == R.id.c711) {
                if (compoundButton.isChecked() == true) {
                    jsonObject.put("q_2_11",compoundButton.getText());
                    jsonObject.put("q_2_11","1");
                }
                else {
                    jsonObject.put("q_2_11","0");
                }
            }
            else if (compoundButton.getId() == R.id.c712) {
                if (compoundButton.isChecked() == true) {
                    jsonObject.put("q_2_12",compoundButton.getText());
                    jsonObject.put("q_2_12","1");
                }
                else {
                    jsonObject.put("q_2_12","0");
                }
            }
        }
        catch (JSONException e) {

        }


    }
}