package com.example.lab5_ph43159;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        findViewById(R.id.bai1).setOnClickListener(v -> {
            Intent intent = new Intent(home.this, MainActivity.class);
            startActivity(intent);
        });
        findViewById(R.id.bai3).setOnClickListener(v -> {
            Intent intent = new Intent(home.this, Bai2.class);
            startActivity(intent);
        });
    }
}