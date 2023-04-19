package com.sanjoo.androidtraining.actvities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.sanjoo.androidtraining.DefaultRestaurantDataProvider;
import com.sanjoo.androidtraining.R;
import com.sanjoo.androidtraining.adapters.AllCuisineListAdapter;

public class AllCuisineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_cuisine);
        RecyclerView cuisineRecyclerView=findViewById(R.id.allCuisine);
        cuisineRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        cuisineRecyclerView.setAdapter(new AllCuisineListAdapter(DefaultRestaurantDataProvider.getCuisines(), cusineRecyclerViewInterface));
    }
}