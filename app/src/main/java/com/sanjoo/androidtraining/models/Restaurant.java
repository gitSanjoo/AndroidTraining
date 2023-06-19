package com.sanjoo.androidtraining.models;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private  String restaurantName;
    private long contactNumber;
    private ArrayList<Cuisine> cuisines;
    private int restaurantImage;
    private String restaurantAddress;

    public Restaurant(String restaurantName, long contactNumber, ArrayList<Cuisine> cuisines) {
        this.restaurantName = restaurantName;
        this.contactNumber = contactNumber;
        this.cuisines = cuisines;
    }

    public int getRestaurantImage() {
        return restaurantImage;
    }

    public void setRestaurantImage(int restaurantImage) {
        this.restaurantImage = restaurantImage;
    }

    public Restaurant(String restaurantName, long contactNumber, int restaurantImage,String restaurantAddress) {
        this.restaurantName = restaurantName;
        this.contactNumber = contactNumber;
        this.restaurantImage=restaurantImage;
        this.restaurantAddress=restaurantAddress;
    }


    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public ArrayList<Cuisine> getCuisines() {
        return cuisines;
    }

    public void setCuisines(ArrayList<Cuisine> cuisines) {
        this.cuisines = cuisines;
    }

    public void addCuisine(Cuisine cuisine){
        cuisines.add(cuisine);
    }

    public void addCuisines(ArrayList<Cuisine> cuisines){this.cuisines.addAll(cuisines);}

    @Override
    public String toString() {
        return "Restaurant{" +
//                "restaurantName='" + restaurantName + '\'' +
//                ", contactNumber=" + contactNumber +
//                ", cuisines=" + cuisines +
                '}';
    }
}
