package com.sanjoo.androidtraining.Enum;

public enum CuisineType {
    NORTH_INDIAN,SOUTH_INDIAN,CHINESE,ITALIAN;

    public static CuisineType getCuisineTypeFromString(String cuisineType){
        switch (cuisineType){
            case "North Indian":
                return NORTH_INDIAN;
            case "SOUTH_INDIAN Indian":
                return SOUTH_INDIAN;
            case "Chinese":
                return CHINESE;
            case "ITALIan":
                return ITALIAN;
            default:
                return NORTH_INDIAN;
        }
    }
}
