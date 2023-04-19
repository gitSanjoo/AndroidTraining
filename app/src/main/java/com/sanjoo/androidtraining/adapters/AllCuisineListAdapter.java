package com.sanjoo.androidtraining.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sanjoo.androidtraining.Interfaces.CusineRecyclerViewInterface;
import com.sanjoo.androidtraining.R;
import com.sanjoo.androidtraining.models.Cuisine;

import java.util.ArrayList;

public class AllCuisineListAdapter extends RecyclerView.Adapter<AllCuisineListAdapter.AllCuisineListViewHolder> implements CusineRecyclerViewInterface {

    private ArrayList<Cuisine> cuisine;
    private final CusineRecyclerViewInterface cusineRecyclerViewInterface;
    public AllCuisineListAdapter(ArrayList<Cuisine> cuisine, CusineRecyclerViewInterface cusineRecyclerViewInterface){
        this.cuisine=cuisine;
        this.cusineRecyclerViewInterface = cusineRecyclerViewInterface;
    }

    @NonNull
    @Override
    public AllCuisineListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.list_cusine,parent,false);
        return new AllCuisineListViewHolder(view,cusineRecyclerViewInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull AllCuisineListViewHolder holder, int position) {
        holder.cuisineNameView.setText(cuisine.get(position).getName());
        holder.menuListButtonView.
//        holder.menuListView.
    }

    @Override
    public int getItemCount() {
        return cuisine.size();
    }

    @Override
    public void onItemClick(int position) {

    }


    public class AllCuisineListViewHolder extends RecyclerView.ViewHolder{
        TextView cuisineNameView;
//        RecyclerView menuListView;
        Button menuListButtonView;

        public AllCuisineListViewHolder(@NonNull View itemView,CusineRecyclerViewInterface cusineRecyclerViewInterface) {
            super(itemView);
            cuisineNameView=itemView.findViewById(R.id.cuisine_name);
            menuListButtonView=itemView.findViewById(R.id.cuisine_Button);
//            menuListView=itemView.findViewById(R.id.menu_list);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(cusineRecyclerViewInterface!=null){
                        int position=getAdapterPosition();
                    }
                }
            });
        }
    }
}
