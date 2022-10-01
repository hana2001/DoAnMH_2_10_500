package com.example.doanmonhoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.doanmonhoc.databinding.ActivityDetailHotelBinding;
import com.example.doanmonhoc.models.Hotel;

import org.w3c.dom.Text;

public class DetailHotelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDetailHotelBinding binding = ActivityDetailHotelBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());

        ImageView img = binding.imgview;

        TextView name = binding.tvHotelname4;
        TextView location = binding.tvLocation4;
        TextView description = binding.tvDescription;
        TextView price = binding.tvPrice;
        TextView owner = binding.tvOwnerName;
        TextView phone = binding.tvOwnerPhone;
        TextView workDay = binding.tvDayWork4;

        // btn
        Button btn = binding.btnReserve2;
        ImageButton btnFav = binding.imgBtnLike2;

        Intent intent = this.getIntent();

        Bundle bd = intent.getBundleExtra("Data");

        Hotel hotel = (Hotel) bd.getSerializable("itemHotel");

        name.setText(hotel.getName());
        location.setText(hotel.getLocation());
        description.setText(hotel.getDescription());
        price.setText( hotel.getPrice());
        phone.setText(hotel.getPhone());
    }

}