package com.bridgelabz.flightScheduling;

public class Flight<T>{
    private T flightCode;
    private String departure;
    private String destination;

    public Flight(T flightCode, String departure, String destination) {
        this.flightCode = flightCode;
        this.departure = departure;
        this.destination = destination;
    }

    public T getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(T flightCode) {
        this.flightCode = flightCode;
    }

    public void displayFlight() {
        System.out.println(
                "FlightCode: " + flightCode + '\n' +
                "Departure: " + departure + '\n' +
                "Destination: " + destination + '\n'
        );
    }
}
