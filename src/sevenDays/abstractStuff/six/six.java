package sevenDays.abstractStuff.six;

abstract class Shape3D {
    abstract void calculateVolume();

    abstract void calculateSurfaceArea();
}


class Sphere extends Shape3D {
    void calculateVolume() {
        System.out.println("calc sphere volume");
    }

    void calculateSurfaceArea() {
        System.out.println("calc sphere surface area");
    }
}


class Cube extends Shape3D {
    void calculateVolume() {
        System.out.println("calc cube volume");
    }

    void calculateSurfaceArea() {
        System.out.println("calc cube surface area");
    }

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
