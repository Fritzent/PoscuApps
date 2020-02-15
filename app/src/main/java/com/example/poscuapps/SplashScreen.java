package com.example.poscuapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    public TextView NamaPoscuJava;
    public ImageView LogoPoscuJava;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        NamaPoscuJava = findViewById(R.id.NamaPoscu);
        LogoPoscuJava = findViewById(R.id.LogoPoscu);

        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.splashtransisi);
        NamaPoscuJava.startAnimation(myanim);
        LogoPoscuJava.startAnimation(myanim);

        final Intent intentsplash = new Intent(this,MainActivity.class);
        Thread durasiwaktu = new Thread()
        {
            public void run()
            {
                try
                {
                    sleep(5000);
                }catch (InterruptedException e)
                {
                    e.printStackTrace();
                }finally {
                    startActivity(intentsplash);
                    finish();
                }
            }
        };
        durasiwaktu.start();
    }
}
