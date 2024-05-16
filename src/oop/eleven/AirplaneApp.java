package oop.eleven;

public class AirplaneApp {
    public static void main(String[] args) {
        Airplane boeing = new Airplane(24, "France", "2023-05-29");
        boeing.checkFlightInfo();
        boeing.flightDelay();
    }
}
