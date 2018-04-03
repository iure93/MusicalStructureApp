package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;

public class NowPlayingActivity extends AppCompatActivity {

    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);


       ArrayList<Song> songArray = (ArrayList<Song>) getIntent().getSerializableExtra("song");

        position = getIntent().getIntExtra("position", position);

        String title = songArray.get(position).toString();

        TextView songTitleCurrentlyPlaying = (TextView) findViewById(R.id.song_title_currently_playing);
        songTitleCurrentlyPlaying.setText(title);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /*    String title = getIntent().getStringExtra("songTitle");
        String artist = getIntent().getStringExtra("songArtist");

       //displays the title of the song

        TextView songTitleCurrentlyPlaying = (TextView) findViewById(R.id.song_title_currently_playing);
        songTitleCurrentlyPlaying.setText(title);

        //displays the artist of the song

        TextView artistCurrentlyPlaying = (TextView) findViewById(R.id.artist_currently_playing);
        artistCurrentlyPlaying.setText(artist);


        //button for previous song
        Button previousSong  = findViewById(R.id.previous_song);
        previousSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //button for next song

        Button nextSong  = findViewById(R.id.next_song);
        previousSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });  */
    }
}
