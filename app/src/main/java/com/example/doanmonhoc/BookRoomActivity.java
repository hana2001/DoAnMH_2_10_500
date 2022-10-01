package com.example.doanmonhoc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;

public class BookRoomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_room);

        ImageButton btnCheckIn, btnCheckOut;

        btnCheckIn = findViewById(R.id.btn_dateCheckIn);
        btnCheckOut = findViewById(R.id.btn_dateCheckOut);

        btnCheckIn.setOnClickListener(this);
        btnCheckOut.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        // Get Current Date
        Calendar calendar= Calendar.getInstance();
        int Year = calendar.get(Calendar.YEAR);
        int Month = calendar.get(Calendar.MONTH);
        int Day = calendar.get(Calendar.DAY_OF_MONTH);
        switch (view.getId()) {
            case R.id.btn_dateCheckIn case R.id.btn_dateCheckOut:
                DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyy");
                                Calendar chooseDate = Calendar.getInstance();
                                chooseDate.set(i,i1,i2);
                                String trDate = simpleDateFormat.format(chooseDate.getTime());

                                if (view.getId() == R.id.btn_dateCheckIn)
                                txtDate.setText(trDate);
                                txtDate.setTag(chooseDate.getTime());
                                txtDate.setError(null);
                            }
                        }, Year, Month, Day

                );
                datePickerDialog.show();
                break;
        }
    }



}