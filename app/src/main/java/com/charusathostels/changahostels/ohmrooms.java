package com.charusathostels.changahostels;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ohmrooms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ohmrooms);
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);

        ViewPager viewPager=findViewById(R.id.ohmroomPager);
        ohmroomAdapter adapter=new ohmroomAdapter(this);
        viewPager.setAdapter(adapter);
    }
}
