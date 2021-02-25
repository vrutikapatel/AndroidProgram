package com.example.customsimpleadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] fruitNames={"Apple","Banana","Litchi","Mango","PineApple"};
    int[] fruitImage={R.drawable.apple,R.drawable.banana,R.drawable.litchi,R.drawable.mango,R.drawable.pineapple};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView) findViewById(R.id.listView);

        ArrayList<HashMap<String,String>> arrayList=new ArrayList<>();
        for (int i=0;i<fruitNames.length;i++){

            HashMap<String,String> hashMap=new HashMap<>();
            hashMap.put("name",fruitNames[i]);
            hashMap.put("image",fruitImage[i]+ "");
            arrayList.add(hashMap);
        }

        String[] from={"name","image"};
        int[] to={R.id.textView,R.id.imageView};
        CustomAdapter customAdapter=new CustomAdapter(this,arrayList,R.layout.list_view_items,from,to);
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(getApplicationContext(),fruitNames[i],Toast.LENGTH_LONG).show();
            }
        });
    }
}