package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class ProfilePage extends AppCompatActivity {

    EditText fNtxt, lNtxt, emailtxt, passwordtxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        fNtxt = (EditText) findViewById(R.id.Profile_Fn);
        lNtxt = (EditText) findViewById(R.id.Profile_Ln);
        emailtxt = (EditText) findViewById(R.id.ProfileEmail);
        passwordtxt = (EditText) findViewById(R.id.ProfilePwd);

        getData();
    }

    public void getData(){

        Intent intent = getIntent();

        String fN = intent.getStringExtra("fN");
        String lN = intent.getStringExtra("lN");
        String email = intent.getStringExtra("email");

        fNtxt.setText(fN);
        lNtxt.setText(lN);
        emailtxt.setText(email);

    }
}