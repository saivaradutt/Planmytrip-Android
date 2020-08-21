package com.example.myapplication.model;

public class UserProfile {

    String UserId;
    String fName;
    String lName;
    String email;
    String password;
    int phoneNumber;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    String gender;

    public UserProfile(String userId, String fName, String lName, String email, String password, String gender) {
        this.UserId = userId;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.password = password;
        this.gender = gender;
    }



    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
