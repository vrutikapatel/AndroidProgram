package com.example.checkboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CheckBox android,java,php,python,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android=(CheckBox) findViewById(R.id.androidCheckBox);
        android.setOnClickListener(this);

        java=(CheckBox) findViewById(R.id.javaCheckBox);
        java.setOnClickListener(this);

        php=(CheckBox) findViewById(R.id.phpCheckBox);
        php.setOnClickListener(this);

        python=(CheckBox) findViewById(R.id.pythonCheckBox);
        python.setOnClickListener(this);

        c=(CheckBox) findViewById(R.id.cCheckBox);
        c.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.androidCheckBox:
                if(android.isChecked())
                    Toast.makeText(getApplicationContext(),"Android",Toast.LENGTH_LONG).show();
                break;

            case R.id.javaCheckBox:
                if(java.isChecked())
                    Toast.makeText(getApplicationContext(),"Java",Toast.LENGTH_LONG).show();
                break;

            case R.id.phpCheckBox:
                if(php.isChecked())
                    Toast.makeText(getApplicationContext(),"Php",Toast.LENGTH_LONG).show();
                break;

            case R.id.pythonCheckBox:
                if(python.isChecked())
                    Toast.makeText(getApplicationContext(),"Python",Toast.LENGTH_LONG).show();
                break;

            case R.id.cCheckBox:
                if(c.isChecked())
                    Toast.makeText(getApplicationContext(),"C",Toast.LENGTH_LONG).show();
                break;
        }
    }
}