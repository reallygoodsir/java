package abstracts.nine;

public class App {
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
