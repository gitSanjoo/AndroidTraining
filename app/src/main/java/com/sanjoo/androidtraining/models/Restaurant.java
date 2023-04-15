package com.sanjoo.androidtraining.models;

import java.util.List;

public class Restaurant {
    private  String restaurantName;
    private long contactNumber;
    private List<Cuisine> cuisines;

    public Restaurant(String restaurantName, long contactNumber, List<Cuisine> cuisines) {
        this.restaurantName = restaurantName;
        this.contactNumber = contactNumber;
        this.cuisines = cuisines;
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

    public List<Cuisine> getCuisines() {
        return cuisines;
    }

    public void setCuisines(List<Cuisine> cuisines) {
        this.cuisines = cuisines;
    }

    public void addCuisine(Cuisine cuisine){
        cuisines.add(cuisine);
    }

    public void addCuisines(List<Cuisine> cuisines){this.cuisines.addAll(cuisines);}
}
