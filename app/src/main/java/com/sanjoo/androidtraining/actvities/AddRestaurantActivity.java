package com.sanjoo.androidtraining.actvities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.sanjoo.androidtraining.R;
import com.sanjoo.androidtraining.models.Restaurant;

public class AddRestaurantActivity extends AppCompatActivity {
    TextInputEditText restNameEditText,restContactNoEditText,restAddressEditText;
    Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_restaurant);

        restNameEditText=findViewById(R.id.restNameEditText);
        restContactNoEditText=findViewById(R.id.restContactEditText);
        restAddressEditText=findViewById(R.id.restAddressEditText);

        saveButton=findViewById(R.id.saveRestButton);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Restaurant restaurant=new Restaurant(restNameEditText.getText().toString(),
                        Integer.parseInt(restContactNoEditText.getText().toString()),
                        R.drawable.baseline_add_home_24,restAddressEditText.getText().toString());
                Log.d("restaurant",restaurant.toString());
            }
        });
    }
}