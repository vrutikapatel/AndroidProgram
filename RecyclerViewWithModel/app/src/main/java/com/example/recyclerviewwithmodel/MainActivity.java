package com.example.recyclerviewwithmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<DemoModel> demoModelList;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        demoModelList=new ArrayList<>();

        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),3,GridLayoutManager.VERTICAL,false));
        demoModelList.add(new DemoModel("Text 1"));
        demoModelList.add(new DemoModel("Text 2"));
        demoModelList.add(new DemoModel("Text 3"));
        demoModelList.add(new DemoModel("Text 4"));
        demoModelList.add(new DemoModel("Text 5"));
        demoModelList.add(new DemoModel("Text 6"));
        demoModelList.add(new DemoModel("Text 7"));
        demoModelList.add(new DemoModel("Text 8"));
        demoModelList.add(new DemoModel("Text 9"));
        recyclerView.setAdapter(new DemoAdapter(demoModelList));
    }
}