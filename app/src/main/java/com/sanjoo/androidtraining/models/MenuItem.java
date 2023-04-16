package com.sanjoo.androidtraining.models;

import com.sanjoo.androidtraining.Enum.CuisineType;

public class MenuItem {

    private String itemName;
    private int itemImage;
    private float itemPrice;

    private CuisineType cuisineType;

    public MenuItem(String itemName, int itemImage, float itemPrice, CuisineType cuisineType) {
        this.itemName = itemName;
        this.itemImage = itemImage;
        this.itemPrice = itemPrice;
        this.cuisineType=cuisineType;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }

    public float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }

    public CuisineType getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(CuisineType cuisineType) {
        this.cuisineType = cuisineType;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "itemName='" + itemName + '\'' +
                ", itemImage=" + itemImage +
                ", itemPrice=" + itemPrice +
                ", cuisineType=" + cuisineType +
                '}';
    }
}
