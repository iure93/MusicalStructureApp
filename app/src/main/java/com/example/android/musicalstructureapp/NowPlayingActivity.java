package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        String title = getIntent().getStringExtra("songTitle");

        TextView songTitleCurrentlyPlayinge = (TextView) findViewById(R.id.song_title_currently_playing);
        songTitleCurrentlyPlayinge.setText(title);
    }
}
