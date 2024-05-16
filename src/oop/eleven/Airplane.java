package oop.eleven;

import java.util.Scanner;

public class Airplane {
    private int flightNum;
    private String destination;
    private String departureTime; // year-month-day

    public Airplane(int flightNum, String destination, String departureTime) {
        this.flightNum = flightNum;
        this.destination = destination;
        this.departureTime = departureTime;
    }
    public int getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(int flightNum) {
        this.flightNum = flightNum;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
    boolean flightDelay(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the today's date? (example: \"2024-05-22\")");
        String that = scanner.next();
        String[] today = that.split("-");
        String that2 = departureTime;
        String[] flight = that2.split("-");
        for(int i = 0; i < 3; i++){
            int flightThis = Integer.parseInt(flight[i]);
            int todayThis = Integer.parseInt(today[i]);
            if(todayThis > flightThis){
                System.out.println("Your flight is delayed");
                return true;
            }
        }
        System.out.println("Your flight is not delayed");
        return false;
    }


    void checkFlightInfo(){
         System.out.println(
                "Flight number: " + flightNum +
                "\nDestination: " + destination  +
                "\nDeparture time='" + departureTime);
    }
}
