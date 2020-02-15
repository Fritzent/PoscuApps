package com.example.poscuapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    public TextView DaftarAkunDiLogin;
    public Button TombolDiLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        DaftarAkunDiLogin = findViewById(R.id.DaftarAkun);
        TombolDiLogin = findViewById(R.id.TombolDiLogin);

        DaftarAkunDiLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MenujuRegisterDiLogin = new Intent(getApplicationContext(),Register.class);
                startActivity(MenujuRegisterDiLogin);
            }
        });
        TombolDiLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MenujuMenuUtama = new Intent(getApplicationContext(),MenuUtama.class);
                startActivity(MenujuMenuUtama);
            }
        });
    }
}
