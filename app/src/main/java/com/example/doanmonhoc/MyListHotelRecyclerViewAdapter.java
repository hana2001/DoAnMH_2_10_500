package com.example.doanmonhoc;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.doanmonhoc.models.Hotel;
import com.example.doanmonhoc.databinding.FragmentListHotelBinding;

import java.util.ArrayList;


public class MyListHotelRecyclerViewAdapter extends RecyclerView.Adapter<MyListHotelRecyclerViewAdapter.ViewHolder> {

    private final ArrayList<Hotel> mValues;

    public MyListHotelRecyclerViewAdapter(ArrayList<Hotel> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentListHotelBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);

        holder.mHotelName.setText(holder.mItem.getName());
        holder.mHotelPrice.setText(holder.mItem.getPrice());

        // Todo: handle onClick item
        holder.mFrameItem.setOnClickListener(view -> {
            Bundle bd = new Bundle();
            bd.putSerializable("itemHotel", holder.mItem);

            Intent intent = new Intent(view.getContext(), DetailHotelActivity.class);
            intent.putExtra("Data", bd);
            view.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public Hotel mItem;
        public TextView mHotelName;
        public TextView mHotelPrice;
        public View mFrameItem;

        public ViewHolder(FragmentListHotelBinding binding) {
            super(binding.getRoot());
            this.mHotelName = binding.tvHotelName;
            this.mHotelPrice = binding.tvHotelPricePeriod;
            this.mFrameItem = binding.FrameItemHotel;
        }

    }
}