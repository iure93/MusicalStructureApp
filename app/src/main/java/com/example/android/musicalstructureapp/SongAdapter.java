/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.musicalstructureapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {SongAdapter} is an {ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {Song} objects.
 */

public class SongAdapter extends ArrayAdapter<Song> {

     // Create a new {SongAdapter} object.

    public SongAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID title_text_view.

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);

        // Get the song title from the currentSong object and set this text on
        // the title TextView.

        titleTextView.setText(currentSong.getSongTitle());

        // Find the TextView in the list_item.xml layout with the ID artist_text_view.

        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);

        // Get the artist from the currentSong object and set this text on
        // the artist TextView.

        artistTextView.setText(currentSong.getSongArtist());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}