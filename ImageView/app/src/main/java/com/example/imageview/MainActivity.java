package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img,img1;
    Drawable drawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        img=findViewById(R.id.imageView);
        drawable=getResources().getDrawable(R.drawable.image);
        img.setImageDrawable(drawable);

        img1=findViewById(R.id.imageView1);
        drawable=getResources().getDrawable(R.drawable.images1);
        img1.setImageDrawable(drawable);
    }
}