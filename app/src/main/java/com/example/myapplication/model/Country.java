package com.example.myapplication.model;

import android.graphics.drawable.Drawable;

public class Country {

    public String countryName;
    public String countryDescription;
    public int imageName;

    public Country(String countryName, String countryDescription, int imageName) {
        this.countryName = countryName;
        this.countryDescription = countryDescription;
        this.imageName = imageName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryDescription() {
        return countryDescription;
    }

    public void setCountryDescription(String countryDescription) {
        this.countryDescription = countryDescription;
    }

    public int getImageName() {
        return imageName;
    }

    public void setImageName(int imageName) {
        this.imageName = imageName;
    }

}
