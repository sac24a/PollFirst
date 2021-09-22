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

public class Servey9 extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{

    CheckBox c41;
    CheckBox c42;
    CheckBox c43;
    CheckBox c44;
    CheckBox c45;


    CheckBox c51;
    CheckBox c52;
    CheckBox c53;
    CheckBox c54;
    CheckBox c55;
    CheckBox c56;

    Button forward;
    Button backward;
    JSONObject jsonObject;
    String cate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servey9);


        try {
            jsonObject = new JSONObject(getIntent().getStringExtra("json"));
        } catch (JSONException e) {
            e.printStackTrace();
        }

        c41 = findViewById(R.id.c41);
        c42 = findViewById(R.id.c42);
        c43 = findViewById(R.id.c43);
        c44 = findViewById(R.id.c44);
        c45 = findViewById(R.id.c45);



        c51 = findViewById(R.id.c51);
        c52 = findViewById(R.id.c52);
        c53 = findViewById(R.id.c53);
        c54 = findViewById(R.id.c54);
        c55 = findViewById(R.id.c55);
        c56 = findViewById(R.id.c56);

        c41.setOnCheckedChangeListener(this);
        c42.setOnCheckedChangeListener(this);
        c43.setOnCheckedChangeListener(this);
        c44.setOnCheckedChangeListener(this);
        c45.setOnCheckedChangeListener(this);


        c51.setOnCheckedChangeListener(this);
        c52.setOnCheckedChangeListener(this);
        c53.setOnCheckedChangeListener(this);
        c54.setOnCheckedChangeListener(this);
        c55.setOnCheckedChangeListener(this);
        c56.setOnCheckedChangeListener(this);
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

                    if (jsonObject.has("q_19")) {
                        if (jsonObject.has("c_8")) {
                            try {
                                if (jsonObject.get("c_8").equals("अगड़े मुस्लिम")) {
                                    jsonObject.put("category","अगड़े मुस्लिम");
                                    Intent intent = new Intent(Servey9.this,Servey11.class);
                                    intent.putExtra("bjplist",getIntent().getStringArrayListExtra("bjplist"));
                                    intent.putExtra("bsplist",getIntent().getStringArrayListExtra("bsplist"));
                                    intent.putExtra("splist",getIntent().getStringArrayListExtra("splist"));
                                    intent.putExtra("inclist",getIntent().getStringArrayListExtra("inclist"));
                                    intent.putExtra("otherlist",getIntent().getStringArrayListExtra("otherlist"));
                                    intent.putExtra("json",jsonObject.toString());
                                    intent.putExtra("cat",cate);

                                    startActivity(intent);
                                }
                                else if (jsonObject.get("c_8").equals("पिछड़े मुस्लिम")) {
                                    jsonObject.put("category","पिछड़े मुस्लिम");
                                    Intent intent = new Intent(Servey9.this,Servey11.class);
                                    intent.putExtra("bjplist",getIntent().getStringArrayListExtra("bjplist"));
                                    intent.putExtra("bsplist",getIntent().getStringArrayListExtra("bsplist"));
                                    intent.putExtra("splist",getIntent().getStringArrayListExtra("splist"));
                                    intent.putExtra("inclist",getIntent().getStringArrayListExtra("inclist"));
                                    intent.putExtra("otherlist",getIntent().getStringArrayListExtra("otherlist"));
                                    intent.putExtra("json",jsonObject.toString());

                                    intent.putExtra("cat",cate);
                                    startActivity(intent);
                                }
                                else {
                                    Intent intent = new Intent(Servey9.this,Servey10.class);
                                    intent.putExtra("json",jsonObject.toString());
                                    intent.putExtra("cat",cate);
                                    intent.putExtra("bjplist",getIntent().getStringArrayListExtra("bjplist"));
                                    intent.putExtra("bsplist",getIntent().getStringArrayListExtra("bsplist"));
                                    intent.putExtra("splist",getIntent().getStringArrayListExtra("splist"));
                                    intent.putExtra("inclist",getIntent().getStringArrayListExtra("inclist"));
                                    intent.putExtra("otherlist",getIntent().getStringArrayListExtra("otherlist"));
                                    startActivity(intent);
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                        else {
                            Toast.makeText(Servey9.this,"Please check C-8",Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {
                        Toast.makeText(Servey9.this,"Please check Q-20",Toast.LENGTH_SHORT).show();
                    }
                }

        });
        checkforUpdate();
    }

    public void checkforUpdate(){
        try {

                try {
                    jsonObject = new JSONObject(getIntent().getStringExtra("json"));
                    if (jsonObject.has("q_19")) {
                        switch (jsonObject.get("q_19").toString()) {
                            case "पार्टी":
                                c41.setChecked(true);
                                break;
                            case "मुख्यमंत्री उम्मीदवार":
                                c42.setChecked(true);
                                break;
                            case "विधायक उम्मीदवार":
                                c43.setChecked(true);
                                break;
                            case "अपने समाज के साथ":
                                c44.setChecked(true);
                                break;
                            case "कह नहीं सकते":
                                c45.setChecked(true);
                                break;
                            default:
                                break;
                        }

                    }
                    if (jsonObject.has("c_8")) {
                        switch (jsonObject.get("c_8").toString()) {
                            case "सवर्ण":
                                c51.setChecked(true);
                                cate = "general";
                                break;
                            case "पिछड़ी जातियां":
                                c52.setChecked(true);
                                cate = "obc";
                                break;
                            case "अनुसूचित जाति":
                                c53.setChecked(true);
                                cate = "sc";
                                break;
                            case "अगड़े मुस्लिम":
                                c54.setChecked(true);
                                cate = "other";
                                break;
                            case "पिछड़े मुस्लिम":
                                c55.setChecked(true);
                                cate = "other";
                                break;
                            case "अन्य":
                                c56.setChecked(true);
                                cate = "other";
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
                    jsonObject.put("q_19",compoundButton.getText());
                    jsonObject.put("q_19","1");

                }
                else {
                    jsonObject.remove("q_19");
                }
            }
            else if (compoundButton.getId() == R.id.c42) {
                if (compoundButton.isChecked()) {
                    c41.setChecked(false);
                    c43.setChecked(false);
                    c44.setChecked(false);
                    c45.setChecked(false);
                    jsonObject.put("q_19",compoundButton.getText());
                    jsonObject.put("q_19","2");

                }
                else {
                    jsonObject.remove("q_19");
                }
            }
            else if (compoundButton.getId() == R.id.c43) {
                if (compoundButton.isChecked()) {
                    c41.setChecked(false);
                    c42.setChecked(false);
                    c44.setChecked(false);
                    c45.setChecked(false);
                    jsonObject.put("q_19",compoundButton.getText());
                    jsonObject.put("q_19","3");

                }
                else {
                    jsonObject.remove("q_19");
                }
            }
            else if (compoundButton.getId() == R.id.c44) {
                if (compoundButton.isChecked()) {
                    c41.setChecked(false);
                    c43.setChecked(false);
                    c42.setChecked(false);
                    c45.setChecked(false);
                    jsonObject.put("q_19",compoundButton.getText());
                    jsonObject.put("q_19","4");

                }
                else {
                    jsonObject.remove("q_19");
                }
            }
            else if (compoundButton.getId() == R.id.c45) {
                if (compoundButton.isChecked()) {
                    c41.setChecked(false);
                    c43.setChecked(false);
                    c44.setChecked(false);
                    c42.setChecked(false);
                    jsonObject.put("q_19",compoundButton.getText());
                    jsonObject.put("q_19","0");

                }
                else {
                    jsonObject.remove("q_19");
                }
            }

            else if (compoundButton.getId() == R.id.c51) {
                if (compoundButton.isChecked()) {
                    c52.setChecked(false);
                    c53.setChecked(false);
                    c54.setChecked(false);
                    c55.setChecked(false);
                    c56.setChecked(false);
                    jsonObject.put("c_8",compoundButton.getText());
                    jsonObject.put("c_8","1");
                    cate = "general";

                }
                else {
                    jsonObject.remove("c_8");

                }
            }
            else if (compoundButton.getId() == R.id.c52) {
                if (compoundButton.isChecked()) {
                    c51.setChecked(false);
                    c53.setChecked(false);
                    c54.setChecked(false);
                    c55.setChecked(false);
                    c56.setChecked(false);
                    jsonObject.put("c_8",compoundButton.getText());
                    jsonObject.put("c_8","2");
                    cate = "obc";

                }
                else {
                    jsonObject.remove("c_8");

                }
            }
            else if (compoundButton.getId() == R.id.c53) {
                if (compoundButton.isChecked()) {
                    c52.setChecked(false);
                    c51.setChecked(false);
                    c54.setChecked(false);
                    c55.setChecked(false);
                    c56.setChecked(false);
                    jsonObject.put("c_8",compoundButton.getText());
                    jsonObject.put("c_8","3");
                    cate = "sc";

                }
                else {
                    jsonObject.remove("c_8");

                }
            }
            else if (compoundButton.getId() == R.id.c54) {
                if (compoundButton.isChecked()) {
                    c52.setChecked(false);
                    c53.setChecked(false);
                    c51.setChecked(false);
                    c55.setChecked(false);
                    c56.setChecked(false);
                    jsonObject.put("c_8",compoundButton.getText());
                    jsonObject.put("c_8","61");
                    cate = "other";


                }
                else {
                    jsonObject.remove("c_8");

                }
            }
            else if (compoundButton.getId() == R.id.c55) {
                if (compoundButton.isChecked()) {
                    c52.setChecked(false);
                    c53.setChecked(false);
                    c51.setChecked(false);
                    c54.setChecked(false);
                    c56.setChecked(false);
                    jsonObject.put("c_8",compoundButton.getText());
                    jsonObject.put("c_8","62");
                    cate = "other";

                }
                else {
                    jsonObject.remove("c_8");

                }
            }
            else if (compoundButton.getId() == R.id.c56) {
                if (compoundButton.isChecked()) {
                    c52.setChecked(false);
                    c53.setChecked(false);
                    c51.setChecked(false);
                    c55.setChecked(false);
                    c54.setChecked(false);
                    jsonObject.put("c_8",compoundButton.getText());
                    jsonObject.put("c_8","0");
                    cate = "other";

                }
                else {
                    jsonObject.remove("c_8");

                }
            }
        }
        catch (JSONException e) {

        }
    }
}