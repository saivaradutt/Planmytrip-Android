package com.example.myapplication;

import com.example.myapplication.model.Hotel;

import java.util.ArrayList;

public class HotelData {

    private static ArrayList<Hotel> hotels;

    private static void initData() {
        hotels = new ArrayList<>();
        hotels.add(new Hotel ("Novotel", "Montreal", "It's very good hotel","canada"));
        hotels.add(new Hotel ("Marraiot", "Toronto", "It's nice hotel","canada"));
        hotels.add(new Hotel ("Gatway ", "Vancouver", "It's very good hotel","canada"));
        hotels.add(new Hotel ("Trump's Hotel ", "Texas", "It's very good hotel","canada"));
    }

    public static ArrayList<Hotel> getAll() {
        if (hotels == null)
            initData();
        return hotels;
    }
    public static int getImageID(String imageName) {
        try {
            return R.drawable.class.getField(imageName).getInt(null);
        } catch (NoSuchFieldException | IllegalAccessException exception) {
            exception.printStackTrace();
        }
        return -1;
    }
}
