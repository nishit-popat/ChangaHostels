package com.charusathostels.changahostels;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class shrdprooms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shrdprooms);
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);

        ViewPager viewPager=findViewById(R.id.shrdproomPager);
        shrdproomAdapter adapter=new shrdproomAdapter(this);
        viewPager.setAdapter(adapter);
    }
}
