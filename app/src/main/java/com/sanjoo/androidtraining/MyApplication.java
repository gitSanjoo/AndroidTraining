package com.sanjoo.androidtraining;

import android.app.Application;
import android.util.Log;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DataProvider.createMenus();
        Log.d("menuItems",DataProvider.getMenus().toString());
    }
}
