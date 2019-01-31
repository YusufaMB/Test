package com.example.yusufmb.test;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class restaurantAdapter extends RecyclerView.Adapter<restaurantAdapter.ViewHolder> {
    private ArrayList<String> restaurantList;
    restaurantAdapter(ArrayList<String> restaurantList) {this.restaurantList = restaurantList;}


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_viewholder, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.name.setText(restaurantList.get(position));
    }

    @Override
    public int getItemCount() {
        return 0;


 class Viewholder extends RecyclerView.ViewHolder{
        private TextView name;
        private TextView address;
        ViewHolder(View itemView){
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.ss_name);
        }
 }
 }
}