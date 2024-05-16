package abstracts.ten;

public class App {
    public static void main(String[] args) {
        Shape2D a = new Rectangle();
        a.draw();
        a.resize();
        a.draw();
        System.out.println();
        Shape2D b = new Circle();
        b.draw();
        b.resize();
    }
}
