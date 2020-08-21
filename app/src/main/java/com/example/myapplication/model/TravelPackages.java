package com.example.myapplication.model;

public class TravelPackages {


    String countryname;
    String description;
    String price;
    String city;
    int imageUrl;
    int bigimageurl;

    public TravelPackages(String countryname, String description, String price, String city, int
            imageUrl, int bigimageurl) {
        this.countryname = countryname;
        this.description = description;
        this.price = price;
        this.city = city;

        this.imageUrl = imageUrl;
        this.bigimageurl = bigimageurl;
    }

    public int getBigimageurl() {
        return bigimageurl;
    }

    public void setBigimageurl(int bigimageurl) {
        this.bigimageurl = bigimageurl;
    }

    public String getName() {
        return countryname;
    }

    public void setName(String name) {
        this.countryname = countryname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }



    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }
}

