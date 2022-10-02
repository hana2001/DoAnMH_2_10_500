package com.example.doanmonhoc;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.doanmonhoc.activity.MainActivity;
import com.example.doanmonhoc.databinding.ActivityBookRoomBinding;
import com.example.doanmonhoc.models.Room;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BookRoomActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityBookRoomBinding binding;

    Room room;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityBookRoomBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnBack.setOnClickListener(view -> finish());


        Intent intent = getIntent();

        room = (Room) intent.getSerializableExtra("data");

        ImageButton btnCheckIn, btnCheckOut;

        btnCheckIn = findViewById(R.id.btn_dateCheckIn);
        btnCheckOut = findViewById(R.id.btn_dateCheckOut);

        btnCheckIn.setOnClickListener(this);
        btnCheckOut.setOnClickListener(this);
        binding.btnDatPhong.setOnClickListener(view -> {
            // Todo: Kiểm ta thông tin nhâp
            if (binding.etName.getText().toString().isEmpty()) {
                binding.etName.setError("Vui lòng nhập họ tên");
                binding.etName.setFocusable(true);
                return ;
            }
            if (binding.SDT.getText().toString().isEmpty()) {
                binding.SDT.setError("Vui lòng nhập số điện thoại");
                binding.SDT.setFocusable(true);
                return ;
            }
            if (binding.inDateCheckIn.getText().toString().isEmpty()) {
                binding.inDateCheckIn.setError("Vui lòng nhập ngày đặt");
                binding.inDateCheckIn.setFocusable(true);
                return ;
            }
            if (binding.inDateCheckOut.getText().toString().isEmpty()) {
                binding.inDateCheckOut.setError("Vui lòng nhập ngày trả");
                binding.inDateCheckOut.setFocusable(true);
                return;
            }
            Toast.makeText(this, "Đặt hàng thành công", Toast.LENGTH_SHORT).show();
            finish();
            view.getContext().startActivity(new Intent(view.getContext(), MainActivity.class));
        });

    }

    @Override
    public void onClick(View view) {
        // Get Current Date
        Calendar calendar= Calendar.getInstance();
        int Year = calendar.get(Calendar.YEAR);
        int Month = calendar.get(Calendar.MONTH);
        int Day = calendar.get(Calendar.DAY_OF_MONTH);
        switch (view.getId()) {
            case R.id.btn_dateCheckIn: case R.id.btn_dateCheckOut:
                DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyy");
                                Calendar chooseDate = Calendar.getInstance();
                                chooseDate.set(i,i1,i2);
                                String trDate = simpleDateFormat.format(chooseDate.getTime());

                                if (view.getId() == R.id.btn_dateCheckIn) {
                                    binding.inDateCheckIn.setText(trDate);
                                    binding.inDateCheckIn.setTag(chooseDate.getTime());
                                    binding.inDateCheckIn.setError(null);

                                } else {
                                    binding.inDateCheckOut.setText(trDate);
                                    binding.inDateCheckOut.setTag(chooseDate.getTime());
                                    binding.inDateCheckOut.setError(null);

                                    if (!binding.inDateCheckIn.toString().isEmpty() && !binding.inDateCheckOut.toString().isEmpty()) {
                                        Date dateCheckIn, dateCheckOut;
                                        try {
                                            dateCheckIn = simpleDateFormat.parse(binding.inDateCheckIn.getText().toString());
                                            dateCheckOut = simpleDateFormat.parse(binding.inDateCheckOut.getText().toString());

                                            int countDay = (int) ((dateCheckOut.getTime() - dateCheckIn.getTime()) / 86400000);
                                            double totalPrice = room.getPriceRoom() * countDay;

                                            DecimalFormat decimalFormat = new DecimalFormat("###,###,###");
                                            binding.tvTongTien.setText(String.format("Tổng tiền: %s đ", decimalFormat.format( totalPrice )));
                                        } catch (ParseException e) {
                                            e.printStackTrace();
                                        }

                                    }
                                }
                            }
                        }, Year, Month, Day

                );
                datePickerDialog.show();
                break;
        }
    }



}