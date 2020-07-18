package com.example.musicalstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class TopAlbums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_playlist);

        ArrayList<Song> playlist=new ArrayList<Song>();
        playlist.add(new Song("Sing Me To sleep","Alan Walker",R.drawable.singmesleep));
        playlist.add(new Song("Love Yourself","Justin Beiber",R.drawable.loveyourself));
        playlist.add(new Song("Alone","Alan Walker ",R.drawable.singmesleep));
        playlist.add(new Song("Payphone","Maroon 5",R.drawable.maroon5));
        playlist.add(new Song("Let Her Go ","Passenger",R.drawable.lethergo));
        playlist.add(new Song("All We Know","The Chainsmokers",R.drawable.allweknow));
        playlist.add(new Song("Falling","Trevor Daniel",R.drawable.falling));
        playlist.add(new Song("Mess","Prateek Kuhad",R.drawable.mess));
        playlist.add(new Song("Bad Liar ","Imagine Dragons ",R.drawable.badliar));

        PlaylistAdapter adapter=new PlaylistAdapter(this,playlist);
        ListView playlistView=(ListView)findViewById(R.id.list);
        playlistView.setAdapter(adapter);

    }
}
