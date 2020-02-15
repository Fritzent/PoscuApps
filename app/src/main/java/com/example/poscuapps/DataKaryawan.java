package com.example.poscuapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DataKaryawan extends AppCompatActivity {
    public Button TombolDiDataKaryawan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_karyawan);

        TombolDiDataKaryawan = findViewById(R.id.TombolDiDataKaryawan);


        TombolDiDataKaryawan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MenujuMenuUtamaDariDaftar = new Intent(getApplicationContext(),MenuUtama.class);
                startActivity(MenujuMenuUtamaDariDaftar);
            }
        });
    }
}
