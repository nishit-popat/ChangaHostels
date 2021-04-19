package com.charusathostels.changahostels;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class daraddress extends AppCompatActivity {

    private ImageButton darmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daraddress);
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);

        darmap=findViewById(R.id.darmap);
        darmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("http://maps.google.com/maps?daddr=22.5995452,72.8240844"));
                startActivity(intent);
            }
        });
    }
}
