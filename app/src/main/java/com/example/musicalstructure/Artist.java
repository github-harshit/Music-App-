package com.example.musicalstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Artist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_playlist);
        getSupportActionBar().setTitle("My playlist");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ArrayList<Song> playlist=new ArrayList<Song>();
        playlist.add(new Song("The Chainsmokers",R.drawable.unknown));
        playlist.add(new Song("Justin Beiber",R.drawable.unknown));
        playlist.add(new Song("Selena Gomez",R.drawable.unknown));
        playlist.add(new Song("Radiohead",R.drawable.unknown));
        playlist.add(new Song(
                "Chester Benningto",R.drawable.unknown));
        playlist.add(new Song("A.R Rehman",R.drawable.unknown));
        playlist.add(new Song("Prateek Kuhad",R.drawable.unknown));
        playlist.add(new Song("Imagine Dragons",R.drawable.unknown));
        playlist.add(new Song("Eminem",R.drawable.unknown));
        playlist.add(new Song("Divine",R.drawable.unknown));


        PlaylistAdapter adapter=new PlaylistAdapter(this,playlist);
        ListView playlistView=(ListView)findViewById(R.id.list);
        playlistView.setAdapter(adapter);
        playlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent nowplayingIntent=new Intent(Artist.this,NowPlaying.class);
                startActivity(nowplayingIntent);
            }
        });
    }
}
