package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivitySongs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        // Create a list of songs title and artist

        ArrayList<com.example.android.musicalstructureapp.Song> song = new ArrayList<Song>();
        song.add(new Song("Stairway to Heaven", "Led Zeppelin"));
        song.add(new Song("Hey Jude", "Beatles"));
        song.add(new Song("All Along the Watchtower", "Jimi Hendrix"));
        song.add(new Song("Satisfaction", "Rolling Stones"));
        song.add(new Song("Like A Rolling Stone", "Bob Dylan"));
        song.add(new Song("Another Brick In The Wall", "Pink Floyd"));
        song.add(new Song("Won't Get Fooled Again", "Who"));
        song.add(new Song("Hotel California", "Eagles"));
        song.add(new Song("Layla", "Derek And The Dominos"));
        song.add(new Song("Sweet Home Alabama", "Lynyrd Skynyrd"));
        song.add(new Song("La Grange", "ZZ Top"));
        song.add(new Song("Bohemian Rhapsody", "Queen"));
        song.add(new Song("Riders on the Storm", "Doors"));
        song.add(new Song("Rock and Roll", "Led Zeppelin"));
        song.add(new Song("Barracuda", "Heart"));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, song);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // song_list.xml layout file.

        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.

        listView.setAdapter(adapter);

    }
}
