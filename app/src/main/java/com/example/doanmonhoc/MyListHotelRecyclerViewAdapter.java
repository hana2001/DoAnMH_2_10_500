package com.example.doanmonhoc;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
        holder.mImgHotel.setImageResource(holder.mItem.getImage());
        holder.mHotelName.setText(holder.mItem.getName());
        holder.mHotelName.setMaxLines(2);
        holder.mHotelName.setEllipsize(TextUtils.TruncateAt.END);//nếu mô tả quá dài thì hiện dấu 3 chấm
        holder.mHotelPrice.setText(holder.mItem.getPrice());
        holder.mLocation.setMaxLines(1);
        holder.mLocation.setText(holder.mItem.getLocation());
        holder.mLocation.setEllipsize(TextUtils.TruncateAt.END);//nếu mô tả quá dài thì hiện dấu 3 chấm


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
        public TextView mLocation;
        public ImageView mImgHotel;

        public ViewHolder(FragmentListHotelBinding binding) {
            super(binding.getRoot());
            this.mHotelName = binding.tvHotelName;
            this.mHotelPrice = binding.tvHotelPricePeriod;
            this.mFrameItem = binding.FrameItemHotel;
            this.mLocation = binding.tvLocation;
            this.mImgHotel = binding.imgHotel;
        }

    }
}