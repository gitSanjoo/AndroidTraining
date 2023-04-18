package com.sanjoo.androidtraining.actvities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.sanjoo.androidtraining.DefaultRestaurantDataProvider;
import com.sanjoo.androidtraining.R;
import com.sanjoo.androidtraining.adapters.AllMenuListAdapter;

public class AllMenuItemActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_menu_item);
        RecyclerView menuItemList=findViewById(R.id.allMenuItemList);
        menuItemList.setLayoutManager(new LinearLayoutManager(this));
        menuItemList.setAdapter(new AllMenuListAdapter(DefaultRestaurantDataProvider.getMenus()));
    }
}