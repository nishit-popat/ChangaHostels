package com.charusathostels.changahostels;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ashrooms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ashrooms);

        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);

        ViewPager viewPager=findViewById(R.id.ashroomPager);
         ashroomAdapter adapter=new ashroomAdapter(this);
        viewPager.setAdapter(adapter);
    }
}
