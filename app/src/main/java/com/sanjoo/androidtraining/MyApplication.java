package com.sanjoo.androidtraining;

import android.app.Application;
import android.util.Log;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DefaultRestaurantDataProvider.createAllMenuItems();
        Log.d("menuItems", DefaultRestaurantDataProvider.getMenus().toString());
        DefaultRestaurantDataProvider.createDefaultCuisines();
        Log.d("cuisineItems", DefaultRestaurantDataProvider.getCuisines().toString());
        DefaultRestaurantDataProvider.createRestaurants();
        Log.d("restaurants", DefaultRestaurantDataProvider.getRestaurants().toString());

    }
}
