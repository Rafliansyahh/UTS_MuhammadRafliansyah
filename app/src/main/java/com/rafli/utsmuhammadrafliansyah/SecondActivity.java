package com.rafli.utsmuhammadrafliansyah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tvnama,tvnomor,tvjalur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportActionBar().setTitle("UTS Muhammad Rafliansyah");

        tvnama = findViewById(R.id.tv_nama_second);
        tvnomor = findViewById(R.id.tv_nomor_second);
        tvjalur = findViewById(R.id.tv_jalur_second);

        Intent intent = getIntent();
        tvnama.setText(intent.getStringExtra("xNama"));
        tvnomor.setText(intent.getStringExtra("xNomor"));
        tvjalur.setText(intent.getStringExtra("xJalur"));
    }
}