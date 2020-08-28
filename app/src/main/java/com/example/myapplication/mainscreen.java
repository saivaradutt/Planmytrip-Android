package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Adapters.CountryAdapter;
import com.example.myapplication.model.Country;


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
