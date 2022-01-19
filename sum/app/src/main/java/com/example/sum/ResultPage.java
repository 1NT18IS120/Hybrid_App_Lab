package com.example.sum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_page);
        TextView r2 = findViewById(R.id.res);

        Intent it = getIntent();
        String sum = it.getStringExtra("res");
        r2.setText(sum);
    }
}