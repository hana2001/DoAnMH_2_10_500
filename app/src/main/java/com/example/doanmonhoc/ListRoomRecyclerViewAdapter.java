package com.example.doanmonhoc;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.doanmonhoc.databinding.FragmentListRoomBinding;
import com.example.doanmonhoc.models.Room;

import java.util.ArrayList;

public class ListRoomRecyclerViewAdapter extends RecyclerView.Adapter<ListRoomRecyclerViewAdapter.ViewHolder> {

    private final ArrayList<Room> mValues;

    public ListRoomRecyclerViewAdapter(ArrayList<Room> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentListRoomBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);

        holder.mDescription.setText(holder.mItem.getDescriptionRoom());
        holder.mHotelPrice.setText(String.format("%.0f", holder.mItem.getPriceRoom()));

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

        public Room mItem;
        public TextView mDescription;
        public TextView mHotelPrice;
        public View mFrameItem;

        public ViewHolder(FragmentListRoomBinding binding) {
            super(binding.getRoot());
            this.mDescription = binding.tvLoaiPhong;
            this.mHotelPrice = binding.tvHotelPricePeriod;
            this.mFrameItem = binding.FrameItemRoom;

        }
    }
}