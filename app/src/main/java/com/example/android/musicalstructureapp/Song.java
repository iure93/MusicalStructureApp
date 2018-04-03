
package com.example.android.musicalstructureapp;

/**
 * {@link Song) represent the title of the song and it's own artist
 */
public class Song {

    /** song title */
    private String mSongTitle;

    /** song artist */
    private String martist;

    /**
     * Create a new Song object.
     *
     * @param songTitle is the song title
     * @param artist is the song artist
     */

    public Song (String songTitle, String artist) {
        mSongTitle= songTitle;
        martist = artist;
    }

    /**
     * Get the title of the song.
     */

    public String getSongTitle() {
        return mSongTitle;
    }

    /**
     * Get the artist of the song.
     */

    public String getSongArtist() {
        return martist;
    }

}