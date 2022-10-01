package com.example.doanmonhoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.doanmonhoc.databinding.ActivityRoomsBinding;
import com.example.doanmonhoc.models.Room;

import java.util.ArrayList;

public class RoomsActivity extends AppCompatActivity {

    private ActivityRoomsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRoomsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();

        ArrayList<Room> rooms = (ArrayList<Room>) intent.getSerializableExtra("data");

        Bundle bundle = new Bundle();
        bundle.putSerializable("data", rooms);
        RoomFragment fragment = new RoomFragment();
        fragment.setArguments(bundle);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frameData, fragment).commit();

    }
}