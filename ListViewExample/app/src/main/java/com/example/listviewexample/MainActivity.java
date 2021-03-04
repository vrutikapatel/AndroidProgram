package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] data={"India","China","Australia","Portugle","America","NewZealand"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,R.layout.activity_listview,R.id.textView,data);
        listView.setAdapter(arrayAdapter);

    }
}