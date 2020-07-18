package com.example.musicalstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Artist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_playlist);
        ArrayList<Song> playlist=new ArrayList<Song>();
        playlist.add(new Song("The Chainsmokers",R.drawable.unknown));
        playlist.add(new Song("Justin Beiber",R.drawable.unknown));

        PlaylistAdapter adapter=new PlaylistAdapter(this,playlist);
        ListView playlistView=(ListView)findViewById(R.id.list);
        playlistView.setAdapter(adapter);
    }
}
