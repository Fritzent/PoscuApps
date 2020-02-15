package com.example.poscuapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Register extends AppCompatActivity {
    public TextView DaftarAkunDiRegister;
    public Button IniTombolDiRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        DaftarAkunDiRegister = findViewById(R.id.SudahAdaAkun);
        IniTombolDiRegister = findViewById(R.id.TombolDiRegister);

        DaftarAkunDiRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MenujuLoginDiRegister = new Intent(getApplicationContext(),Login.class);
                startActivity(MenujuLoginDiRegister);
            }
        });

        IniTombolDiRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MenujuDataDiri = new Intent(getApplicationContext(),UserData.class);
                startActivity(MenujuDataDiri);
            }
        });
    }
}
