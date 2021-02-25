package com.example.datepickerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatePicker datePicker;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datePicker=(DatePicker) findViewById(R.id.date_Picker);
        datePicker.setSpinnersShown(false);
        button=(Button) findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day="Day = "+ datePicker.getDayOfMonth();
                String month="Month = "+(datePicker.getMonth()+1);
                String year="Year = "+datePicker.getYear();

                Toast t=Toast.makeText(getApplicationContext(),day +"\n"+month+"\n"+year,Toast.LENGTH_LONG);
                View view=t.getView();
                view.setBackgroundColor(Color.BLACK);
                TextView textView=view.findViewById(android.R.id.message);
                textView.setTextColor(Color.WHITE);
                textView.setTextSize(20);
                t.show();
            }
        });

    }
}