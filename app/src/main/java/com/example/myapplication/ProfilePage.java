package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

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

    fNtxt.setText("Avicii");
    lNtxt.setText("Ram");
    emailtxt.setText("aviciiram@gmail.com");
    }
}