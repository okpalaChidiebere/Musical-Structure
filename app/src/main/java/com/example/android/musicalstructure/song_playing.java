package com.example.android.musicalstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class song_playing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_playing);

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }
}
