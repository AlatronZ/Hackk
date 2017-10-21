package com.hacking4jesus.hack.hack.components;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.hacking4jesus.hack.hack.R;

/**
 * Created by David on 22/10/2017.
 */

public class CheckpointAdapter extends ArrayAdapter<Checkpoint> {
    public CheckpointAdapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Checkpoint check = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.checkpoint, parent, false);
        }

        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.checkpoint_text);
        ImageView tvHome = (ImageView) convertView.findViewById(R.id.checkpoint_image);

        // Populate the data into the template view using the data object
        tvName.setText(check.name);
        tvHome.setImageBitmap(check.image);

        // Return the completed view to render on screen
        return convertView;
    }
}
