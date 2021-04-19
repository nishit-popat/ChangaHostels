package com.charusathostels.changahostels;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class nlkrooms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nlkrooms);
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);

       ViewPager viewPager=findViewById(R.id.nlkroomapager);
       nlkroomAdapter adapter=new nlkroomAdapter(this);
       viewPager.setAdapter(adapter);
   }
}
