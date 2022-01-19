package com.example.sum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        Button Add_button = findViewById(R.id.submit);
//        TextView res = findViewById((R.id.res));

        Add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float number1 = Float.parseFloat(String.valueOf(num1.getText()));
                float number2 = Float.parseFloat(String.valueOf(num2.getText()));
                float sum = number1 + number2;
                
                Intent it = new Intent(getApplicationContext(), ResultPage.class);
                it.putExtra("res", Float.toString(sum));
                startActivity(it);
//                res.setText(Float.toString(sum));
            }
        });


    }
}
