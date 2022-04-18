package com.company;
/*
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addToPlayList(int trackNumberOfSong, List<Song> songPlayList) {
        if (trackNumberOfSong <= 0) {
            System.out.println("Unsuccessful addition to playlist");
            return false;
        }
        Song song = songs.get(trackNumberOfSong - 1);
        songPlayList.add(song);
        System.out.println("Successfully added to playlist");
        return true;
    }

    public boolean addToPlayList(String songTitle, List<Song> playList) {
        Song song = findSong(songTitle);
        if (song == null) {
            System.out.println("Cannot add to playlist");
            return false;
        }
        playList.add(song);
        System.out.println("Song successfully added to the playlist");
        return true;
    }

    public boolean addSong(String songTitle, double duration) {
        if (findSong(songTitle) == null) {
            this.songs.add(new Song(songTitle, duration)); //Adding the song
            return true;
        }
        System.out.println(songTitle + " with duration of " + duration + " already exists");
        return false; //Not adding the song
    }

    private Song findSong(String songTitle) {
        for (int i = 0; i < songs.size(); i++) {
            Song position = songs.get(i);
            if (position.getTitle() == songTitle) {
                return position; //Song found and returned
            }
        }
        return null; //Song is not found
    }
}*/