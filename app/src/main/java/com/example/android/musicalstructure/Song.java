package com.example.android.musicalstructure;

public class Song {

    String songName;
    String songArtist;

    public Song(String sName, String sArtist){
        songName = sName;
        songArtist = sArtist;
    }

    public String getSongName(){
        return songName;
    }

    public String getSongArtist(){
        return songArtist;
    }

    public void playSong(String songName){

    }

    public void playNextSong(){

    }

    public void playPrevious(){

    }

    public void pauseSong(String songName){

    }
}
