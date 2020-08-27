package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.adapter.HotelAdapter;
import com.example.myapplication.adapter.TravelPackagesAdapter;
import com.example.myapplication.model.Hotel;
import com.example.myapplication.model.TravelPackages;
import com.example.myapplication.model.UserProfile;


import java.util.ArrayList;
import java.util.List;

import static com.example.myapplication.R.drawable.*;

public class mainscreen extends AppCompatActivity {

    //RecyclerView countryRecyclerView, packageRecycler;
    TextView allCategory;

    private List<Hotel> hotelList = new ArrayList<>();
    private RecyclerView recyclerView;
    private HotelAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainscreen);


        Toast.makeText(this, "Entered", Toast.LENGTH_SHORT).show();
        System.out.println("Entered");
        hotelList = HotelData.getAll();
        recyclerView = findViewById(R.id.categoryRecycler);

        mAdapter = new HotelAdapter(hotelList, mainscreen.this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

    }

}
