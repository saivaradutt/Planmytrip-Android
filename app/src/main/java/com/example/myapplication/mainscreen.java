package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Adapters.CountryAdapter;
import com.example.myapplication.model.Country;
import com.google.android.material.bottomnavigation.BottomNavigationView;


import java.util.ArrayList;
import java.util.List;

public class mainscreen extends AppCompatActivity {

    //RecyclerView countryRecyclerView, packageRecycler;
    TextView allCategory;

    private List<Country> countryList = new ArrayList<>();
    private RecyclerView recyclerView;
    private CountryAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainscreen);

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
        Toast.makeText(this, "Entered", Toast.LENGTH_SHORT).show();
        System.out.println("Entered");
        countryList = HotelData.getAll();
        recyclerView = findViewById(R.id.categoryRecycler);

        mAdapter = new CountryAdapter(countryList, mainscreen.this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

    }

}
