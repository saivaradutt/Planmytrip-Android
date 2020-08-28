package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.Util.CurrentUser;
import com.example.myapplication.Util.Reader;
import com.example.myapplication.Util.User;

public class HotelLoginActivity extends AppCompatActivity {
    EditText namer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_login);
    }

    //LOGIN METHOD
    public void doLogin(View view){
        User user = null;
        user = Reader.getUserList(getApplicationContext());
        namer = findViewById(R.id.hotelusername);
        String name = namer.getText().toString();
        if(user.getUsers().contains(name))
        {
            CurrentUser cuser = new CurrentUser(name);
            Intent intent = new Intent(getApplicationContext(), HotelMainActivity.class);
            startActivity(intent);
        }
        else
            Toast.makeText(getApplicationContext(),"Sorry",Toast.LENGTH_LONG).show();
    }
}
