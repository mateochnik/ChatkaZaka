package com.example.mateo.chatkazaka;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Mateo on 17.01.2018.
 */
public class Pomaran extends Activity {
    Context context;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pomarancz);

        String[] elementy_listy = {"24 Sty",

                "25 Sty",
                "27 Sty",
                "29 Sty",
                "30 Sty",
                "10 Lut",
                "15 Lut",
                "21 Lut",
                "22 Lut",
                "25 Lut"
        };
        ListView prosta_lista = (ListView) findViewById(R.id.lista);
        List_Custom_List adapter_listy = new List_Custom_List(this, elementy_listy);
        context = getApplicationContext();
        prosta_lista.setAdapter(adapter_listy);;
        prosta_lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView arg0, View arg1, int pos,
                                    long arg3) {
                if(pos == 0)
                {
                    Intent startActivityCustomList = new Intent(Pomaran.this,
                            wyda_pom.class);
                    startActivity(startActivityCustomList);

                } else if (pos>0) {
                    Toast.makeText(context,"Dostępne wkrótce......",Toast.LENGTH_LONG ).show();
                }

            }

        });
    }}
