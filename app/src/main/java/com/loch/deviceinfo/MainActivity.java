package com.loch.deviceinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        textView.setText(
                "PRODUCT:" + Build.PRODUCT + "\n"
                        + "DEVICE:" + Build.DEVICE + "\n"
                        + "BOARD:" + Build.BOARD + "\n"
                        + "BOOTLOADER:" + Build.BOOTLOADER + "\n"
                        + "DISPLAY:" + Build.DISPLAY + "\n"
                        + "FINGERPRINT:" + Build.FINGERPRINT + "\n"
                        + "HARDWARE:" + Build.HARDWARE + "\n"
                        + "HOST:" + Build.HOST + "\n"
                        + "ID:" + Build.ID + "\n"
                        + "MANUFACTURER:" + Build.MANUFACTURER + "\n"
                        + "MODEL:" + Build.MODEL + "\n"
                        + "TAGS:" + Build.TAGS + "\n"
                        + "SERIAL:" + Build.SERIAL + "\n"
                        + "TYPE:" + Build.TYPE + "\n"
                        + "UNKNOWN:" + Build.UNKNOWN + "\n"
                        + "USER:" + Build.USER + "\n"
                        + "SUPPORTED_32_BIT_ABI'S:" + Build.SUPPORTED_32_BIT_ABIS + "\n"
                        + "TIME" + Build.TIME + "\n"
                        + "SUPPORTED_ABI'S:" + Build.SUPPORTED_ABIS + "\n"
        );

    }
}