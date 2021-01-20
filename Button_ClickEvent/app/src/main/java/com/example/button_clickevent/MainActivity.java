package com.example.button_clickevent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonDisplay;
    EditText editTxtName;
    TextView txtViewName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonDisplay=(Button)findViewById(R.id.button);
        editTxtName=(EditText)findViewById(R.id.editText);
        txtViewName=(TextView)findViewById(R.id.textName);

        buttonDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Display Text
                txtViewName.setText(editTxtName.getText().toString());

                //Toast msg display
                Toast.makeText(getApplicationContext(),editTxtName.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}