package com.charusathostels.changahostels;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class nlk extends AppCompatActivity {
    private Button nlkfees;
    private ImageView nlkfeess;
    private Button nlkaddress;
    private ImageView nlkaddresss;
    private Button nlkcontact;
    private ImageView nlkcontactss;
    private Button nlkroom;
    private ImageView nlkrooms;
    private Button nlkfaci;
    private ImageView nlkfacis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nlk);
        nlkfees =findViewById(R.id.nlkfees);
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);

        nlkfeess=findViewById(R.id.nlkfeess);
        nlkfees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nlk.this,nlkfees.class));
            }
        });

        nlkfeess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nlk.this,nlkfees.class));
            }
        });

        nlkaddress=findViewById(R.id.nlkaddress);
        nlkaddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nlk.this,nlkaddress.class));
            }
        });
        nlkaddresss=findViewById(R.id.nlkaddresss);
        nlkaddresss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nlk.this,nlkaddress.class));
            }
        });

        nlkcontact= findViewById(R.id.nlkcontact);
        nlkcontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nlk.this,nlkcontact.class));
            }
        });

        nlkcontactss = findViewById(R.id.nlkcontactss);
        nlkcontactss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nlk.this,nlkcontact.class));
            }
        });

        nlkfaci= findViewById(R.id.nlkspecialfacilities);
        nlkfaci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nlk.this,nlkspecialfaci.class));
            }
        });

        nlkfacis = findViewById(R.id.nlkspecialfacilitiess);
        nlkfacis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nlk.this,nlkspecialfaci.class));
            }
        });

        nlkroom = findViewById(R.id.nlkroom);
        nlkroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nlk.this,nlkrooms.class));
            }
        });
        nlkrooms = findViewById(R.id.nlkrooms);
        nlkrooms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nlk.this,nlkrooms.class));
            }
        });


    }
}

