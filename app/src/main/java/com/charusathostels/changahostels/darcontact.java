package com.charusathostels.changahostels;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class darcontact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_darcontact);
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
    }
}
