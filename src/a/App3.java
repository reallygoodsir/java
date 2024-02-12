package a;

public class App3 {
    public static void main(String[] args) {
        Engine engine1 = new Engine();
        engine1.setType("diesel");
        engine1.setPower(165);
        Engine engine2 = new Engine();
        engine2.setType("gasoline");
        engine2.setPower(215);

        Car lada = new Car();
        lada.setYearOfManufacture(1989);
        lada.setEngine(engine1);
        lada.setName("Lada");

        Car mercedes = new Car();
        mercedes.setYearOfManufacture(2012);
        mercedes.setEngine(engine2);
        mercedes.setName("Mercedes");
    }
}
