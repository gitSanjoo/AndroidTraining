package com.sanjoo.androidtraining.actvities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.sanjoo.androidtraining.Enum.CuisineType;
import com.sanjoo.androidtraining.R;
import com.sanjoo.androidtraining.models.MenuItem;

public class AddMenuActivity extends AppCompatActivity {

    TextInputEditText nameEditTextV,priceEditTextV,cuisineEditTextV;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_menu);

        nameEditTextV=findViewById(R.id.nameEditText);
        priceEditTextV=findViewById(R.id.priceEditText);
        cuisineEditTextV=findViewById(R.id.cuisineEditText);


        Button addMenuBtn=findViewById(R.id.addMenuButton);
        addMenuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MenuItem menuItem=new MenuItem(nameEditTextV.getText().toString(),R.drawable.rupee_icon,
                        Float.parseFloat(String.valueOf(priceEditTextV.getText())),CuisineType.getCuisineTypeFromString(cuisineEditTextV.getText().toString()));
                Log.d("addedMenuItem",menuItem.toString());
            }
        });
    }

}