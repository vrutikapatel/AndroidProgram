package com.example.switchexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Switch switch1,switch2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switch1=(Switch) findViewById(R.id.switch1);
        switch2=(Switch) findViewById(R.id.switch2);
        button=(Button) findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1,s2;
                if(switch1.isChecked())
                    s1=switch1.getTextOn().toString();
                else
                    s1=switch1.getTextOff().toString();

                if(switch2.isChecked())
                    s2=switch2.getTextOn().toString();
                else
                    s2=switch2.getTextOff().toString();

                Toast.makeText(getApplicationContext(),"Switch 1 :"+ s1 +"\n"+"Switch 2 :"+ s2 ,Toast.LENGTH_LONG).show();
            }
        });
    }
}