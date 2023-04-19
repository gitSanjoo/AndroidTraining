package com.sanjoo.androidtraining;

import com.sanjoo.androidtraining.Enum.CuisineType;
import com.sanjoo.androidtraining.models.Cuisine;
import com.sanjoo.androidtraining.models.MenuItem;
import com.sanjoo.androidtraining.models.Restaurant;

import java.util.ArrayList;

public class DefaultRestaurantDataProvider {
    //means every restaurant has every cuisine, every cuisine has every menu item

    private static ArrayList<MenuItem> menus = new ArrayList<>();
    private static ArrayList<Cuisine> cuisines = new ArrayList<>();
    private static ArrayList<Restaurant> restaurants = new ArrayList<>();

    public static void createAllMenuItems(){
        MenuItem dosa= new MenuItem("Dosa", R.drawable.south_indian,80.00F, CuisineType.SOUTH_INDIAN);
        menus.add(dosa);
        MenuItem idli=new MenuItem("Idli",R.drawable.south_indian,70,CuisineType.SOUTH_INDIAN);
        menus.add(idli);
        MenuItem sambar=new MenuItem("Sambar",R.drawable.south_indian,40,CuisineType.SOUTH_INDIAN);
        menus.add(sambar);
        MenuItem pizza=new MenuItem("Pizza",R.drawable.italian,150,CuisineType.ITALIAN);
        menus.add(pizza);
        MenuItem chaw_mein=new MenuItem("Chaw Mein",R.drawable.chinese,56,CuisineType.CHINESE);
        menus.add(chaw_mein);
        MenuItem pratha=new MenuItem("Pratha",R.drawable.north_indian,45,CuisineType.NORTH_INDIAN);
        menus.add(pratha);
        MenuItem pizza3=new MenuItem("Pizza",R.drawable.italian,150,CuisineType.ITALIAN);
        menus.add(pizza3);
        MenuItem chaw_mein1=new MenuItem("Chaw Mein",R.drawable.chinese,56,CuisineType.CHINESE);
        menus.add(chaw_mein1);
        MenuItem pratha1=new MenuItem("Pratha",R.drawable.north_indian,45,CuisineType.NORTH_INDIAN);
        menus.add(pratha1);
        MenuItem pizza1=new MenuItem("Pizza",R.drawable.italian,150,CuisineType.ITALIAN);
        menus.add(pizza1);
        MenuItem chaw_mein2=new MenuItem("Chaw Mein",R.drawable.chinese,56,CuisineType.CHINESE);
        menus.add(chaw_mein2);
        MenuItem pratha2=new MenuItem("Pratha",R.drawable.north_indian,45,CuisineType.NORTH_INDIAN);
        menus.add(pratha2);

    }
    private static long count=menus.stream().count();
    private static MenuItem menuItem;
    public static MenuItem getAllMenuItem(){
        for(MenuItem menuItem1:menus) {
            return menuItem1;
        }
        return menuItem;
    }

    public static void createDefaultCuisines(){             //return all cuisine types include ALL OF the typed menu items
        Cuisine southIndian=new Cuisine("South Indian",new ArrayList<MenuItem>());
        southIndian.addMenuItems(getAllSpecificMenuItems(CuisineType.SOUTH_INDIAN));
        cuisines.add(southIndian);
        Cuisine italian=new Cuisine("Italian",new ArrayList<MenuItem>());
        italian.addMenuItems(getAllSpecificMenuItems(CuisineType.ITALIAN));
        cuisines.add(italian);



        /*Cuisine italian=new Cuisine("Italian",menus);
        cuisines.add(italian);
        Cuisine  south1=new Cuisine("South Indian",menus);
        cuisines.add(south1);
        Cuisine south2=new Cuisine("South Indian",menus);
        cuisines.add(south2);
        Cuisine  chinese=new Cuisine("Chinese",menus);*/
    }

    private static ArrayList<MenuItem> getAllSpecificMenuItems(CuisineType cuisineType){
        ArrayList<MenuItem> specificMenuItems=new ArrayList();
        for (MenuItem menuItem : menus){
            if (menuItem.getCuisineType()==cuisineType){
                specificMenuItems.add(menuItem);
            }
        }
        return specificMenuItems;
    }

    public static void createRestaurants(){
        Restaurant oldRao=new Restaurant("Old Rao",454332,cuisines);
        restaurants.add(oldRao);
        Restaurant oyster=new Restaurant("Oyster",687709898,cuisines);
        restaurants.add(oyster);

    }

    public static ArrayList<MenuItem> getMenus() {
        return menus;
    }

    public static ArrayList getCuisines() {
        return cuisines;
    }
    public static ArrayList getRestaurants(){
        return restaurants;
    }
}
