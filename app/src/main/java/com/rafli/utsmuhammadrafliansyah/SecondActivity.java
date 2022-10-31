package com.rafli.utsmuhammadrafliansyah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tvnama,tvnomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportActionBar().setTitle("UTS Muhammad Rafliansyah");

        tvnama = findViewById(R.id.tv_nama);
        tvnomor = findViewById(R.id.tv_nomor);

        Intent intent = getIntent();
        String yNama = intent.getStringExtra("xNama");
        String yNomor = intent.getStringExtra("XNomor");
        tvnama.setText(yNama);
        tvnomor.setText(yNomor);
    }
}