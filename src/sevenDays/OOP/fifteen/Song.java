package sevenDays.OOP.fifteen;

public class Song {
    private String name;
    private String leadArtist;
//    private String producer;

    public String getName() {
        return name;
    }

    public String getLeadArtist() {
        return leadArtist;
    }

    public Song(String name, String leadArtist) {
        this.name = name;
        this.leadArtist = leadArtist;
    }
}
