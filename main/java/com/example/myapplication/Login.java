package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {
private Button button;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button= findViewById(R.id.noaccount);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensignup();
            }
        });
        button2= findViewById(R.id.conform);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openwelcome();
            }
        });
    }
    public void opensignup() {
        Intent intent = new Intent(this, signup.class);
        startActivity(intent);
    }
    public void openwelcome() {
        Intent intent = new Intent(this, Welcome.class);
        startActivity(intent);
    }
}