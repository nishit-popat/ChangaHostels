package com.charusathostels.changahostels;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import static com.charusathostels.changahostels.R.layout.main_activity;

//import android.transition.TransitionManager;

public class MainActivity extends AppCompatActivity {

    private Button nlk_button;
    private Button shrdp_button;
    private Button dar_button;
    private Button nis_button;
    private Button ohm_button;
    private Button ash_button;
    private RelativeLayout nlk_front;
    private RelativeLayout shrdp_front;
    private RelativeLayout dar_front;
    private RelativeLayout nis_front;
    private RelativeLayout ohm_front;
    private RelativeLayout ash_front;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(main_activity);
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);

      nlk_button = (Button) findViewById(R.id.nlk_button);
       nlk_button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
              startActivity(new Intent(MainActivity.this,nlk.class));
          }
      });
        nlk_front = findViewById(R.id.nlk_front);
        nlk_front.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, nlk.class));
            }

        });

        shrdp_button=(Button) findViewById(R.id.shrdp_button);
       shrdp_button.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this, shrdp.class));
           }

       });
        shrdp_front = findViewById(R.id.shrdp_front);
        shrdp_front.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, shrdp.class));
            }

        });

        dar_button = (Button) findViewById(R.id.dar_button);
        dar_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,dar.class));
            }
        });
        dar_front =  findViewById(R.id.dar_front);
        dar_front.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,dar.class));
            }
        });

        nis_button = (Button) findViewById(R.id.nis_button);
        nis_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,nis.class));
            }
        });
        nis_front =  findViewById(R.id.nis_front);
        nis_front.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,nis.class));
            }
        });

        ohm_button = (Button) findViewById(R.id.ohm_button);
        ohm_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ohm.class));
            }
        });
        ohm_front =  findViewById(R.id.ohm_front);
        ohm_front.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ohm.class));
            }
        });

        ash_button = (Button) findViewById(R.id.ash_button);
        ash_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ash.class));
            }
        });
        ash_front =  findViewById(R.id.ash_front);
        ash_front.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ash.class));
            }
        });




    }
    boolean doubleBack=false;
    @Override
    public void onBackPressed()
    {
        if(doubleBack){
            super.onBackPressed();
            return;
        }
        this.doubleBack=true;
        Toast.makeText(this,"Press again to close CHANGA HOSTELS",Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                doubleBack=false;
            }
        },3000);
    }

}
