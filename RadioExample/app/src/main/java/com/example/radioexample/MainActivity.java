package com.example.radioexample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton b1,b2,b3,b4,b5;
    String selectButton;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(RadioButton) findViewById(R.id.btn1);
        b2=(RadioButton) findViewById(R.id.btn2);
        b3=(RadioButton) findViewById(R.id.btn3);
        b4=(RadioButton) findViewById(R.id.btn4);
        b5=(RadioButton) findViewById(R.id.btn5);
        submit=(Button) findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b1.isChecked()) {
                    selectButton = b1.getText().toString();
                }
                else if(b2.isChecked()) {
                    selectButton = b2.getText().toString();
                }
                else if(b3.isChecked()) {
                    selectButton = b3.getText().toString();
                }
                else if(b4.isChecked()) {
                    selectButton = b4.getText().toString();
                }
                else if(b5.isChecked()) {
                    selectButton = b5.getText().toString();
                }

                Toast t=Toast.makeText(getApplicationContext(),selectButton,Toast.LENGTH_LONG);
                View view=t.getView();
                view.setBackgroundColor(Color.BLACK);
                TextView text=view.findViewById(android.R.id.message);
                text.setTextColor(Color.WHITE);
                t.show();
            }
        });
    }
}