package com.example.android.score;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final Random RANDOM = new Random();
    private Button buttonA, buttonB, buttonC;
    private Intent intent;
    private ImageView coin;
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonA = findViewById(R.id.buttonA);
        buttonB = findViewById(R.id.buttonB);
        buttonC = findViewById(R.id.googleid);
        btn = findViewById(R.id.btn);
        coin = findViewById(R.id.coin);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flipCoin();


            }
        });


        buttonA.setOnClickListener(this);
        buttonB.setOnClickListener(this);
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String google = "https://docs.google.com/document/d/1_nQQGSmFuSu8xTKEU9GPcTdizz8RwpSgENpjeymJaZg/edit";
                Uri webadress = Uri.parse(google);

                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webadress);
                if (gotoGoogle.resolveActivity(getPackageManager()) != null) {
                    startActivity(gotoGoogle);

                }
            }
        });


    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.buttonA) {

            intent = new Intent(MainActivity.this, TeamA.class);
            intent.putExtra("name", "teama");
            startActivity(intent);


        }
        if (v.getId() == R.id.buttonB) {

            intent = new Intent(MainActivity.this, TeamB.class);
            intent.putExtra("name", "TeamB");
            startActivity(intent);


        }

    }

    private void flipCoin() {
        Animation fadeOut = new AlphaAnimation(1, 0);
        fadeOut.setInterpolator(new AccelerateInterpolator());
        fadeOut.setDuration(1000);
        fadeOut.setFillAfter(true);
        fadeOut.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                coin.setImageResource(RANDOM.nextFloat() > 0.5f ? R.drawable.tails : R.drawable.heads);

                Animation fadeIn = new AlphaAnimation(0, 1);
                fadeIn.setInterpolator(new DecelerateInterpolator());
                fadeIn.setDuration(3000);
                fadeIn.setFillAfter(true);

                coin.startAnimation(fadeIn);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        coin.startAnimation(fadeOut);
    }

}

