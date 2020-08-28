package com.example.myapplication;

import com.example.myapplication.model.Country;

import java.util.ArrayList;

public class HotelData {

    private static ArrayList<Country> countries;

    private static void initData() {
        countries = new ArrayList<>();
        countries.add(new Country("Novotel", "Montreal", "It's very good hotel","canada"));
        countries.add(new Country("Marraiot", "Toronto", "It's nice hotel","canada"));
        countries.add(new Country("Gatway ", "Vancouver", "It's very good hotel","canada"));
        countries.add(new Country("Trump's Hotel ", "Texas", "It's very good hotel","canada"));
    }

    public static ArrayList<Country> getAll() {
        if (countries == null)
            initData();
        return countries;
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
