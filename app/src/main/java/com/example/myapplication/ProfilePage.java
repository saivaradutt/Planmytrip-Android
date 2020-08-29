package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
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

        BottomNavigationView bottomNavigationView=findViewById(R.id.bottomNavViewBar);
        bottomNavigationView.setSelectedItemId(R.id.ic_circle);
        bottomNavigationView.setSelectedItemId(R.id.ic_alert);
        bottomNavigationView.setSelectedItemId(R.id.ic_house);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
                                                                     @Override
                                                                     public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                                                                         switch(menuItem.getItemId())
                                                                         {
                                                                             case R.id.ic_circle:
                                                                                 startActivity(new Intent(getApplicationContext(),ProfilePage.class));
                                                                                 overridePendingTransition(0,0);
                                                                                 return true;
                                                                             case R.id.ic_alert:
                                                                                 startActivity(new Intent(getApplicationContext(),feedback.class));
                                                                                 overridePendingTransition(0,0);
                                                                                 return true;
                                                                             case R.id.ic_house:
                                                                                 startActivity(new Intent(getApplicationContext(),aboutus.class));
                                                                                 overridePendingTransition(0,0);
                                                                                 return true;
                                                                         }
                                                                         return false;
                                                                     }
                                                                 }
        );
    }

    public void getData(){

    fNtxt.setText("Avicii");
    lNtxt.setText("Ram");
    emailtxt.setText("aviciiram@gmail.com");
    }

    public void btnUpdateClick(View view){

        Toast.makeText(this, "Updated Successfully!", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, mainscreen.class));
    }

    public void btnCancelClick(View view){

        startActivity(new Intent(this, mainscreen.class));
    }

}