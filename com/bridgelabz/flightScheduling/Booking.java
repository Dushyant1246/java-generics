package com.bridgelabz.flightScheduling;

public class Booking <T> {
    private T bookingId;
    private Flight<?> flight;
    private String passengerName;

    public Booking(T bookingId, Flight<?> flight, String passengerName) {
        this.bookingId = bookingId;
        this.flight = flight;
        this.passengerName = passengerName;
    }

    public void displayBooking(){
        System.out.println(
                "Booking ID: " + this.bookingId + '\n' +
                "Passenger: " + this.passengerName
        );
        flight.displayFlight();
    }
}
