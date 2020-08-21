package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class Login extends AppCompatActivity {

    public EditText email, password;
    String fN,lN, valueEmail, valuePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = (EditText) findViewById(R.id.editTextTextEmailAddress);
        password = (EditText) findViewById(R.id.editTextTextPassword);
    }


    public void btnLoginClicked(View view){

        valueEmail = null;
        valuePassword = null;

        valueEmail = email.getText().toString().trim();
        valuePassword = password.getText().toString().trim();

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Users");
        Query checkUser = reference.orderByChild("fName").equalTo(valueEmail);

        checkUser.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                //try {

                    if (dataSnapshot.exists()) {

                        String pwdFromDB = dataSnapshot.child(valueEmail).child("password").getValue(String.class);

                        if (pwdFromDB.equals(valuePassword)) {

                            fN = dataSnapshot.child(valueEmail).child("fName").getValue(String.class);
                            lN = dataSnapshot.child(valueEmail).child("lName").getValue(String.class);

                            Toast.makeText(Login.this, "User Logged in: " + fN + " " + lN, Toast.LENGTH_SHORT).show();

                        } else {
                            Toast.makeText(Login.this, "Password entered wrong.", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(Login.this, "User not found with the email address provided.", Toast.LENGTH_SHORT).show();
                    }
                /*}catch (Exception e){
                    Toast.makeText(Login.this, "Logged Successfully" +fN +" " + lN, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), ProfilePage.class);

                    intent.putExtra("fN ", fN);
                    intent.putExtra("lN ", lN);
                    intent.putExtra("email ", valueEmail);

                    startActivity(intent);

                    System.out.println(e);
                }*/
            }


            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }

}