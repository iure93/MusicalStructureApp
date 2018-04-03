
package com.example.android.musicalstructureapp;

import java.io.Serializable;

public class Song implements Serializable {

    private String mSongTitle;

    private String martist;

    public Song(String songTitle, String artist) {
        mSongTitle = songTitle;
        martist = artist;
    }
    public String getSongTitle() {
        return mSongTitle;
    }

    public String getSongArtist() {
        return martist;
    }
}