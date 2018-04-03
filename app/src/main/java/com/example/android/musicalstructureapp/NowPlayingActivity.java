package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        ArrayList<Song> songArray = (ArrayList<Song>) getIntent().getSerializableExtra("song");

        int position = getIntent().getIntExtra("position", 0);

        String title = songArray.get(position).toString();

        TextView songTitleCurrentlyPlayinge = (TextView) findViewById(R.id.song_title_currently_playing);
        songTitleCurrentlyPlayinge.setText(title);




/*
        String title = getIntent().getStringExtra("songTitle");
        String artist = getIntent().getStringExtra("songArtist");

       //displays the title of the song

        TextView songTitleCurrentlyPlayinge = (TextView) findViewById(R.id.song_title_currently_playing);
        songTitleCurrentlyPlayinge.setText(title);

        //displays the artist of the song

        TextView artistCurrentlyPlayinge = (TextView) findViewById(R.id.artist_currently_playing);
        artistCurrentlyPlayinge.setText(artist);*/
    }
}
