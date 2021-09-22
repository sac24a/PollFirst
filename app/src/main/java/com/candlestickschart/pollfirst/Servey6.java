package com.candlestickschart.pollfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

public class Servey6 extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{
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
    Button forward;
    Button backward;
    JSONObject jsonObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servey6);

        try {
            jsonObject = new JSONObject(getIntent().getStringExtra("json"));
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

                if (jsonObject.has("q_7")) {
                    if (jsonObject.has("q_8")) {
                        Intent intent = new Intent(Servey6.this,Servey7.class);
                        intent.putExtra("json",jsonObject.toString());
                        intent.putExtra("bjplist",getIntent().getStringArrayListExtra("bjplist"));
                        intent.putExtra("bsplist",getIntent().getStringArrayListExtra("bsplist"));
                        intent.putExtra("splist",getIntent().getStringArrayListExtra("splist"));
                        intent.putExtra("inclist",getIntent().getStringArrayListExtra("inclist"));
                        intent.putExtra("otherlist",getIntent().getStringArrayListExtra("otherlist"));
                        startActivity(intent);
                    }
                    else {
                        Toast.makeText(Servey6.this,"Please check Q-9",Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(Servey6.this,"Please check Q-8",Toast.LENGTH_SHORT).show();
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
                    jsonObject.put("q_8","बहुत अधिक");
                    jsonObject.put("q_8","5");
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
                    jsonObject.put("q_8","अधिक");
                    jsonObject.put("q_8","4");
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
                    jsonObject.put("q_8","पता नहीं");
                    jsonObject.put("q_8","3");
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
                    jsonObject.put("q_8","कम");
                    jsonObject.put("q_8","2");
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
                    jsonObject.put("q_8","बिल्कुल नहीं");
                    jsonObject.put("q_8","1");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        checkforUpdate();
    }

    public void checkforUpdate(){
        try {

                try {
                    jsonObject = new JSONObject(getIntent().getStringExtra("json"));
                    if (jsonObject.has("q_8")) {
                        switch (jsonObject.get("q_8").toString()) {
                            case "बहुत अधिक":
                                vhappyimageView.setVisibility(View.VISIBLE);
                                break;
                            case "अधिक":
                                happyimageView.setVisibility(View.VISIBLE);
                                break;
                            case "पता नहीं":
                                nutralimageView.setVisibility(View.VISIBLE);
                                break;
                            case "बिल्कुल नहीं":
                                vsadimageView.setVisibility(View.VISIBLE);
                                break;
                            case "कम":
                                sadimageView.setVisibility(View.VISIBLE);
                                break;
                            default:
                                break;
                        }

                    }
                    if (jsonObject.has("q_7")) {
                        switch (jsonObject.get("q_7").toString()) {
                            case "योगी आदित्यनाथ जी":
                                c71.setChecked(true);
                                break;
                            case "भाजपा से अन्य":
                                c72.setChecked(true);
                                break;
                            case "अखिलेश यादव जी":
                                c73.setChecked(true);
                                break;
                            case "सपा से अन्य":
                                c74.setChecked(true);
                                break;
                            case "मायावती जी":
                                c75.setChecked(true);
                                break;
                            case "बसपा से अन्य":
                                c76.setChecked(true);
                                break;
                            case "अजय कुमार लल्लू":
                                c77.setChecked(true);
                                break;
                            case "कांग्रेस से अन्य":
                                c78.setChecked(true);
                                break;
                            case "जयंत चौधरी जी":
                                c79.setChecked(true);
                                break;
                            case "कोई और":
                                c710.setChecked(true);
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
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
                    c77.setChecked(false);
                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);

                    jsonObject.put("q_7",compoundButton.getText());
                    jsonObject.put("q_7","1");

                }
                else {
                    jsonObject.remove("q_7");
                }
            }
            else if (compoundButton.getId() == R.id.c72) {
                if (compoundButton.isChecked() == true) {
                    c71.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
                    c77.setChecked(false);
                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);

                    jsonObject.put("q_7",compoundButton.getText());
                    jsonObject.put("q_7","2");

                }
                else {
                    jsonObject.remove("q_7");
                }
            }
            else if (compoundButton.getId() == R.id.c73) {
                if (compoundButton.isChecked() == true) {
                    c72.setChecked(false);
                    c71.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
                    c77.setChecked(false);
                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);
                    jsonObject.put("q_7",compoundButton.getText());
                    jsonObject.put("q_7","3");

                }
                else {
                    jsonObject.remove("q_7");
                }
            }
            else if (compoundButton.getId() == R.id.c74) {
                if (compoundButton.isChecked() == true) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c71.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
                    c77.setChecked(false);
                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);
                    jsonObject.put("q_7",compoundButton.getText());
                    jsonObject.put("q_7","4");

                }
                else {
                    jsonObject.remove("q_7");
                }
            }
            else if (compoundButton.getId() == R.id.c75) {
                if (compoundButton.isChecked() == true) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c71.setChecked(false);
                    c76.setChecked(false);
                    c77.setChecked(false);
                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);
                    jsonObject.put("q_7",compoundButton.getText());
                    jsonObject.put("q_7","5");

                }
                else {
                    jsonObject.remove("q_7");
                }
            }
            else if (compoundButton.getId() == R.id.c76) {
                if (compoundButton.isChecked() == true) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c71.setChecked(false);
                    c77.setChecked(false);
                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);
                    jsonObject.put("q_7",compoundButton.getText());
                    jsonObject.put("q_7","6");

                }
                else {
                    jsonObject.remove("q_7");
                }
            }
            else if (compoundButton.getId() == R.id.c77) {
                if (compoundButton.isChecked() == true) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
                    c71.setChecked(false);
                    c78.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);
                    jsonObject.put("q_7",compoundButton.getText());
                    jsonObject.put("q_7","7");

                }
                else {
                    jsonObject.remove("q_7");
                }
            }
            else if (compoundButton.getId() == R.id.c78) {
                if (compoundButton.isChecked() == true) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
                    c77.setChecked(false);
                    c71.setChecked(false);
                    c79.setChecked(false);
                    c710.setChecked(false);
                    jsonObject.put("q_7",compoundButton.getText());
                    jsonObject.put("q_7","8");

                }
                else {
                    jsonObject.remove("q_7");
                }
            }
            else if (compoundButton.getId() == R.id.c79) {
                if (compoundButton.isChecked() == true) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
                    c77.setChecked(false);
                    c78.setChecked(false);
                    c71.setChecked(false);
                    c710.setChecked(false);
                    jsonObject.put("q_7",compoundButton.getText());
                    jsonObject.put("q_7","9");

                }
                else {
                    jsonObject.remove("q_7");
                }
            }
            else if (compoundButton.getId() == R.id.c710) {
                if (compoundButton.isChecked() == true) {
                    c72.setChecked(false);
                    c73.setChecked(false);
                    c74.setChecked(false);
                    c75.setChecked(false);
                    c76.setChecked(false);
                    c77.setChecked(false);
                    c78.setChecked(false);
                    c79.setChecked(false);
                    c71.setChecked(false);
                    jsonObject.put("q_7",compoundButton.getText());
                    jsonObject.put("q_7","0");
                }
                else {
                    jsonObject.remove("q_7");
                }
            }
        }
        catch (JSONException e) {

        }



    }
}