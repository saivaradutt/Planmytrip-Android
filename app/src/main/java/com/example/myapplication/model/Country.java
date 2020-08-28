package com.example.myapplication.model;

import android.graphics.drawable.Drawable;

public class Country {

    public String hotelName;
    public String city;
    public String description;
    public String imageName;;

    public Country(String hotelName, String city, String description, String imageName) {
        this.hotelName = hotelName;
        this.city = city;
        this.description = description;
        this.imageName=imageName;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

}
