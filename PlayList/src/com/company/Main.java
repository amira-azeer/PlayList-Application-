package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Album> albums = new ArrayList<>();

        //ALBUM 1 - INDEX 0
        Album Album = new Album("Storm Bringer", "Deep Purple");
        Album.addSong("Storm Bringer", 4.6);
        Album.addSong("Love don't mean a thing", 4.22);
        Album.addSong("Holy man", 4.3);
        Album.addSong("Hold on", 5.6);
        Album.addSong("Lady double dealer", 3.21);
        Album.addSong("You can't do it right", 6.23);
        Album.addSong("High ball shooter", 4.27);
        Album.addSong("The gypsy", 4.2);
        Album.addSong("Soldier of fortune", 3.13);
        albums.add(Album);

        //ALBUM 2 - INDEX 1
        Album = new Album("For those about to rock", "AC/DC");
        Album.addSong("For those about to rock", 4.22);
        Album.addSong("I put the finer on you", 3.25);
        Album.addSong("Lets go", 3.5);
        Album.addSong("Inject the venom", 2.6);
        Album.addSong("Snowballed", 1.6);
        Album.addSong("Evil walks", 4.12);
        Album.addSong("C.O.D", 2.61);
        Album.addSong("Breaking the rules", 5.32);
        Album.addSong("Night of the long knives", 1.00);
        albums.add(Album);

        LinkedList<Song> playList= new LinkedList<>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed man", playList); // SONG DOES NOT EXIST IN ALBUM 1
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        //albums.get(1).addToPlayList(24, playList); //NO TRACK 24

    }
}
