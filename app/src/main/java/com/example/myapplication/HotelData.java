package com.example.myapplication;

import com.example.myapplication.model.Country;

import java.util.ArrayList;

public class HotelData {

    private static ArrayList<Country> countries;

    private static void initData() {
        countries = new ArrayList<>();
        countries.add(new Country("India", "It's land for many religions and cultures", R.drawable.india ));
        countries.add(new Country("Canada", "Get ready to play with lot of snow balls", R.drawable.canada));
        countries.add(new Country("UnitedStates", "Time to see world's largest sky scrappers", R.drawable.us));
       //countries.add(new Country("Trump's Hotel ", "Texas", "It's very good hotel","canada"));
    }

    public static ArrayList<Country> getAll() {
        if (countries == null)
            initData();
        return countries;
    }
   /* public static int getImageID(String imageName) {
        try {
            return R.drawable.class.getField(imageName).getInt(null);
        } catch (NoSuchFieldException | IllegalAccessException exception) {
            exception.printStackTrace();
        }
        return -1;
    }

    */
}
