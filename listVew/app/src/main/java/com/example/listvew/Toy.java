package com.example.listvew;

import android.graphics.Bitmap;

public class Toy {
    private  int price;
    private String Name;
    private  String Details;
    private Bitmap Image;

    public Toy(int price, String name, String details, Bitmap image) {
        this.price = price;
        Name = name;
        Details = details;
        Image = image;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }

    public Bitmap getImage() {
        return Image;
    }

    public void setImage(Bitmap image) {
        Image = image;
    }
}
