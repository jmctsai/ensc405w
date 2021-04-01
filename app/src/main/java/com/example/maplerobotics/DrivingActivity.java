package com.example.maplerobotics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;

public class DrivingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driving);

        //TODO: Directional Buttons
        Button forwardBtn = findViewById(R.id.forwardBtn);
        Button leftBtn = findViewById(R.id.leftBtn);
        Button rightBtn = findViewById(R.id.rightBtn);
        Button reverseBtn = findViewById(R.id.reverseBtn);

        forwardBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                TextView commandTextView = findViewById(R.id.commandTextView);
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // SEND COMMAND TO ARDUINO HERE
                        commandTextView.setText("touching Forward");
                        break;
                    case MotionEvent.ACTION_UP:
                        // SEND STOP COMMAND TO ARDUINO HERE
                        commandTextView.setText("STOP");
                        break;
                }
                return false;
            }
        });

        leftBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                TextView commandTextView = findViewById(R.id.commandTextView);
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // SEND COMMAND TO ARDUINO HERE
                        commandTextView.setText("touching Left");
                        break;
                    case MotionEvent.ACTION_UP:
                        // SEND STOP COMMAND TO ARDUINO HERE
                        commandTextView.setText("STOP");
                        break;
                }
                return false;
            }
        });

        rightBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                TextView commandTextView = findViewById(R.id.commandTextView);
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // SEND COMMAND TO ARDUINO HERE
                        commandTextView.setText("touching Right");
                        break;
                    case MotionEvent.ACTION_UP:
                        // SEND STOP COMMAND TO ARDUINO HERE
                        commandTextView.setText("STOP");
                        break;
                }
                return false;
            }
        });

        reverseBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                TextView commandTextView = findViewById(R.id.commandTextView);
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // SEND COMMAND TO ARDUINO HERE
                        commandTextView.setText("touching Back");
                        break;
                    case MotionEvent.ACTION_UP:
                        // SEND STOP COMMAND TO ARDUINO HERE
                        commandTextView.setText("STOP");
                        break;
                }
                return false;
            }
        });
    }

}