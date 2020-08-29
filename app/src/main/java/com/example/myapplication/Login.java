package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {

    public EditText email, password;
    String fN,lN, valueEmail, valuePassword;
    FirebaseAuth mAuth;

    private FirebaseAuth.AuthStateListener authStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = (EditText) findViewById(R.id.editTextTextEmailAddress);
        password = (EditText) findViewById(R.id.editTextTextPassword);
    }


    public void btnLoginClicked(View view){

        valueEmail = email.getText().toString().trim();
        valuePassword = password.getText().toString();
        String vE = "aviciiram@gmail.com";
        String vP = "abc123...";

        if(valueEmail.isEmpty() || valuePassword.isEmpty()){
            Toast.makeText(this, "Email or password shouldn't be empty", Toast.LENGTH_SHORT).show();
        }else{
            if(valueEmail.equals(vE)  && valuePassword.equals(vP)){

                startActivity(new Intent(this,mainscreen.class));
            }
            else {
                Toast.makeText(this, "OOPS!! You will be stuck till credentials matches.", Toast.LENGTH_SHORT).show();
            }
        }


    }

}