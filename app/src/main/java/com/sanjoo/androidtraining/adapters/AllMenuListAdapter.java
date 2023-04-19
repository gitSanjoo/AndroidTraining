package com.sanjoo.androidtraining.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sanjoo.androidtraining.DefaultRestaurantDataProvider;
import com.sanjoo.androidtraining.R;
import com.sanjoo.androidtraining.models.MenuItem;

import java.util.ArrayList;

public class AllMenuListAdapter extends RecyclerView.Adapter<AllMenuListAdapter.AllMenuListViewHolder> {

    ArrayList<MenuItem> menuItems;
    public AllMenuListAdapter(ArrayList<MenuItem> menuItems){
        this.menuItems=menuItems;
    }
    @Override
    public AllMenuListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.list_menu_item,parent,false);
        return new AllMenuListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AllMenuListViewHolder holder, int position) {

        holder.menuItemImageView.setImageResource(menuItems.get(position).getItemImage());
        holder.menuNameView.setText( menuItems.get(position).getItemName());
        holder.menuPriceView.setText(String.valueOf(menuItems.get(position).getItemPrice()));
    }

    @Override
    public int getItemCount() {
        return menuItems.size();
    }

    public class AllMenuListViewHolder extends RecyclerView.ViewHolder{
        ImageView menuItemImageView;
        TextView  menuNameView;
        TextView menuPriceView;

        public AllMenuListViewHolder(@NonNull View itemView) {
            super(itemView);
            menuItemImageView=itemView.findViewById(R.id.menu_image);
            menuNameView=itemView.findViewById(R.id.menu_name);
            menuPriceView=itemView.findViewById(R.id.menu_price);
        }
    }
}




