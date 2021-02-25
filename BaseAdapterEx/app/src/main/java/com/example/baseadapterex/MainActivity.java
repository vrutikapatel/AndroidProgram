package com.example.baseadapterex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    int flags[]={R.drawable.india,R.drawable.america,R.drawable.australia,R.drawable.china,R.drawable.newzealand,R.drawable.portugal};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=(GridView) findViewById(R.id.gridView);

        CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),flags);
        gridView.setAdapter(customAdapter);
    }
}