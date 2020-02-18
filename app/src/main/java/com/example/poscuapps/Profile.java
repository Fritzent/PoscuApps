package com.example.poscuapps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Profile extends AppCompatActivity {

    public BottomNavigationView bottomNavigationView;
    public TextView MenuEditProfile,MenuKeluar,MenuPengaturan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        bottomNavigationView = findViewById(R.id.BottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.profile);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.profile:
                        return true;
                    case R.id.beranda:
                        startActivity(new Intent(getApplicationContext(),MenuUtama.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.kelola:
                        startActivity(new Intent(getApplicationContext(),Kelola.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

        MenuEditProfile = findViewById(R.id.MenuEditProfile);

        MenuEditProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MenujuEditProfile = new Intent(getApplicationContext(),EditProfile.class);
                startActivity(MenujuEditProfile);
            }
        });

        MenuKeluar = findViewById(R.id.MenuKeluar);

        MenuKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MenujuKeluarAkun = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(MenujuKeluarAkun);
            }
        });

        MenuPengaturan = findViewById(R.id.MenuPengaturan);

        MenuPengaturan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MenujuPengaturan = new Intent(getApplicationContext(),Pengaturan.class);
                startActivity(MenujuPengaturan);
            }
        });
    }
}
