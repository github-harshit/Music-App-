package com.example.musicalstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myPlaylist=(TextView)findViewById(R.id.playlist);
        myPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlistIntent=new Intent(MainActivity.this,MyPlaylist.class);
                startActivity(playlistIntent);
            }
        });
        TextView topAlbums=(TextView)findViewById(R.id.albums);
        topAlbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumsIntent=new Intent(MainActivity.this,TopAlbums.class);
                startActivity(albumsIntent);
            }
        });
        final TextView artist=(TextView)findViewById(R.id.artist);
        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistIntent=new Intent(MainActivity.this,Artist.class);
                startActivity(artistIntent);
            }
        });
        final TextView nowPlaying=(TextView)findViewById(R.id.nowPlaying);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent=new Intent(MainActivity.this,NowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });


        }

    }




