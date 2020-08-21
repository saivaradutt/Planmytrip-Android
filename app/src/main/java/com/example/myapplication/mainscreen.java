package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.adapter.TravelPackagesAdapter;
import com.example.myapplication.model.TravelPackages;

import java.util.List;

import static com.example.myapplication.R.drawable.*;

public class mainscreen extends AppCompatActivity {

    RecyclerView countryRecyclerView, packageRecycler;




    TravelPackagesAdapter travelPackagesAdapter;
    List<TravelPackages> travelPackagesList;

    TextView allCategory;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainscreen);

    }

}
