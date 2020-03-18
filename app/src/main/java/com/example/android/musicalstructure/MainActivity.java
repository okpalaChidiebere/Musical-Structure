package com.example.android.musicalstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Construct the data source
        ArrayList<Song> songs = new ArrayList<Song>();
        /**create and add songs to the list**/
        songs.add(new Song("Girl", "Bracket ft Wizkid"));
        songs.add(new Song("Woske", "Olamide"));
        songs.add(new Song("Fool for You", "Wizkid"));
        songs.add(new Song("Fada Fada", "Phyno"));
        songs.add(new Song("Risky", "Davido ft popcaan"));
        songs.add(new Song("Fall", "Davido"));
        songs.add(new Song("Girl", "Bracket ft Wizkid"));
        songs.add(new Song("Connect", "Phyno"));
        songs.add(new Song("Uyo meyo", "Teni"));
        songs.add(new Song("pant no n'iro", "Flavour"));
        songs.add(new Song("Culture", "Umu obiligbo ft flavour phyno"));
        songs.add(new Song("Feelings", "Davido"));
        songs.add(new Song("Osanle", "Zlatan x Davido"));

        // Create the adapter to convert the array to views
        SongsAdapter adapter = new SongsAdapter(this, songs);

        // Attach the adapter to a ListView
        ListView listView = (ListView) findViewById(R.id.home_song_list);
        listView.setAdapter(adapter);
    }
}
