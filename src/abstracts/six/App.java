package abstracts.six;

public class App {
    public static void main(String[] args) {
        Shape3D sphere = new Sphere();
        sphere.calculateVolume();
        sphere.calculateSurfaceArea();
        System.out.println();
        Shape3D cube = new Cube();
        cube.calculateVolume();
        cube.calculateSurfaceArea();
    }
}
