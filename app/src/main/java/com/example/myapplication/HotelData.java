package com.example.myapplication;

import com.example.myapplication.model.Hotel;

import java.util.ArrayList;

public class HotelData {

    private static ArrayList<Hotel> hotels;

    private static void initData() {
        hotels = new ArrayList<>();

        hotels.add(new Hotel ("Novotel", "Montreal", "It's very good hotel"));
        hotels.add(new Hotel ("Marraiot", "Toronto", "It's nice hotel"));
        hotels.add(new Hotel ("Gatway ", "Vancouver", "It's very good hotel"));
        hotels.add(new Hotel ("Trump's Hotel ", "Texas", "It's very good hotel"));
    }

    public static ArrayList<Hotel> getAll() {
        if (hotels == null)
            initData();
        return hotels;
    }
}
