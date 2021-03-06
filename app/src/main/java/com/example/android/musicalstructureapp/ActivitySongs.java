package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivitySongs extends AppCompatActivity {

    public static ArrayList<com.example.android.musicalstructureapp.Song> song = new ArrayList<Song>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        // Create a list of songs title and artist

        if (song.size() == 0) {

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
        }

        SongAdapter adapter = new SongAdapter(this, song);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // opens the NowPlayingActivity if you click on a song

                Intent songNowPlaying = new Intent(ActivitySongs.this, NowPlayingActivity.class);

                //i want to pass the arrayList with the title to the other activity

                songNowPlaying.putExtra("position", position);
                songNowPlaying.putExtra("song", song);
                startActivity(songNowPlaying);
            }
        });

        //button back to home
        Button backToHome = findViewById(R.id.back_to_home);
        backToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(ActivitySongs.this, MainActivity.class);
                startActivity(home);
            }
        });
    }
}

