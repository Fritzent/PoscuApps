package com.example.poscuapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button TombolMasukDiMain,TombolDaftarDiMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TombolMasukDiMain = findViewById(R.id.TombolMasuk);
        TombolDaftarDiMain = findViewById(R.id.TombolDaftar);

        TombolMasukDiMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MenujuLogin = new Intent(getApplicationContext(),Login.class);
                startActivity(MenujuLogin);
            }
        });
        TombolDaftarDiMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MenujuRegister = new Intent(getApplicationContext(),Register.class);
                startActivity(MenujuRegister);
            }
        });
    }
}
