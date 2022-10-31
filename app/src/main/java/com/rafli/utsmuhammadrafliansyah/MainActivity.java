package com.rafli.utsmuhammadrafliansyah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Button btndaftar;
    EditText etnamalengkap, etnomorpendaftaran;
    String nomorpendaftaran,namalengkap;
    Spinner spjalur;
    CheckBox cbkonfirmasi;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("UTS Muhammad Rafliansyah");

        btndaftar = findViewById(R.id.btn_daftar);
        etnamalengkap = findViewById(R.id.et_namalengkap);
        etnomorpendaftaran = findViewById(R.id.et_nomorpendaftaran);
        spjalur = findViewById(R.id.sp_jalur);
        cbkonfirmasi = findViewById(R.id.cb_konfirmasi);

        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                namalengkap = etnamalengkap.getText().toString();
                nomorpendaftaran = etnomorpendaftaran.getText().toString();

                    if (namalengkap.trim().equals("")){
                        etnamalengkap.setError("Nama Harus Diisi");
                    }
                    else if (nomorpendaftaran.trim().equals("")){
                        etnomorpendaftaran.setError("Nomor Pendaftaran Harus Diisi");
                    }
                    else{
                        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                        intent.putExtra("xNama", namalengkap);
                        intent.putExtra("xNomor", nomorpendaftaran);
                        startActivity(intent);
                    }

            }
        });
    }
}