package com.example.yusufmb.test;

public class restaurantModels {

    private int picture;
    private String name;
    private String address;
    private String about;
    private String openinghours;

    public restaurantModels(int picture, String name, String address, String about, String openinghours) {
        this.picture = picture;
        this.name = name;
        this.address = address;
        this.about = about;
        this.openinghours = openinghours;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getOpeninghours() {
        return openinghours;
    }

    public void setOpeninghours(String openinghours) {
        this.openinghours = openinghours;
    }
}
