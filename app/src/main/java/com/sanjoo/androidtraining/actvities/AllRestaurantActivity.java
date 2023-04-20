package com.sanjoo.androidtraining.actvities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.sanjoo.androidtraining.DefaultRestaurantDataProvider;
import com.sanjoo.androidtraining.R;
import com.sanjoo.androidtraining.adapters.AllRestaurantListAdapter;

public class AllRestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_restaurant);
        RecyclerView restaurantRecyclerView=findViewById(R.id.rest_recyclerView);
        restaurantRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        restaurantRecyclerView.setAdapter(new AllRestaurantListAdapter(DefaultRestaurantDataProvider.getRestaurants()));
    }
}