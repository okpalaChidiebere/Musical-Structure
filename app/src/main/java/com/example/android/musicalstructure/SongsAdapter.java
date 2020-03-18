package com.example.android.musicalstructure;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class SongsAdapter extends ArrayAdapter<Song> {


    public SongsAdapter(Context context, ArrayList<Song> songs){

        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.song_list, parent, false);
        }

        // Get the data item for this position
        Song song = getItem(position);

        // Lookup view for data population and
        // Populate the data into the template view using the data object
        TextView songName = (TextView) convertView.findViewById(R.id.songName);
        TextView songArtist = (TextView) convertView.findViewById(R.id.songArtist);
        songName.setText(song.songName);
        songArtist.setText(song.songArtist);

        //return the object of the row view
        return convertView;
    }
}
