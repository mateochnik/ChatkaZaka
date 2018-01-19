package com.example.mateo.chatkazaka;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Mateo on 15.01.2018.
 */
public class Kalendarz extends AppCompatActivity {
    private Button button;
    CalendarView calendar;
    Context context;
    private int miesiac;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kalendarz);
        calendar = (CalendarView) findViewById(R.id.calendarView);
        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener(){
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayofMonth)
            {
                context = getApplicationContext();
                Intent intent = new Intent(context, wydarzenie.class);
                intent.putExtra("miesiac", month);
                intent.putExtra("dzien", dayofMonth);
                startActivityForResult(intent, 1);
            }
        });
    }

}
