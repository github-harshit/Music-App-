package com.example.musicalstructure;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PlaylistAdapter extends ArrayAdapter<Song> {
    public PlaylistAdapter(Activity context, ArrayList<Song> androidFlavors) {

        super(context, 0, androidFlavors);
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        Song currentSong = getItem(position);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.song_name);
        nameTextView.setText(currentSong.getSongName());
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.album_name);
        numberTextView.setText(currentSong.getAlbumName());
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image_name);
        iconView.setImageResource(currentSong.getImageResourceId());

        return listItemView;
    }
}
