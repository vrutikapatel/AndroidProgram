package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        ActivityMainBinding activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        //activityMainBinding.setMyVariable("Hello Data Binding");

        User user=new User("Hello","Android",true);
        activityMainBinding.setUser(user);

        activityMainBinding.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Activitya is run",Toast.LENGTH_SHORT).show();
            }
        });
    }
}