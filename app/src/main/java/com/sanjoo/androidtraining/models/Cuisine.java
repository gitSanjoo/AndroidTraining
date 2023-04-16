package com.sanjoo.androidtraining.models;

import com.sanjoo.androidtraining.Enum.RestaurantType;

import java.util.List;

public class Cuisine {
    
    private String name;
    private List<MenuItem> menuItems;

    public Cuisine(String name, List<MenuItem> menuItems) {
        this.name = name;
        this.menuItems = menuItems;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
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
                '}';
    }
}
