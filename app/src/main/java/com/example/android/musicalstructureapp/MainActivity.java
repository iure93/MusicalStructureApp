package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //code for open the ActivitySongs

        TextView songs = findViewById(R.id.songs);
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songs = new Intent(MainActivity.this, ActivitySongs.class);
                startActivity(songs);
            }
        });

        //code for open the ArtistsActivity


      /*  final TextView artists = findViewById(R.id.artist);
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artist = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(artist);
            }
        });

        //code for open the PlaylistActivity


        final TextView playlist = findViewById(R.id.playlist);
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlist = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(playlist);
            }
        });*/
    }
}
