package com.example.serviceactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void countButtonPressed(View view){
        counter++;
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(Integer.toString(counter));
    }

    public void startService(View view){

        startService(new Intent(this,MyMusicService.class));
    }

    public void stopService(View view){

        stopService(new Intent(this,MyMusicService.class));
    }

}