package com.example.mateo.chatkazaka;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class wydarzenie extends AppCompatActivity {
    public int kolor;
    TextView txt;
    TextView txt2;
    int miesiac;
    int dzien;
    String dzienS;
    String miesacS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wydarz);
        Intent intent = getIntent();
        txt = (TextView) findViewById(R.id.dzienTygodnia);
        txt2 = (TextView) findViewById(R.id.textView3);
        miesiac = intent.getIntExtra("miesiac", 0);
        dzien = intent.getIntExtra("dzien", 0);
        dzienS = String.valueOf(dzien);
        txt.setText(dzienS);
        switch (miesiac){
            case 0:
                miesacS = "Styczeń";
                break;
            case 1:
                miesacS = "Luty";
                break;
            case 2:
                miesacS = "Marzec";
                break;
            case 3:
                miesacS = "Kwiecień";
                break;
            case 4:
                miesacS = "Maj";
                break;
            case 5:
                miesacS = "Czerwiec";
                break;
            case 6:
                miesacS = "Lipiec";
                break;
            case 7:
                miesacS = "Sierpień";
                break;
            case 8:
                miesacS = "Wrzesień";
                break;
            case 9:
                miesacS = "Październik";
                break;
            case 10:
                miesacS = "Listopad";
                break;
            case 11:
                miesacS = "Grudzień";
                break;

        }
        txt2.setText(miesacS);
    }
    @Override
    public void finish() {
        Intent intent = new Intent();
        intent.putExtra("msg", "Wiadomość powrotna");
        setResult(RESULT_OK, intent);
        super.finish();
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode,
                                    Intent intent) {


        if (resultCode == RESULT_OK && requestCode == 0) {
            if (intent.hasExtra("msg")) {

            }
        }
    }

}
