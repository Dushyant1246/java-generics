package com.bridgelabz.flightScheduling;

public class FlightSystem {
    public static void main(String[] args) {
        Flight<Integer> flight1 = new Flight<>(101, "New York", "London");
        Flight<String> flight2 = new Flight<>("AA202", "Los Angeles", "Tokyo");

        Booking<Integer> booking1 = new Booking<>(5001, flight1, "John Doe");
        Booking<String> booking2 = new Booking<>("B102", flight2, "Jane Smith");

        booking1.displayBooking();
        System.out.println("----------------");
        booking2.displayBooking();

        System.out.println("\n--- Flight Management ---");
        FlightManager<Integer> manager = new FlightManager<>();
        manager.addFlight(flight1);
        manager.displayAllFlights();
    }
}
/*
Booking ID: 5001
Passenger: John Doe
FlightCode: 101
Departure: New York
Destination: London

----------------
Booking ID: B102
Passenger: Jane Smith
FlightCode: AA202
Departure: Los Angeles
Destination: Tokyo


--- Flight Management ---
FlightCode: 101
Departure: New York
Destination: London
 */