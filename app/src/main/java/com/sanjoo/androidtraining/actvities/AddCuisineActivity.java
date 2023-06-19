package com.sanjoo.androidtraining.actvities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.sanjoo.androidtraining.DefaultRestaurantDataProvider;
import com.sanjoo.androidtraining.R;
import com.sanjoo.androidtraining.models.MenuItem;

import java.util.ArrayList;

public class AddCuisineActivity extends AppCompatActivity {
//    private ArrayList<MenuItem> menuItems;
//    public  AddCuisineActivity(ArrayList<MenuItem> menuItems){this.menuItems=menuItems;}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_cuisine);
        Spinner spinner = findViewById(R.id.menuSpinner);

        ArrayList<MenuItem> menuItems= DefaultRestaurantDataProvider.getMenus();


        ArrayAdapter<MenuItem> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item);
                arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                arrayAdapter.addAll(menuItems);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
          
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String menuName=parent.getItemAtPosition(position).toString();
                Toast.makeText(AddCuisineActivity.this, "selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}