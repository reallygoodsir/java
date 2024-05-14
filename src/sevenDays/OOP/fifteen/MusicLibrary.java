package sevenDays.OOP.fifteen;

import java.util.ArrayList;
import java.util.Random;

public class MusicLibrary {
    ArrayList<Song> songs = new ArrayList<Song>();

    void addSong(Song song) {
        songs.add(song);
    }

    void removeSong(int index) {
        songs.remove(index);
    }

    int lastPlayedIndex;

    void playRandomSong() {
        Random rand = new Random();
        int songIndex = rand.nextInt(songs.size());
//        if (songIndex == lastPlayedIndex) {
//            do {
//                songIndex = rand.nextInt(songs.size());
//            }while(songIndex == lastPlayedIndex);
//        } else {
            lastPlayedIndex = songIndex;
            System.out.println("Now playing \"" + (songs.get(songIndex).getName()) + "\" by " + (songs.get(songIndex).getLeadArtist()));
//        }
    }
}
