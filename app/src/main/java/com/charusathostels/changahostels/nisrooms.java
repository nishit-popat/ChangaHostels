package com.charusathostels.changahostels;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class nisrooms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nisrooms);
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);

        ViewPager viewPager=findViewById(R.id.nisroomPager);
        nisroomAdapter adapter=new nisroomAdapter(this);
        viewPager.setAdapter(adapter);
    }
}
