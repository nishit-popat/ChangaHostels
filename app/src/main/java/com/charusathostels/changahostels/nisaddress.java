package com.charusathostels.changahostels;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class nisaddress extends AppCompatActivity {

    private ImageButton nismap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nisaddress);
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);

        nismap=findViewById(R.id.nismap);
        nismap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("http://maps.google.com/maps?daddr=22.5984567,72.8213871"));
                startActivity(intent);
            }
        });
    }
}
