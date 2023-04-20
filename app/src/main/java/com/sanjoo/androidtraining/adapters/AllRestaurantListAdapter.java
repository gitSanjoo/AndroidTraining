package com.sanjoo.androidtraining.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sanjoo.androidtraining.R;
import com.sanjoo.androidtraining.actvities.AllCuisineActivity;
import com.sanjoo.androidtraining.models.Restaurant;

import java.util.ArrayList;

public class AllRestaurantListAdapter extends RecyclerView.Adapter<AllRestaurantListAdapter.AllRestaurantViewHolder> {


    private ArrayList<Restaurant> restaurants;
    public AllRestaurantListAdapter(ArrayList<Restaurant> restaurants){
        this.restaurants=restaurants;
    }

    @NonNull
    @Override
    public AllRestaurantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.list_restaurant,parent,false);
        return new AllRestaurantViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AllRestaurantViewHolder holder, int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), AllCuisineActivity.class);
                intent.putParcelableArrayListExtra("bundle_key_for_cuisines",restaurants.get(position).getCuisines());
                v.getContext().startActivity(intent);
            }
        });
        holder.restaurantNameView.setText(restaurants.get(position).getRestaurantName());
        holder.contactNoView.setText(String.valueOf(restaurants.get(position).getContactNumber()));
        holder.restaurantImageView.setImageResource(restaurants.get(position).getRestaurantImage());
    }

    @Override
    public int getItemCount() {
        return restaurants.size();
    }

    public class AllRestaurantViewHolder extends RecyclerView.ViewHolder{
        TextView restaurantNameView;
        TextView contactNoView;
        ImageView restaurantImageView;
        public AllRestaurantViewHolder(@NonNull View itemView) {
            super(itemView);
            restaurantNameView=itemView.findViewById(R.id.rest_name);
            contactNoView=itemView.findViewById(R.id.rest_Contact_no);
            restaurantImageView=itemView.findViewById(R.id.rest_image);
        }
    }
}
