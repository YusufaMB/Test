package com.example.yusufmb.test;

public class Suya_spot {

    private int picture;
    private String name;
    private String address;
    private String items;
    private String date;

    public Suya_spot(int picture, String name, String address, String items, String date) {
        this.picture = picture;
        this.name = name;
        this.address = address;
        this.items = items;
        this.date = date;
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

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
