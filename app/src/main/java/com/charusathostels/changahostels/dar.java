package com.charusathostels.changahostels;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class dar extends AppCompatActivity {
    private Button darfees;
    private ImageView darfeess;
    private Button daraddress;
    private ImageView daraddresss;
    private Button darcontact;
    private ImageView darcontacts;
    private Button darroom;
    private ImageView darrooms;
    private Button darfaci;
    private ImageView darfacis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dar);
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        darfees = (Button) findViewById(R.id.darfees);
        darfees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(dar.this,darfees.class));
            }
        });
        darfeess = findViewById(R.id.darfeess);
        darfeess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(dar.this,darfees.class));
            }
        });

        daraddress = findViewById(R.id.daraddress);
        daraddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(dar.this,daraddress.class));
            }
        });

        daraddresss = findViewById(R.id.daraddresss);
        daraddresss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(dar.this,daraddress.class));
            }
        });

        darfaci= findViewById(R.id.darspecialfacilities);
        darfaci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(dar.this,darspecialfaci.class));
            }
        });

        darfacis = findViewById(R.id.darspecialfacilitiess);
        darfacis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(dar.this,darspecialfaci.class));
            }
        });

        darcontact = findViewById(R.id.darcontact);
        darcontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(dar.this,darcontact.class));
            }
        });

        darcontacts = findViewById(R.id.darcontacts);
        darcontacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(dar.this,darcontact.class));
            }
        });
        darroom = findViewById(R.id.darroom);
        darroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(dar.this,darrooms.class));
            }
        });

        darrooms = findViewById(R.id.darrooms);
        darrooms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(dar.this,darrooms.class));
            }
        });
    }
}
