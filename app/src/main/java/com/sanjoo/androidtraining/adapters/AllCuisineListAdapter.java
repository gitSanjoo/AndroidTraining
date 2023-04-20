package com.sanjoo.androidtraining.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sanjoo.androidtraining.R;
import com.sanjoo.androidtraining.actvities.AllMenuItemActivity;
import com.sanjoo.androidtraining.models.Cuisine;

import java.util.ArrayList;

public class AllCuisineListAdapter extends RecyclerView.Adapter<AllCuisineListAdapter.AllCuisineListViewHolder> {

    private ArrayList<Cuisine> cuisine;
    public AllCuisineListAdapter(ArrayList<Cuisine> cuisine){
        this.cuisine=cuisine;
    }

    @NonNull
    @Override
    public AllCuisineListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.list_cusine,parent,false);
        return new AllCuisineListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AllCuisineListViewHolder holder, int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), AllMenuItemActivity.class);
                v.getContext().startActivity(intent);
            }
        });
        holder.cuisineNameView.setText(cuisine.get(position).getName());
        holder.cuisineImageView.setImageResource(cuisine.get(position).getCuisineImage());
    }

    @Override
    public int getItemCount() {
        return cuisine.size();
    }




    public class AllCuisineListViewHolder extends RecyclerView.ViewHolder{
        TextView cuisineNameView;
        ImageView cuisineImageView;
        public AllCuisineListViewHolder(@NonNull View itemView) {
            super(itemView);
            cuisineNameView=itemView.findViewById(R.id.cuisine_name);
            cuisineImageView=itemView.findViewById(R.id.cuisine_image);
        }
    }
}
