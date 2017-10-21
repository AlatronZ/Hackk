package com.hacking4jesus.hack.hack;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class PlayClipActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        RelativeLayout view = (RelativeLayout)LayoutInflater.from(this).inflate(R.layout.activity_start, null);
        LinearLayout checkpoints = (LinearLayout)view.findViewById(R.id.checkpoints);

    }
}
