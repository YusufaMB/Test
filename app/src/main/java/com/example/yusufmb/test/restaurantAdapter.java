package com.example.yusufmb.test;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class restaurantAdapter extends RecyclerView.Adapter<restaurantAdapter.ViewHolder> {

    private final SuyaSpotClickListener mSuyaSpotClickListener;
    private List<restaurantModels> suyaSpots;
    private Context mContext;

    public restaurantAdapter(Context context, SuyaSpotClickListener listener) {
        mContext = context;
        mSuyaSpotClickListener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext)
                .inflate(R.layout.activity_viewholder, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        restaurantModels suyaSpot = suyaSpots.get(position);

        holder.imageView.setImageDrawable(AppCompatResources.getDrawable(mContext, suyaSpot.getPicture()));
        holder.nameView.setText(suyaSpot.getName());
        holder.addressView.setText(suyaSpot.getAddress());
    }

    @Override
    public int getItemCount() {
        if (suyaSpots == null) {
            return 0;
        }
        return suyaSpots.size();
    }

    public List<restaurantModels> getSuyaSpots() {
        return suyaSpots;
    }

    public void setSuyaSpots(List<restaurantModels> suyaSpots) {
        this.suyaSpots = suyaSpots;
        notifyDataSetChanged();
    }

    public interface SuyaSpotClickListener {
        void onSuyaSpotClicked(restaurantModels suyaSpot);
    }

    //View Holder class
    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView imageView;
        TextView nameView;
        TextView addressView;

        private ViewHolder(View suyaSpotView) {
            super(suyaSpotView);

            imageView = suyaSpotView.findViewById(R.id.image);
            nameView = suyaSpotView.findViewById(R.id.ss_name);
            addressView = suyaSpotView.findViewById(R.id.ss_address);

            suyaSpotView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            restaurantModels suyaSpot = getSuyaSpots().get(getAdapterPosition());
            mSuyaSpotClickListener.onSuyaSpotClicked(suyaSpot);
        }
    }
}