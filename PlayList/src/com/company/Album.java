package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addToPlayList(int trackNumberOfSong, List<Song> songPlayList) {
        Song checkedSong = this.songs.findSong(trackNumberOfSong);
        if (checkedSong != null) {
           songPlayList.add(checkedSong);
            System.out.println("Song successfully added to playlist");
           return true;
        }
        System.out.println("Unsuccessful at adding to playlist");
        return false;
    }

    public boolean addToPlayList(String songTitle, List<Song> playList) {
        Song song = songs.findSong(songTitle);
        if (song == null) {
            System.out.println("Cannot add to playlist");
            return false;
        }
        playList.add(song);
        System.out.println("Song successfully added to the playlist");
        return true;
    }

    public boolean addSong(String songTitle, double duration) {
        return this.songs.addSong(new Song(songTitle, duration));
    }
    
//INNER CLASS
    private class SongList{
        private ArrayList<Song> songs;

    public SongList() {
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(Song song){
            if(songs.contains(song)){
                System.out.println("Song exists in the playlist");
                return false;
            }else{
                this.songs.add(song);
                System.out.println("Song successfully added to playlist");
                return true;
            }}

        private Song findSong(String songTitle) {
            for (int i = 0; i < songs.size(); i++) {
                Song position = songs.get(i);
                if (position.getTitle() == songTitle) {
                    return position; //Song found and returned
                }
            }
            return null; //Song is not found
        }

        public Song findSong(int trackNumber){
            int index = trackNumber - 1;
            if((index>0) && (index<songs.size())){
                return songs.get(index);
            }else{
                return null;
            }
        }
    }
}