package com.sanjoo.androidtraining.actvities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sanjoo.androidtraining.R;

public class ManageRestaurantActivity extends AppCompatActivity {
    private Button moveToAddMenu,moveToCuisine,moveToRestaurant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_restaurant);
        moveToAddMenu=findViewById(R.id.add_menu_btn);
        moveToAddMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ManageRestaurantActivity.this,AddMenuActivity.class);
                startActivity(intent);
            }
        });

        moveToCuisine=findViewById(R.id.add_cuisine_btn);
        moveToCuisine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ManageRestaurantActivity.this,AddCuisineActivity.class);
                startActivity(intent);
            }
        });

        moveToRestaurant=findViewById(R.id.add_restaurant_btn);
        moveToRestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ManageRestaurantActivity.this,AddRestaurantActivity.class);
                startActivity(intent);
            }
        });
    }
}