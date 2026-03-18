package controller;


import model.Seat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SeatBooking {

    private List<Seat> bookedSeatsList;

    public SeatBooking() {
        this.bookedSeatsList = new ArrayList<>();
    }

    public void addNewBooking(String seatNumber) {
        for (Seat seat : bookedSeatsList){
            if (seat.getSeatNumber().equals(seatNumber) && seat.isBooked() && !seat.isCanceled()){
                System.out.println("Seat [" + seatNumber + "] is Already Booked");
                return;
            }
        }
        Seat newSeat = new Seat(seatNumber);
        newSeat.setBooked(true);
        newSeat.setBookingDate(new Date());
        bookedSeatsList.add(newSeat);
        System.out.println("Seat [" + seatNumber + "] has been successfully added");
    }

    public void cancelBooking(String seatNumber) {
        boolean found = false;
        for (Seat seat : bookedSeatsList){
            if (seat.getSeatNumber().equals(seatNumber) && !seat.isCanceled()){
                seat.setCanceled(true);
                seat.setBooked(false);
                System.out.println("Booking for seat [" + seatNumber + "] has been successfully canceled!");
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("No booking found for seat " + seatNumber);
        }
    }

    public void updateBooking(String oldSeatNumber, String newSeatNumber) {
        boolean update = false;
        for (Seat seat : bookedSeatsList){
            if (seat.getSeatNumber().equals(oldSeatNumber) && !seat.isCanceled()){
                seat.setSeatNumber(newSeatNumber);
                System.out.println("Seat [" + oldSeatNumber + "] has been updated to [" + newSeatNumber + "]");
                update = true;
                break;
            }
        }
        if (!update){
            System.out.println("Seat [" + oldSeatNumber + "] not found");
        }
    }

    public void displayBookings() {
        if (bookedSeatsList.isEmpty()){
            System.out.println("No booking made yet");
        }else {
            boolean hasActiveBooking = false;
            for (Seat seat : bookedSeatsList){
                if (seat.isBooked() && ! seat.isCanceled()){
                    System.out.println("Seat Number: [" + seat.getSeatNumber() + "], Booking Date: [" + seat.getBookingDate() + "]" );
                    hasActiveBooking = true;
                }
            }
            if (!hasActiveBooking) {
                System.out.println("No booking made yet");
            }
        }
    }
}

