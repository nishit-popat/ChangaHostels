package com.charusathostels.changahostels;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ashaddress extends AppCompatActivity {
    private ImageButton ashmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ashaddress);
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        ashmap=findViewById(R.id.ashmap);
        ashmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("http://maps.google.com/maps?daddr=22.5953496,72.7512613"));
                startActivity(intent);
            }
        });
    }
}
