package com.rafli.utsmuhammadrafliansyah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btndaftar;
    EditText etnamalengkap;
    EditText etnomorpendaftaran;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("UTS Muhammad Rafliansyah");

        btndaftar = findViewById(R.id.btn_daftar);
        etnamalengkap = findViewById(R.id.et_namalengkap);
        etnomorpendaftaran = findViewById(R.id.et_nomorpendaftaran);

        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = etnamalengkap.getText().toString();
                Integer nomorpe

                    if (nama.trim().equals("")){
                        etnamalengkap.setError("Nama Harus Diisi");
                    }
                    else {
                        Intent daftar = new Intent(MainActivity.this, SecondActivity.class);
                        daftar.putExtra("xNama", nama);
                        startActivity(daftar);
                    }



            }
        });
    }
}