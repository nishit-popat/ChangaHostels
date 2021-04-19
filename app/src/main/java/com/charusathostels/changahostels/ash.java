package com.charusathostels.changahostels;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ash extends AppCompatActivity {

    private Button ashfees;
    private ImageView ashfeess;
    private Button ashaddress;
    private ImageView ashaddresss;
    private Button ashroom;
    private ImageView ashrooms;
    private Button ashcontact;
    private ImageView ashcontacts;
    private Button ashfaci;
    private ImageView ashfacis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ash);
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);

        ashfees = (Button) findViewById(R.id.ashfees);
        ashfees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ash.this,ashfees.class));
            }
        });

        ashfeess = findViewById(R.id.ashfeess);
        ashfeess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ash.this,ashfees.class));
            }
        });

        ashaddress = findViewById(R.id.ashaddress);
        ashaddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ash.this,ashaddress.class));
            }
        });

        ashaddresss = findViewById(R.id.ashaddresss);
        ashaddresss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ash.this,ashaddress.class));
            }
        });

        ashcontact = findViewById(R.id.ashcontact);
        ashcontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ash.this,ashcontact.class));
            }
        });

        ashcontacts = findViewById(R.id.ashcontacts);
        ashcontacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ash.this,ashcontact.class));
            }
        });

        ashfaci= findViewById(R.id.ashspecialfacilities);
        ashfaci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ash.this,ashspecialfaci.class));
            }
        });

        ashfacis = findViewById(R.id.ashspecialfacilitiess);
        ashfacis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ash.this,ashspecialfaci.class));
            }
        });

        ashroom = findViewById(R.id.ashroom);
        ashroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ash.this,ashrooms.class));
            }
        });

        ashrooms = findViewById(R.id.ashrooms);
        ashrooms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ash.this,ashrooms.class));
            }
        });
    }
}
