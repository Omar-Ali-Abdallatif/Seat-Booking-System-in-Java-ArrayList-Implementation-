import controller.SeatBooking;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Take input using Scanner class
        Scanner keyboard = new Scanner(System.in);
        // Create an object of SeatBooking class
        SeatBooking bookingManager = new SeatBooking();

        while (true) {
            System.out.println("\n1. Add Booking\n2. Cancel Booking\n3. Update Booking\n4. Display Bookings\n5. Exit");
            System.out.print("Choose an option: ");

            int choice = -1;
            try {
                choice = keyboard.nextInt();
                keyboard.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                keyboard.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Enter seat number to book: ");
                    String inputSeatNumber = keyboard.nextLine();
                    bookingManager.addNewBooking(inputSeatNumber);
                    break;
                case 2:
                    System.out.println("Enter seat Number to cancel booking: ");
                    String canceledSeatNumber = keyboard.nextLine();
                    bookingManager.cancelBooking(canceledSeatNumber);
                    break;
                case 3:
                    System.out.println("Enter the Current seat number you want to change: ");
                    String oldSeatNumber = keyboard.nextLine();
                    System.out.println("Enter the new seat number: ");
                    String newSeatNumber = keyboard.nextLine();
                    bookingManager.updateBooking(oldSeatNumber,newSeatNumber);
                    break;
                case 4:
                    bookingManager.displayBookings();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    keyboard.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
