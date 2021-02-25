package com.example.ratingbarexample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RatingBar ratingBar=(RatingBar) findViewById(R.id.ratingBar);
        Button button=(Button) findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String totalStar="Total Stars : "+ratingBar.getNumStars();
                String rating="Rating : "+ratingBar.getRating();

                Toast.makeText(getApplicationContext(),totalStar+ "\n"+rating,Toast.LENGTH_LONG).show();
            }
        });
    }
}