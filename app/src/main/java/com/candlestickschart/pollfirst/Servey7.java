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

public class Servey7 extends AppCompatActivity {

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
    Button happy4;
    Button sad4;
    ImageView vhappyimageView4;
    ImageView nutralimageView4;
    ImageView vsadimageView4;
    ImageView happyimageView4;
    ImageView sadimageView4;

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
    Button happy6;
    Button nutral6;
    Button sad6;
    Button verysad6;
    ImageView vhappyimageView6;
    ImageView nutralimageView6;
    ImageView vsadimageView6;
    ImageView happyimageView6;
    ImageView sadimageView6;

    Button forward;
    Button backward;
    JSONObject jsonObject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servey7);


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
        sadimageView4 = findViewById(R.id.sadImage4);
        happyimageView4 = findViewById(R.id.happyImage4);
        nutralimageView4 = findViewById(R.id.nutralImage4);
        vsadimageView4 = findViewById(R.id.verysadImage4);
        veryhappy4 = findViewById(R.id.veryhappy4);
        happy4 = findViewById(R.id.happy4);
        nutral4 = findViewById(R.id.nutral4);
        sad4 = findViewById(R.id.sad4);
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
        happy6 = findViewById(R.id.happy6);
        nutral6 = findViewById(R.id.nutral6);
        sad6 = findViewById(R.id.sad6);
        verysad6 = findViewById(R.id.verysad6);
        vhappyimageView6 = findViewById(R.id.veryhappyImage6);
        happyimageView6 = findViewById(R.id.happyImage6);
        nutralimageView6 = findViewById(R.id.nutralImage6);
        sadimageView6 = findViewById(R.id.sadImage6);
        vsadimageView6 = findViewById(R.id.verysadImage6);


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

                if (jsonObject.has("q_9")) {
                    if (jsonObject.has("q_10")) {
                        if (jsonObject.has("q_11")) {
                            if (jsonObject.has("q_12")) {
                                Intent intent = new Intent(Servey7.this,MainActivity14.class);
                                intent.putExtra("json",jsonObject.toString());
                                intent.putExtra("bjplist",getIntent().getStringArrayListExtra("bjplist"));
                                intent.putExtra("bsplist",getIntent().getStringArrayListExtra("bsplist"));
                                intent.putExtra("splist",getIntent().getStringArrayListExtra("splist"));
                                intent.putExtra("inclist",getIntent().getStringArrayListExtra("inclist"));
                                intent.putExtra("otherlist",getIntent().getStringArrayListExtra("otherlist"));
                                startActivity(intent);
                            }
                            else {
                                Toast.makeText(Servey7.this,"Please check Q-13",Toast.LENGTH_SHORT).show();
                            }
                        }
                        else {
                            Toast.makeText(Servey7.this,"Please check Q-12",Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {
                        Toast.makeText(Servey7.this,"Please check Q-11",Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(Servey7.this,"Please check Q-10",Toast.LENGTH_SHORT).show();
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
                    jsonObject.put("q_9","???????????? ????????????");
                    jsonObject.put("q_9","5");
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
                    jsonObject.put("q_9","????????????");
                    jsonObject.put("q_9","4");
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
                    jsonObject.put("q_9","????????? ???????????? ");
                    jsonObject.put("q_9","3");
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
                    jsonObject.put("q_9","??????");
                    jsonObject.put("q_9","2");
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
                    jsonObject.put("q_9","????????????????????? ????????????");
                    jsonObject.put("q_9","1");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });


        veryhappy4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vhappyimageView4.setVisibility(View.VISIBLE);
                happyimageView4.setVisibility(View.GONE);
                nutralimageView4.setVisibility(View.GONE);
                sadimageView4.setVisibility(View.GONE);
                vsadimageView4.setVisibility(View.GONE);
                try {
                    jsonObject.put("q_10","???????????? ????????????");
                    jsonObject.put("q_10","5");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        happy4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vhappyimageView4.setVisibility(View.GONE);
                happyimageView4.setVisibility(View.VISIBLE);
                nutralimageView4.setVisibility(View.GONE);
                sadimageView4.setVisibility(View.GONE);
                vsadimageView4.setVisibility(View.GONE);
                try {
                    jsonObject.put("q_10","????????????");
                    jsonObject.put("q_10","4");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        nutral4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vhappyimageView4.setVisibility(View.GONE);
                happyimageView4.setVisibility(View.GONE);
                nutralimageView4.setVisibility(View.VISIBLE);
                sadimageView4.setVisibility(View.GONE);
                vsadimageView4.setVisibility(View.GONE);
                try {
                    jsonObject.put("q_10","????????? ????????????");
                    jsonObject.put("q_10","3");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        sad4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vhappyimageView4.setVisibility(View.GONE);
                happyimageView4.setVisibility(View.GONE);
                nutralimageView4.setVisibility(View.GONE);
                sadimageView4.setVisibility(View.VISIBLE);
                vsadimageView4.setVisibility(View.GONE);
                try {
                    jsonObject.put("q_10","??????");
                    jsonObject.put("q_10","2");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        verysad4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vhappyimageView4.setVisibility(View.GONE);
                happyimageView4.setVisibility(View.GONE);
                nutralimageView4.setVisibility(View.GONE);
                sadimageView4.setVisibility(View.GONE);
                vsadimageView4.setVisibility(View.VISIBLE);
                try {
                    jsonObject.put("q_10","????????????????????? ????????????");
                    jsonObject.put("q_10","1");
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
                    jsonObject.put("q_11","???????????? ????????????");
                    jsonObject.put("q_11","5");
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
                    jsonObject.put("q_11","????????????");
                    jsonObject.put("q_11","4");
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
                    jsonObject.put("q_11","????????? ????????????");
                    jsonObject.put("q_11","3");
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
                    jsonObject.put("q_11","??????");
                    jsonObject.put("q_11","2");
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
                    jsonObject.put("q_11","???????????? ??????");
                    jsonObject.put("q_11","1");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });



        veryhappy6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vhappyimageView6.setVisibility(View.VISIBLE);
                happyimageView6.setVisibility(View.GONE);
                nutralimageView6.setVisibility(View.GONE);
                sadimageView6.setVisibility(View.GONE);
                vsadimageView6.setVisibility(View.GONE);
                try {
                    jsonObject.put("q_12","???????????? ????????????");
                    jsonObject.put("q_12","5");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        happy6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vhappyimageView6.setVisibility(View.GONE);
                happyimageView6.setVisibility(View.VISIBLE);
                nutralimageView6.setVisibility(View.GONE);
                sadimageView6.setVisibility(View.GONE);
                vsadimageView6.setVisibility(View.GONE);
                try {
                    jsonObject.put("q_12","????????????");
                    jsonObject.put("q_12","4");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        nutral6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vhappyimageView6.setVisibility(View.GONE);
                happyimageView6.setVisibility(View.GONE);
                nutralimageView6.setVisibility(View.VISIBLE);
                sadimageView6.setVisibility(View.GONE);
                vsadimageView6.setVisibility(View.GONE);
                try {
                    jsonObject.put("q_12","????????? ????????????");
                    jsonObject.put("q_12","3");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        sad6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vhappyimageView6.setVisibility(View.GONE);
                happyimageView6.setVisibility(View.GONE);
                nutralimageView6.setVisibility(View.GONE);
                sadimageView6.setVisibility(View.VISIBLE);
                vsadimageView6.setVisibility(View.GONE);
                try {
                    jsonObject.put("q_12","??????");
                    jsonObject.put("q_12","2");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        verysad6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vhappyimageView6.setVisibility(View.GONE);
                happyimageView6.setVisibility(View.GONE);
                nutralimageView6.setVisibility(View.GONE);
                sadimageView6.setVisibility(View.GONE);
                vsadimageView6.setVisibility(View.VISIBLE);
                try {
                    jsonObject.put("q_12","???????????? ??????");
                    jsonObject.put("q_12","1");
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
                    if (jsonObject.has("q_9")) {
                        switch (jsonObject.get("q_9").toString()) {
                            case "???????????? ????????????":
                                vhappyimageView.setVisibility(View.VISIBLE);
                                break;
                            case "????????????":
                                happyimageView.setVisibility(View.VISIBLE);
                                break;
                            case "????????? ????????????":
                                nutralimageView.setVisibility(View.VISIBLE);
                                break;
                            case "????????????????????? ????????????":
                                vsadimageView.setVisibility(View.VISIBLE);
                                break;
                            case "??????":
                                sadimageView.setVisibility(View.VISIBLE);
                                break;
                            default:
                                break;
                        }

                    }
                    if (jsonObject.has("q_10")) {
                        switch (jsonObject.get("q_10").toString()) {
                            case "???????????? ????????????":
                                vhappyimageView4.setVisibility(View.VISIBLE);
                                break;
                            case "????????????":
                                happyimageView4.setVisibility(View.VISIBLE);
                                break;
                            case "????????? ????????????":
                                nutralimageView4.setVisibility(View.VISIBLE);
                                break;
                            case "????????????????????? ????????????":
                                vsadimageView4.setVisibility(View.VISIBLE);
                                break;
                            case "??????":
                                sadimageView4.setVisibility(View.VISIBLE);
                                break;
                            default:
                                break;
                        }

                    }
                    if (jsonObject.has("q_11")) {
                        switch (jsonObject.get("q_11").toString()) {
                            case "???????????? ????????????":
                                vhappyimageView5.setVisibility(View.VISIBLE);
                                break;
                            case "????????????":
                                happyimageView5.setVisibility(View.VISIBLE);
                                break;
                            case "????????? ????????????":
                                nutralimageView5.setVisibility(View.VISIBLE);
                                break;
                            case "????????????????????? ????????????":
                                vsadimageView5.setVisibility(View.VISIBLE);
                                break;
                            case "??????":
                                sadimageView5.setVisibility(View.VISIBLE);
                                break;
                            default:
                                break;
                        }

                    }
                    if (jsonObject.has("q_12")) {
                        switch (jsonObject.get("q_12").toString()) {
                            case "???????????? ????????????":
                                vhappyimageView6.setVisibility(View.VISIBLE);
                                break;
                            case "????????????":
                                happyimageView6.setVisibility(View.VISIBLE);
                                break;
                            case "????????? ????????????":
                                nutralimageView6.setVisibility(View.VISIBLE);
                                break;
                            case "????????????????????? ????????????":
                                vsadimageView6.setVisibility(View.VISIBLE);
                                break;
                            case "??????":
                                sadimageView6.setVisibility(View.VISIBLE);
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
}