package com.sanjoo.androidtraining.models;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import com.sanjoo.androidtraining.Enum.RestaurantType;

import java.util.ArrayList;
import java.util.List;

public class Cuisine implements Parcelable {
    
    private String name;
    private ArrayList<MenuItem> menuItems;
    private int cuisineImage;


    public Cuisine(String name, ArrayList<MenuItem> menuItems,int cuisineImage) {
        this.name = name;
        this.menuItems = menuItems;
        this.cuisineImage=cuisineImage;
    }

    protected Cuisine(Parcel in) {
        name = in.readString();
        menuItems = in.createTypedArrayList(MenuItem.CREATOR);
        cuisineImage = in.readInt();
    }

    public static final Creator<Cuisine> CREATOR = new Creator<Cuisine>() {
        @Override
        public Cuisine createFromParcel(Parcel in) {
            return new Cuisine(in);
        }

        @Override
        public Cuisine[] newArray(int size) {
            return new Cuisine[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCuisineImage() {
        return cuisineImage;
    }

    public void setCuisineImage(int cuisineImage) {
        this.cuisineImage = cuisineImage;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void addMenuItem(MenuItem menuItem){
        menuItems.add(menuItem);
    }

    public void addMenuItems(List<MenuItem> menuItems){
        this.menuItems.addAll(menuItems);
    }

    @Override
    public String toString() {
        return "Cuisine{" +
                "name='" + name + '\'' +
                ", menuItems=" + menuItems +
                ", cuisineImage=" + cuisineImage +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeTypedList(menuItems);
        dest.writeInt(cuisineImage);
    }
}
