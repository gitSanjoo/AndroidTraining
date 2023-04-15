package com.sanjoo.androidtraining;

import com.sanjoo.androidtraining.R;
import com.sanjoo.androidtraining.models.Cuisine;
import com.sanjoo.androidtraining.models.MenuItem;
import com.sanjoo.androidtraining.models.Restaurant;

import java.util.ArrayList;

public class DataProvider {

    private static ArrayList<MenuItem> menus = new ArrayList<>();
    private static ArrayList<Cuisine> cuisines = new ArrayList<>();
    private static ArrayList<Restaurant> restaurants = new ArrayList<>();

    public static void createMenus(){
        MenuItem dosa= new MenuItem("Dosa", R.drawable.ic_launcher_background,80.00F);
        menus.add(dosa);
    }

    public static void createCuisines(){

    }

    public static void createRestaurants(){

    }


    public static ArrayList<MenuItem> getMenus() {
        return menus;
    }
}
