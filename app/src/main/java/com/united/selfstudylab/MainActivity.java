package com.united.selfstudylab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button start,stop;
    boolean isRunning = false;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button) findViewById(R.id.buttonStart);
        stop = (Button) findViewById(R.id.buttonStop);

        start.setOnClickListener(this);
        stop.setOnClickListener(this);

    }

    @Override
    public void onClick(View view){
        if(view == start && isRunning == false){
            isRunning = true;
            startService(new Intent(this,MyServices.class));
        }else if(view == stop){
            isRunning = false;
            stopService(new Intent(this,MyServices.class));
        }
    }
}