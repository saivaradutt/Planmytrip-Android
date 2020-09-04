package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Animation topanim;
    ImageView image;
    private static int splash_time_out = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeintent=new Intent(MainActivity.this, welcomescreen.class);
                startActivity(homeintent);
                finish();
            }
        },splash_time_out);
        topanim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        image= findViewById(R.id.imageView);

        image.setAnimation(topanim);
    }
}