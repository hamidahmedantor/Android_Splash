package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    public  static  int SPLASH_TIME_OUT =4000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         new Handler().postDelayed(new Runnable() {
             @Override
             public void run() {
                 Intent intent = new Intent(MainActivity.this,Homesplash.class);
                 startActivity(intent);
                 finish();
             }
         },SPLASH_TIME_OUT
         );
    }
}
