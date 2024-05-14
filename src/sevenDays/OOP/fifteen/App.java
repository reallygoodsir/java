package sevenDays.OOP.fifteen;

public class App {
    public static void main(String[] args) {
        Song first = new Song("Stronger", "Kanye West");
        Song second = new Song("Thank God", "Travis Scott");
        Song third = new Song("Mask Off", "Future");
        Song fourth = new Song("PRIDE.", "Kendrick Lamar");
        Song fifth = new Song("Wesley's Theory", "Kendrick Lamar");
        Song sixth = new Song("N.Y. State Of Mind", "Nas");
        Song seventh = new Song("LVL", "A$AP Rocky");
        Song eighth = new Song("just like me", "21 Savage");
        MusicLibrary playlist = new MusicLibrary();
        playlist.addSong(first);
        playlist.addSong(second);
        playlist.addSong(third);
        playlist.addSong(fourth);
        playlist.addSong(fifth);
        playlist.addSong(sixth);
        playlist.addSong(seventh);
        playlist.addSong(eighth);

        playlist.playRandomSong();
        playlist.playRandomSong();
        playlist.removeSong(2);
        playlist.playRandomSong();
    }
}
