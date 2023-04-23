package com.sanjoo.androidtraining;

import com.sanjoo.androidtraining.Enum.CuisineType;
import com.sanjoo.androidtraining.models.Cuisine;
import com.sanjoo.androidtraining.models.MenuItem;
import com.sanjoo.androidtraining.models.Restaurant;
import com.sanjoo.androidtraining.utils.Constants;

import java.util.ArrayList;

public class DefaultRestaurantDataProvider {
    //means every restaurant has every cuisine, every cuisine has every menu item

    private static ArrayList<MenuItem> menus = new ArrayList<>();
    private static ArrayList<Cuisine> cuisines = new ArrayList<>();
    private static ArrayList<Restaurant> restaurants = new ArrayList<>();

    public static void createAllMenuItems(){
        MenuItem dosa= new MenuItem(Constants.MENU_NAME_DOSA, R.drawable.south_indian,80.00F, CuisineType.SOUTH_INDIAN);
        menus.add(dosa);
        MenuItem idli=new MenuItem(Constants.MENU_NAME_IDLI,R.drawable.south_indian,70,CuisineType.SOUTH_INDIAN);
        menus.add(idli);
        MenuItem sambar=new MenuItem(Constants.MENU_NAME_SAMBAR,R.drawable.south_indian,40,CuisineType.SOUTH_INDIAN);
        menus.add(sambar);
        MenuItem pizza=new MenuItem(Constants.MENU_NAME_PIZZA,R.drawable.italian,150,CuisineType.ITALIAN);
        menus.add(pizza);
        MenuItem chaw_mein=new MenuItem(Constants.MENU_NAME_CHAW_MINE,R.drawable.chinese,56,CuisineType.CHINESE);
        menus.add(chaw_mein);
        MenuItem pratha=new MenuItem(Constants.MENU_NAME_PRATHA,R.drawable.north_indian,45,CuisineType.NORTH_INDIAN);
        menus.add(pratha);
        MenuItem ribollita=new MenuItem(Constants.MENU_NAME_RIBOLLITA,R.drawable.italian,150,CuisineType.ITALIAN);
        menus.add(ribollita);
        MenuItem noodles=new MenuItem(Constants.MENU_NAME_NOODLES,R.drawable.chinese,56,CuisineType.CHINESE);
        menus.add(noodles);
        MenuItem sahiPaneer=new MenuItem(Constants.MENU_NAME_SAHI_PANEER,R.drawable.north_indian,45,CuisineType.NORTH_INDIAN);
        menus.add(sahiPaneer);
        MenuItem polenta=new MenuItem(Constants.MENU_NAME_POLENTA,R.drawable.italian,150,CuisineType.ITALIAN);
        menus.add(polenta);
        MenuItem jiangsu=new MenuItem(Constants.MENU_NAME_JIANGSU,R.drawable.chinese,56,CuisineType.CHINESE);
        menus.add(jiangsu);
        MenuItem salad=new MenuItem(Constants.MENU_NAME_SALAD,R.drawable.north_indian,45,CuisineType.NORTH_INDIAN);
        menus.add(salad);

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
        Cuisine southIndian=new Cuisine(Constants.CUISINE_NAME_SOUTH_INDIAN,new ArrayList<MenuItem>(),R.drawable.south_indian);
        southIndian.addMenuItems(getAllSpecificMenuItems(CuisineType.SOUTH_INDIAN));
        cuisines.add(southIndian);
        Cuisine italian=new Cuisine(Constants.CUISINE_NAME_ITALIAN,new ArrayList<MenuItem>(),R.drawable.italian);
        italian.addMenuItems(getAllSpecificMenuItems(CuisineType.ITALIAN));
        cuisines.add(italian);
        Cuisine northIndian=new Cuisine(Constants.CUISINE_NAME_NORTH_INDIAN,new ArrayList<MenuItem>(),R.drawable.italian);
        northIndian.addMenuItems(getAllSpecificMenuItems(CuisineType.NORTH_INDIAN));
        cuisines.add(northIndian);
        Cuisine chinese=new Cuisine(Constants.CUISINE_NAME_CHINESE,new ArrayList<MenuItem>(),R.drawable.chinese);
        chinese.addMenuItems(getAllSpecificMenuItems(CuisineType.CHINESE));
        cuisines.add(chinese);



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
        ArrayList<Cuisine> oldRaoCuisines=new ArrayList<>();
        for (Cuisine cuisine:cuisines){
            if (cuisine.getName().equals(Constants.CUISINE_NAME_CHINESE) || cuisine.getName().equals(Constants.CUISINE_NAME_NORTH_INDIAN)){
                oldRaoCuisines.add(cuisine);
            }
        }

        ArrayList<Cuisine> oysterCuisines=new ArrayList<>();
        for (Cuisine cuisine:cuisines){
            if(cuisine.getName().equals(Constants.CUISINE_NAME_CHINESE)){
                oysterCuisines.add(cuisine);
            }
        }

        ArrayList<Cuisine> leArabiaCuisines=new ArrayList<>();
        for (Cuisine cuisine:cuisines){
            if(cuisine.getName().equals(Constants.CUISINE_NAME_ITALIAN) || cuisine.getName().equals(Constants.CUISINE_NAME_CHINESE)){
                leArabiaCuisines.add(cuisine);
            }
        }

        ArrayList<Cuisine> ashaTiffinsCuisines=new ArrayList<>();
        for (Cuisine cuisine:cuisines){
            if(cuisine.getName().equals(Constants.CUISINE_NAME_SOUTH_INDIAN) || cuisine.getName().equals(Constants.CUISINE_NAME_CHINESE)){
                ashaTiffinsCuisines.add(cuisine);
            }
        }

        Restaurant oldRao=new Restaurant(Constants.REST_NAME_OLD_RAO,454332,oldRaoCuisines);
        restaurants.add(oldRao);
        Restaurant oyster=new Restaurant(Constants.REST_NAME_OYSTER,687709898,oysterCuisines);
        restaurants.add(oyster);
        Restaurant leArabia=new Restaurant(Constants.REST_NAME_LE_ARABIA,55555555,leArabiaCuisines);
        restaurants.add(leArabia);

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
