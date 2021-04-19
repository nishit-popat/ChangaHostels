package com.charusathostels.changahostels;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ohmaddress extends AppCompatActivity {

    private ImageButton ohmmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ohmaddress);
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);

        ohmmap=findViewById(R.id.ohmmap);
        ohmmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("http://maps.google.com/maps?daddr=22.6013061,72.8229215"));
                startActivity(intent);
            }
        });
    }
}
