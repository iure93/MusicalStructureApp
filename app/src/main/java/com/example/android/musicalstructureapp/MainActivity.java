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

        //code for open the NowPlaying Activity

        TextView nowPlaying = findViewById(R.id.now_playing);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlaying = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlaying);
            }
        });

        //code for open the ActivitySongs

        TextView songs = findViewById(R.id.songs);
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songs = new Intent(MainActivity.this, ActivitySongs.class);
                startActivity(songs);
            }
        });


    }
}
