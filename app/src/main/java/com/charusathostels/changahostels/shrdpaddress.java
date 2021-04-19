package com.charusathostels.changahostels;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class shrdpaddress extends AppCompatActivity {

    private ImageButton shrdpmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shrdpaddress);
        shrdpmap=findViewById(R.id.shrdpmap);
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        shrdpmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("http://maps.google.com/maps?daddr=22.6117719,72.8215653"));
                startActivity(intent);
            }
        });
    }
}
