package com.rafli.utsmuhammadrafliansyah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tvnama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportActionBar().setTitle("UTS Muhammad Rafliansyah");

        tvnama = findViewById(R.id.tv_nama);

        Intent terima = getIntent();
        String yNama = terima.getStringExtra("xNama");
        tvnama.setText(yNama);
    }
}