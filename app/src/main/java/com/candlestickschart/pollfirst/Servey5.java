package com.candlestickschart.pollfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

public class Servey5 extends AppCompatActivity {

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

    Button veryhappy4;
    Button nutral4;
    Button verysad4;
    ImageView vhappyimageView4;
    ImageView nutralimageView4;
    ImageView vsadimageView4;

    Button veryhappy5;
    Button happy5;
    Button nutral5;
    Button sad5;
    Button verysad5;
    ImageView vhappyimageView5;
    ImageView happyimageView5;
    ImageView nutralimageView5;
    ImageView sadimageView5;
    ImageView vsadimageView5;

    Button veryhappy6;
    Button nutral6;
    Button verysad6;
    ImageView vhappyimageView6;
    ImageView nutralimageView6;
    ImageView vsadimageView6;

    Button forward;
    Button backward;

    JSONObject jsonObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servey5);

        try {
            jsonObject = new JSONObject(getIntent().getStringExtra("json"));
        } catch (JSONException e) {
            e.printStackTrace();
        }

        veryhappy = findViewById(R.id.veryhappy3);
        happy = findViewById(R.id.happy3);
        nutral = findViewById(R.id.nutral3);
        sad = findViewById(R.id.sad3);
        verysad = findViewById(R.id.verysad3);
        vhappyimageView = findViewById(R.id.veryhappyImage3);
        happyimageView = findViewById(R.id.happyImage3);
        nutralimageView = findViewById(R.id.nutralImage3);
        sadimageView = findViewById(R.id.sadImage3);
        vsadimageView = findViewById(R.id.verysadImage3);


        vhappyimageView4 = findViewById(R.id.veryhappyImage4);
        nutralimageView4 = findViewById(R.id.nutralImage4);
        vsadimageView4 = findViewById(R.id.verysadImage4);
        veryhappy4 = findViewById(R.id.veryhappy4);
        nutral4 = findViewById(R.id.nutral4);
        verysad4 = findViewById(R.id.verysad4);

        veryhappy5 = findViewById(R.id.veryhappy5);
        happy5 = findViewById(R.id.happy5);
        nutral5 = findViewById(R.id.nutral5);
        sad5 = findViewById(R.id.sad5);
        verysad5 = findViewById(R.id.verysad5);
        vhappyimageView5 = findViewById(R.id.veryhappyImage5);
        happyimageView5 = findViewById(R.id.happyImage5);
        nutralimageView5 = findViewById(R.id.nutralImage5);
        sadimageView5 = findViewById(R.id.sadImage5);
        vsadimageView5 = findViewById(R.id.verysadImage5);

        veryhappy6 = findViewById(R.id.veryhappy6);
        nutral6 = findViewById(R.id.nutral6);
        verysad6 = findViewById(R.id.verysad6);
        vhappyimageView6 = findViewById(R.id.veryhappyImage6);
        nutralimageView6 = findViewById(R.id.nutralImage6);
        vsadimageView6 = findViewById(R.id.verysadImage6);


        veryhappy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vhappyimageView.setVisibility(View.VISIBLE);
                happyimageView.setVisibility(View.GONE);
                nutralimageView.setVisibility(View.GONE);
                sadimageView.setVisibility(View.GONE);
                vsadimageView.setVisibility(View.GONE);
                try {
                    jsonObject.put("q_3","बहुत खुश");
                    jsonObject.put("q_3","5");
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
                    jsonObject.put("q_3","खुश");
                    jsonObject.put("q_3","4");
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
                    jsonObject.put("q_3","पता नहीं");
                    jsonObject.put("q_3","3");
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
                    jsonObject.put("q_3","दुखी");
                    jsonObject.put("q_3","2");
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
                    jsonObject.put("q_3","बहुत दुखी");
                    jsonObject.put("q_3","1");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });


        veryhappy4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vhappyimageView4.setVisibility(View.VISIBLE);
                nutralimageView4.setVisibility(View.GONE);
                vsadimageView4.setVisibility(View.GONE);
                try {
                    jsonObject.put("q_4","हाँ");
                    jsonObject.put("q_4","1");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        nutral4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vhappyimageView4.setVisibility(View.GONE);
                nutralimageView4.setVisibility(View.VISIBLE);
                vsadimageView4.setVisibility(View.GONE);
                try {
                    jsonObject.put("q_4","पता नहीं");
                    jsonObject.put("q_4","0");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        verysad4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vhappyimageView4.setVisibility(View.GONE);
                nutralimageView4.setVisibility(View.GONE);
                vsadimageView4.setVisibility(View.VISIBLE);
                try {
                    jsonObject.put("q_4","नहीं");
                    jsonObject.put("q_4","2");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });


        veryhappy5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vhappyimageView5.setVisibility(View.VISIBLE);
                happyimageView5.setVisibility(View.GONE);
                nutralimageView5.setVisibility(View.GONE);
                sadimageView5.setVisibility(View.GONE);
                vsadimageView5.setVisibility(View.GONE);
                try {
                    jsonObject.put("q_5","बहुत खुश");
                    jsonObject.put("q_5","5");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        happy5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vhappyimageView5.setVisibility(View.GONE);
                happyimageView5.setVisibility(View.VISIBLE);
                nutralimageView5.setVisibility(View.GONE);
                sadimageView5.setVisibility(View.GONE);
                vsadimageView5.setVisibility(View.GONE);
                try {
                    jsonObject.put("q_5","खुश");
                    jsonObject.put("q_5","4");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        nutral5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vhappyimageView5.setVisibility(View.GONE);
                happyimageView5.setVisibility(View.GONE);
                nutralimageView5.setVisibility(View.VISIBLE);
                sadimageView5.setVisibility(View.GONE);
                vsadimageView5.setVisibility(View.GONE);
                try {
                    jsonObject.put("q_5","पता नहीं");
                    jsonObject.put("q_5","3");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        sad5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vhappyimageView5.setVisibility(View.GONE);
                happyimageView5.setVisibility(View.GONE);
                nutralimageView5.setVisibility(View.GONE);
                sadimageView5.setVisibility(View.VISIBLE);
                vsadimageView5.setVisibility(View.GONE);
                try {
                    jsonObject.put("q_5","दुखी");jsonObject.put("q_5","2");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        verysad5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vhappyimageView5.setVisibility(View.GONE);
                happyimageView5.setVisibility(View.GONE);
                nutralimageView5.setVisibility(View.GONE);
                sadimageView5.setVisibility(View.GONE);
                vsadimageView5.setVisibility(View.VISIBLE);
                try {
                    jsonObject.put("q_5","बहुत दुखी");
                    jsonObject.put("q_5","1");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });



        veryhappy6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vhappyimageView6.setVisibility(View.VISIBLE);
                nutralimageView6.setVisibility(View.GONE);
                vsadimageView6.setVisibility(View.GONE);
                try {
                    jsonObject.put("q_6","हाँ");
                    jsonObject.put("q_6","1");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        nutral6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vhappyimageView6.setVisibility(View.GONE);
                nutralimageView6.setVisibility(View.VISIBLE);
                vsadimageView6.setVisibility(View.GONE);
                try {
                    jsonObject.put("q_6","पता नहीं");
                    jsonObject.put("q_6","0");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        verysad6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vhappyimageView6.setVisibility(View.GONE);
                nutralimageView6.setVisibility(View.GONE);
                vsadimageView6.setVisibility(View.VISIBLE);
                try {
                    jsonObject.put("q_6","नहीं");
                    jsonObject.put("q_6","2");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });

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
                if (jsonObject.has("q_3")) {
                    if (jsonObject.has("q_4")) {
                        if (jsonObject.has("q_5")) {
                            if (jsonObject.has("q_6")) {

                                Intent intent = new Intent(Servey5.this, Servey6.class);
                                intent.putExtra("json", jsonObject.toString());
                                startActivity(intent);
                            } else {
                                Toast.makeText(Servey5.this, "Please check Q-7", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            Toast.makeText(Servey5.this, "Please check Q-6", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(Servey5.this, "Please check Q-5", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(Servey5.this,"Please check Q-4",Toast.LENGTH_SHORT).show();
                }

            }
        });
        checkforUpdate();
    }
    public void checkforUpdate() {
        try {

                try {
                    jsonObject = new JSONObject(getIntent().getStringExtra("json"));
                    if (jsonObject.has("q_3")) {
                        switch (jsonObject.get("q_3").toString()) {
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
                    if (jsonObject.has("q_4")) {
                        switch (jsonObject.get("q_4").toString()) {
                            case "हाँ":
                                vhappyimageView4.setVisibility(View.VISIBLE);
                                break;
                            case "पता नहीं":
                                nutralimageView4.setVisibility(View.VISIBLE);
                                break;
                            case "नहीं":
                                vsadimageView4.setVisibility(View.VISIBLE);
                                break;
                            default:
                                break;
                        }

                    }
                    if (jsonObject.has("q_5")) {
                        switch (jsonObject.get("q_5").toString()) {
                            case "बहुत खुश":
                                vhappyimageView5.setVisibility(View.VISIBLE);
                                break;
                            case "खुश":
                                happyimageView5.setVisibility(View.VISIBLE);
                                break;
                            case "पता नहीं":
                                nutralimageView5.setVisibility(View.VISIBLE);
                                break;
                            case "बहुत दुखी":
                                vsadimageView5.setVisibility(View.VISIBLE);
                                break;
                            case "दुखी":
                                sadimageView5.setVisibility(View.VISIBLE);
                                break;
                            default:
                                break;
                        }

                    }
                    if (jsonObject.has("q_6")) {
                        switch (jsonObject.get("q_6").toString()) {
                            case "हाँ":
                                vhappyimageView6.setVisibility(View.VISIBLE);
                                break;
                            case "पता नहीं":
                                nutralimageView6.setVisibility(View.VISIBLE);
                                break;
                            case "नहीं":
                                vsadimageView6.setVisibility(View.VISIBLE);
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

        }
    }

}