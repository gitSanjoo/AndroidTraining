package com.sanjoo.androidtraining.models;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import com.sanjoo.androidtraining.Enum.CuisineType;

public class MenuItem implements Parcelable {

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

    protected MenuItem(Parcel in) {
        itemName = in.readString();
        itemImage = in.readInt();
        itemPrice = in.readFloat();
    }

    public static final Creator<MenuItem> CREATOR = new Creator<MenuItem>() {
        @Override
        public MenuItem createFromParcel(Parcel in) {
            return new MenuItem(in);
        }

        @Override
        public MenuItem[] newArray(int size) {
            return new MenuItem[size];
        }
    };

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
        /*return "MenuItem{" +
                "itemName='" + itemName +
//                + '\''
//                +
//                ", itemImage=" + itemImage +
//                ", itemPrice=" + itemPrice +
//                ", cuisineType=" + cuisineType +
                '}';*/
        return itemName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(itemName);
        dest.writeInt(itemImage);
        dest.writeFloat(itemPrice);
    }
}
