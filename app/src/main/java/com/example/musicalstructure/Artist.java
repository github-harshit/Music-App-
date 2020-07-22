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
        playlist.add(new Song("The Chainsmokers",R.drawable.chainsmokers));
        playlist.add(new Song("Charlie Puth",R.drawable.charlie));
        playlist.add(new Song("Selena Gomez",R.drawable.selena));
        playlist.add(new Song("Radiohead",R.drawable.radio_head));
        playlist.add(new Song(
                "Chester Benningto",R.drawable.chester));
        playlist.add(new Song("A.R Rahman",R.drawable.rahman));
        playlist.add(new Song("Prateek Kuhad",R.drawable.prateek_kuhad));
        playlist.add(new Song("Imagine Dragons",R.drawable.imagine_dragons));
        playlist.add(new Song("Eminem",R.drawable.eminem));
        playlist.add(new Song("Divine",R.drawable.divine));


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
