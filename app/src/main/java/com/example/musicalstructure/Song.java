package com.example.musicalstructure;

public class Song {
    private  String songName;
    private String albumName;
    private int imageResourceId;


    public Song(String songName,String albumName,int imageResourceId){
        this.songName=songName;
        this.albumName=albumName;
        this.imageResourceId=imageResourceId;
    }

    public Song(String albumName,int imageResourceId){

        this.albumName=albumName;
        this.imageResourceId=imageResourceId;
    }


    public String getSongName() {
        return songName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songName='" + songName + '\'' +
                '}';
    }
}
