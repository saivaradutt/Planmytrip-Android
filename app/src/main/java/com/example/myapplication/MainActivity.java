package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.signin);
        button2=findViewById(R.id.signup);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLogin();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensignup();
            }
        });
    }
    public void openLogin(){
        Intent intent= new Intent(this,Login.class);
        startActivity(intent);
    }
    public void opensignup(){
        Intent intent= new Intent(this,signup.class);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.ic_circle:
                startActivity(new Intent(this, ProfilePage.class));
                break;
            case R.id.ic_alert:
                startActivity(new Intent(this, feedback.class));
                break;
            case R.id.ic_house:
                startActivity(new Intent(this, mainscreen.class));
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}