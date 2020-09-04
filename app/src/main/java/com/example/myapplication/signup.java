package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.myapplication.model.UserProfile;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class signup extends AppCompatActivity {

    EditText email, password, fName, lName;

    DatabaseReference reference;
    public String valueGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        email = (EditText) findViewById(R.id.editTextTextEmailAddress);
        password = (EditText) findViewById(R.id.editTextTextPassword);
        fName = (EditText) findViewById(R.id.editTextTextPersonName);
        lName = (EditText) findViewById(R.id.editTextTextPersonName2);
    }


    public void RadioClicked(View view){
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton:
                if (checked)
                    valueGender = "Male";
                break;
            case R.id.radioButton2:
                if (checked)
                    valueGender = "Female";
                break;
            case R.id.radioButton3:
                if (checked)
                    valueGender = "Other";
                break;
        }
    }

    public void btnSignUpClicked(View view){

        //reference = FirebaseDatabase.getInstance().getReference("Users");

        String emailU = email.getText().toString();
        String passwordU = password.getText().toString();
        String fN = fName.getText().toString();
        String lN = lName.getText().toString();

        try {


            if ((TextUtils.isEmpty(emailU)) || (TextUtils.isEmpty(passwordU))) {
                Toast.makeText(this, "Email and Password are mandatory.", Toast.LENGTH_SHORT).show();
            } else {

                    String id = reference.push().getKey();
                    UserProfile user = new UserProfile(id, fN, lN, emailU, passwordU, valueGender);
                    //reference.child(id).setValue(user);
                    Toast.makeText(this, "User Added", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(this, MainActivity.class));
            }
        }catch (Exception e){
            Toast.makeText(this, "User Added", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, MainActivity.class ));
        }
    }

}