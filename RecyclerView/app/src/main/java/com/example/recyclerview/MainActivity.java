package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView programmingList=(RecyclerView) findViewById(R.id.programingList);
        programmingList.setLayoutManager(new LinearLayoutManager(this));
        String[] language={"C","Java","c#","C++","Android Studio","Python","Php","JavaScript","Html","Css","Angular","Bootstrap"};
        programmingList.setAdapter(new ProgrammingAdapter(language));
    }
}