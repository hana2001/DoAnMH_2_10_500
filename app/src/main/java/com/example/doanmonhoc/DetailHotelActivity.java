package com.example.doanmonhoc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.doanmonhoc.activity.MainActivity;
import com.example.doanmonhoc.databinding.ActivityDetailHotelBinding;
import com.example.doanmonhoc.models.Hotel;
import com.example.doanmonhoc.models.Room;

import org.w3c.dom.Text;

import java.util.ArrayList;


public class DetailHotelActivity extends AppCompatActivity {
    private ActivityDetailHotelBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailHotelBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ImageView img = binding.imgview;

        TextView name = binding.tvHotelname4;
        TextView location = binding.tvLocation4;
        TextView description = binding.tvDescription;
        TextView price = binding.tvPrice;
        TextView owner = binding.tvOwnerName;
        TextView phone = binding.tvOwnerPhone;
        TextView workDay = binding.tvDayWork4;
        TextView more = binding.textViewMoreRoom;

        RecyclerView RCrooms = binding.RCrooms;

        // btn

        binding.btnBack.setOnClickListener(view -> view.getContext().startActivity(new Intent(view.getContext(), MainActivity.class)));

        Intent intent = this.getIntent();

        Bundle bd = intent.getBundleExtra("Data");

        Hotel hotel = (Hotel) bd.getSerializable("itemHotel");

        more.setOnClickListener(view -> {
            Intent intent1 = new Intent(view.getContext(), RoomsActivity.class);

            intent1.putExtra("data", hotel.getRooms());
            view.getContext().startActivity(intent1);
        });

        RCrooms.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<Room> rooms = new ArrayList<Room>();
        rooms.add(hotel.getRooms().get(0));
        rooms.add(hotel.getRooms().get(1));
        rooms.add(hotel.getRooms().get(2));

        RCrooms.setAdapter(new ListRoomRecyclerViewAdapter(rooms));

        name.setText(hotel.getName());
        location.setText(hotel.getLocation());
        description.setText(hotel.getDescription());
        String[] strings = hotel.getPrice().split(" ");
        price.setText(String.format("%s\n%s\n%s", strings[0], strings[1], strings[2]));
        phone.setText(hotel.getPhone());
    }

}