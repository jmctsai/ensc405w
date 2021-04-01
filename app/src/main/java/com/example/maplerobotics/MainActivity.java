package com.example.maplerobotics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity{
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button manualDrivingBtn = findViewById(R.id.manualDrivingBtn);
        Button bluetoothBtn = findViewById(R.id.bluetoothBtn);
        Switch sweeperSwitch = findViewById(R.id.sweeperSwitch);

        manualDrivingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DrivingActivity.class);
                startActivity(intent);
            }
        });

        bluetoothBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BluetoothActivity.class);
                startActivity(intent);
            }
        });

        sweeperSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Log.d(TAG, "sweeperSwitch: Toggle is ON");
                    // TODO: send Sweeper ON command to Arduino
                } else {
                    Log.d(TAG, "sweeperSwitch: Toggle is OFF");
                    // TODO: send Sweeper OFF command to Arduino
                }
            }
        });
    }
}