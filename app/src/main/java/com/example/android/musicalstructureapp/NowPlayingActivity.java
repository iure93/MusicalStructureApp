package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class NowPlayingActivity extends AppCompatActivity {


    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        TextView songTitleCurrentlyPlayinge = (TextView) findViewById(R.id.song_title_currently_playing);
        TextView artistCurrentlyPlaying = (TextView) findViewById(R.id.artist_currently_playing);

        final ArrayList<Song> songArray = ActivitySongs.song;

        String title = songArray.get(position).getSongTitle();
        String artist = songArray.get(position).getSongArtist();

        songTitleCurrentlyPlayinge.setText(title);
        artistCurrentlyPlaying.setText(artist);



////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //button for previous song
        Button previousSong  = findViewById(R.id.previous_song);
        previousSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView songTitleCurrentlyPlayinge = (TextView) findViewById(R.id.song_title_currently_playing);
                TextView artistCurrentlyPlaying = (TextView) findViewById(R.id.artist_currently_playing);

                position-=1;

                if(position>=0){

                ArrayList<Song> songArray = ActivitySongs.song;
                String title = songArray.get(position).getSongTitle();
                String artist = songArray.get(position).getSongArtist();
                songTitleCurrentlyPlayinge.setText(title);
                artistCurrentlyPlaying.setText(artist);
                }
                else {
                    position+=1;
                    Toast.makeText(NowPlayingActivity.this, "No more songs!", Toast.LENGTH_LONG).show();
                }
            }
        });

        //button for next song
        Button nextSong  = findViewById(R.id.next_song);
        nextSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView songTitleCurrentlyPlayinge = (TextView) findViewById(R.id.song_title_currently_playing);
                TextView artistCurrentlyPlaying = (TextView) findViewById(R.id.artist_currently_playing);
                position+=1;

                if(position<songArray.size()){

                ArrayList<Song> songArray = ActivitySongs.song;
                String title = songArray.get(position).getSongTitle();
                String artist = songArray.get(position).getSongArtist();
                songTitleCurrentlyPlayinge.setText(title);
                artistCurrentlyPlaying.setText(artist);
                }

                else{
                    position-=1;
                    Toast.makeText(NowPlayingActivity.this, "No more songs!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
