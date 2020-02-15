package com.example.poscuapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserData extends AppCompatActivity {
    public Button TombolDiUserData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_data);

        TombolDiUserData = findViewById(R.id.TombolDiUserData);

        TombolDiUserData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MenujuDataKaryawan = new Intent(getApplicationContext(),DataKaryawan.class);
                startActivity(MenujuDataKaryawan);
            }
        });
    }
}
