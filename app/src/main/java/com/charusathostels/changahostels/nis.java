package com.charusathostels.changahostels;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class nis extends AppCompatActivity {

    private Button nisfees;
    private ImageView nisfeess;
    private Button nisaddress;
    private ImageView nisaddresss;
    private Button nisroom;
    private ImageView nisrooms;
    private Button niscontact;
    private ImageView niscontacts;
    private Button nisfaci;
    private ImageView nisfacis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nis);
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);

        nisfees = (Button) findViewById(R.id.nisfees);
        nisfees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nis.this,nisfees.class));
            }
        });

        nisfeess = findViewById(R.id.nisfeess);
        nisfeess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nis.this,nisfees.class));
            }
        });

        niscontact = (Button) findViewById(R.id.niscontact);
        niscontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nis.this,niscontact.class));
            }
        });

        niscontacts = findViewById(R.id.niscontacts);
        niscontacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nis.this,niscontact.class));
            }
        });

        nisfaci= findViewById(R.id.nisspecialfacilities);
        nisfaci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nis.this,nlkspecialfaci.class));
            }
        });

        nisfacis = findViewById(R.id.nisspecialfacilitiess);
        nisfacis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nis.this,nisspecialfaci.class));
            }
        });

        nisaddress = findViewById(R.id.nisaddress);
        nisaddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nis.this,nisaddress.class));
            }
        });

        nisaddresss = findViewById(R.id.nisaddresss);
        nisaddresss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nis.this,nisaddress.class));
            }
        });
        nisroom = findViewById(R.id.nisroom);
        nisroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nis.this,nisrooms.class));
            }
        });
        nisrooms = findViewById(R.id.nisrooms);
        nisrooms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nis.this,nisrooms.class));
            }
        });
    }
}
