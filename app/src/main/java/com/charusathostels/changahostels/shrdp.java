package com.charusathostels.changahostels;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class shrdp extends AppCompatActivity {

    private Button shrdpfees;
    private ImageView shrdpfeess;
    private Button shrdpaddress;
    private ImageView shrdpaddresss;
    private Button shrdpcontact;
    private ImageView shrdpcontacts;
    private Button shrdproom;
    private ImageView shrdprooms;
    private Button shrdpfaci;
    private ImageView shrdpfacis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shrdp);
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);

        shrdpfees = findViewById(R.id.shrdpfees);
        shrdpfees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(shrdp.this,shrdpfees.class));
            }
        });
        shrdpfeess = findViewById(R.id.shrdpfeess);
        shrdpfeess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(shrdp.this,shrdpfees.class));
            }
        });

        shrdpaddress = findViewById(R.id.shrdpaddress);
        shrdpaddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(shrdp.this,shrdpaddress.class));
            }
        });

        shrdpaddresss = findViewById(R.id.shrdpaddresss);
        shrdpaddresss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(shrdp.this,shrdpaddress.class));
            }
        });
        shrdpcontact= findViewById(R.id.shrdpcontact);
        shrdpcontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(shrdp.this,shrdpcontact.class));
            }
        });
        shrdpcontacts= findViewById(R.id.shrdpcontacts);
        shrdpcontacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(shrdp.this,shrdpcontact.class));
            }
        });
        shrdpfaci= findViewById(R.id.shrdpspecialfacilities);
        shrdpfaci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(shrdp.this,shrdpspecialfaci.class));
            }
        });

        shrdpfacis = findViewById(R.id.shrdpspecialfacilitiess);
        shrdpfacis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(shrdp.this,shrdpspecialfaci.class));
            }
        });
        shrdproom= findViewById(R.id.shrdproom);
        shrdproom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(shrdp.this,shrdprooms.class));
            }
        });
        shrdprooms= findViewById(R.id.shrdprooms);
        shrdprooms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(shrdp.this,shrdprooms.class));
            }
        });
    }
}
