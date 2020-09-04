package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Welcome extends AppCompatActivity {
    Animation topanim;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        topanim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        image= findViewById(R.id.imageView2);

        image.setAnimation(topanim);
    }
}
