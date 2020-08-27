package com.example.myapplication.model;

public class Hotel  {

    public String hotelName;
    public String city;
    public String description;


    public Hotel(String hotelName, String city, String description) {
        this.hotelName = hotelName;
        this.city = city;
        this.description = description;
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

}
