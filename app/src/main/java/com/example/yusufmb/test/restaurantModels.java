package com.example.yusufmb.test;

public class restaurantModels {

    private int picture;
    private String name;
    private String address;

    public restaurantModels(int picture, String name, String address) {
        this.picture = picture;
        this.name = name;
        this.address = address;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPicture() {
        return picture;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
