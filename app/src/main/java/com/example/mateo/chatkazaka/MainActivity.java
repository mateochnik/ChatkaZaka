package com.example.mateo.chatkazaka;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private Button b_orange;
    private ImageButton b_all;
    private Button b_yellow;
    private Button b_nieb;
    public int kolor;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b_orange = (Button)findViewById(R.id.orange);
        b_all = (ImageButton)findViewById(R.id.all);
        b_yellow = (Button) findViewById(R.id.zolt) ;
        b_nieb = (Button) findViewById(R.id.nieb);

        b_orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kolor = 1;
                context = getApplicationContext();
                Intent i = new Intent(context, Pomaran.class);
                startActivity(i);
            }
        });
        b_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kolor = 0;
                context = getApplicationContext();
                Intent ii = new Intent(context, wydarzenie.class);
                startActivity(ii);
            }
        });
        b_yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context = getApplicationContext();
                Intent ii = new Intent(context, wyda_zolt.class);
                startActivity(ii);
            }

        });
        b_nieb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context = getApplicationContext();
                Intent ii = new Intent(context, wyda_nieb.class);
                startActivity(ii);
            }
        });


    }

}
