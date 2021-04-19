package com.charusathostels.changahostels;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class splashscreen extends AppCompatActivity {
    private final int SPLASH_TIME_OUT=1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        },300);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {Intent mainIntent = new Intent(splashscreen.this,MainActivity.class);
            startActivity(mainIntent);
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
            finish();
            }
        },SPLASH_TIME_OUT);


    }
}
