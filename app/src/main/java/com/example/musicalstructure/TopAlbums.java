package com.example.musicalstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class TopAlbums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_playlist);
        getSupportActionBar().setTitle("My playlist");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Song> playlist=new ArrayList<Song>();
        playlist.add(new Song("Sing Me To sleep","Alan Walker",R.drawable.singmesleep));
        playlist.add(new Song("Love Yourself","Justin Beiber",R.drawable.loveyourself));
        playlist.add(new Song("Alone","Alan Walker ",R.drawable.singmesleep));
        playlist.add(new Song("Payphone","Maroon 5",R.drawable.maroon5));
        playlist.add(new Song("Let Her Go ","Passenger",R.drawable.lethergo));
        playlist.add(new Song("All We Know","The Chainsmokers",R.drawable.allweknow));
        playlist.add(new Song("Falling","Trevor Daniel",R.drawable.falling));
        playlist.add(new Song("Mess","PrateekKuhad",R.drawable.mess));
        playlist.add(new Song("Bad Liar ","Imagine Dragons ",R.drawable.badliar));

        PlaylistAdapter adapter=new PlaylistAdapter(this,playlist);
        ListView playlistView=(ListView)findViewById(R.id.list);
        playlistView.setAdapter(adapter);
        playlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent nowplayingIntent=new Intent(TopAlbums.this,NowPlaying.class);
                startActivity(nowplayingIntent);
            }
        });

    }
}
