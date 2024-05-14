package sevenDays.interfaces.eight;

public interface Playable {
    void play();
}

class Football implements Playable {
    public void play(){
        System.out.println("play Football");
    }
}

class Volleyball implements Playable {
    public void play(){
        System.out.println("play Volleyball");
    }
}

class Basketball implements Playable {
    public void play(){
        System.out.println("play Basketball ");
    }
}
