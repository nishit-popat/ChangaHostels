package com.charusathostels.changahostels;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ohm extends AppCompatActivity {
    private Button ohmfees;
    private ImageView ohmfeess;
    private Button ohmaddress;
    private ImageView ohmaddresss;
    private Button ohmroom;
    private ImageView ohmrooms;
    private Button ohmcontact;
    private ImageView ohmcontacts;
    private Button ohmfaci;
    private ImageView ohmfacis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ohm);
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);

        ohmfees = (Button) findViewById(R.id.ohmfees);
        ohmfees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ohm.this,ohmfees.class));
            }
        });
        ohmfeess = findViewById(R.id.ohmfeess);
        ohmfeess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ohm.this,ohmfees.class));
            }
        });

        ohmaddress = findViewById(R.id.ohmaddress);
        ohmaddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ohm.this,ohmaddress.class));
            }
        });

        ohmcontact = (Button) findViewById(R.id.ohmcontact);
        ohmcontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ohm.this,ohmcontact.class));
            }
        });

        ohmcontacts = findViewById(R.id.ohmcontacts);
        ohmcontacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ohm.this,ohmcontact.class));
            }
        });

        ohmfaci= findViewById(R.id.ohmspecialfacilities);
        ohmfaci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ohm.this,ohmspecialfaci.class));
            }
        });

        ohmfacis = findViewById(R.id.ohmspecialfacilitiess);
        ohmfacis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ohm.this,ohmspecialfaci.class));
            }
        });

        ohmaddresss = findViewById(R.id.ohmaddresss);
        ohmaddresss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ohm.this,ohmaddress.class));
            }
        });

        ohmroom = findViewById(R.id.ohmroom);
        ohmroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ohm.this,ohmrooms.class));
            }
        });

        ohmrooms = findViewById(R.id.ohmrooms);
        ohmrooms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ohm.this,ohmrooms.class));
            }
        });
    }
}
