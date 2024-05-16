package oop.fifteen;

import java.util.ArrayList;
import java.util.Random;

public class MusicLibrary {
    int lastPlayedIndex;
    ArrayList<Song> songs = new ArrayList<Song>();

    void addSong(Song song) {
        songs.add(song);
    }

    void removeSong(int index) {
        songs.remove(index);
    }

    void playRandomSong() {
//        Random rand = new Random();
//        int songIndex = rand.nextInt(songs.size());
//        if (songIndex == lastPlayedIndex) {
//            do {
//                songIndex = rand.nextInt(songs.size());
//            }while(songIndex == lastPlayedIndex);
//        } else {
//            lastPlayedIndex = songIndex;
//            System.out.println("Now playing \"" + (songs.get(songIndex).getName()) + "\" by " + (songs.get(songIndex).getLeadArtist()));
//        }
        Random rand = new Random();
        int index = rand.nextInt(songs.size());
        System.out.println("Now playing: " + songs.get(index).getName() + " by " + songs.get(index).getLeadArtist());
    }
}
