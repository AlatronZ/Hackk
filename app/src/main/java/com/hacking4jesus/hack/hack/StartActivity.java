package com.hacking4jesus.hack.hack;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.hacking4jesus.hack.hack.components.Checkpoint;
import com.hacking4jesus.hack.hack.components.CheckpointAdapter;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playclip);

//        Bitmap icon = BitmapFactory.decodeResource(this.getResources(), R.mipmap.ic_launcher);
//
////        Checkpoint[] checkpoints = new Checkpoint[]{
////                new Checkpoint("check 1", icon),
////                new Checkpoint("check 2", icon),
////                new Checkpoint("check 3", icon),
////        };
//
//        CheckpointAdapter itemsAdapter = new CheckpointAdapter(this, R.layout.checkpoint);
//
//        ListView listView = (ListView)findViewById(R.id.checkpoints);
//        listView.setAdapter(itemsAdapter);

    }
}
