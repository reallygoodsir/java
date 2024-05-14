package sevenDays.abstractStuff.nine;

abstract class Instrument{
    abstract void play();
    abstract void tune();
}

class Glockenspiel extends Instrument{
    void play(){
        System.out.println("playing the glockenspiel");
    }
    void tune(){
        System.out.println("tuning the glockenspiel");
    }
}

class Violin extends Instrument{
    void play(){
        System.out.println("playing the violin");
    }
    void tune(){
        System.out.println("tuning the violin");
    }

    public static void main(String[] args) {
        Instrument violin = new Violin();
        violin.play();
        violin.tune();
        violin.play();
        System.out.println();
        Instrument glock = new Glockenspiel();
        glock.play();
        glock.tune();
    }
}