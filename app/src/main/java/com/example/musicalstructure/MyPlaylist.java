package com.example.musicalstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MyPlaylist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_playlist);
        getSupportActionBar().setTitle("My playlist");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final ArrayList<Song> playlist=new ArrayList<Song>();
        playlist.add(new Song("Daydreaming", "Radiohead",R.drawable.daydreaming));
        playlist.add(new Song("Beliver","Imagine Dragons",R.drawable.beliver));
        playlist.add(new Song("Demons","Imagine Dragons",R.drawable.demons));
        playlist.add(new Song("She will be loved","Marron 5",R.drawable.maroon5));
        playlist.add(new Song("Let her go","Passenger",R.drawable.unknown));
        playlist.add(new Song("Darlin\'","Beach Boys ",R.drawable.darlin));
        playlist.add(new Song("Memories","Maroon 5 ",R.drawable.memories));
        playlist.add(new Song("Seafret","Wildfire",R.drawable.wildfire));
        playlist.add(new Song("I\'m coming clean","Ezra Furman",R.drawable.clean));

       PlaylistAdapter adapter=new PlaylistAdapter(this,playlist);
        ListView playlistView=(ListView)findViewById(R.id.list);
        playlistView.setAdapter(adapter);

        playlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent nowplayingIntent=new Intent(MyPlaylist.this,NowPlaying.class);
                startActivity(nowplayingIntent);

            }
        });

        }
    }






