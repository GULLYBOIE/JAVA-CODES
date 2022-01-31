import java.util.Scanner;

// Write a program that has a class Train with data members- no_of_seats_1Tier,
// no_of_seats_2Tier,and no_of_seats_3Tier and member functions to set and
// display data.Derive a class Reservation that has data members-
// seats_booked_1Tier,seats_booked_2Tier,and seats_booked_3Tier and functions
// to book and cancel tickets,and display status.

class Train {
    int no_of_seats_1Tier;
    int no_of_seats_2Tier;
    int no_of_seats_3Tier;

    Scanner ip = new Scanner(System.in);

    void setData() {
        System.out.println("Enter no of Tier 1 seats:");
        no_of_seats_1Tier = ip.nextInt();
        System.out.println("Enter no of Tier 2 seats:");
        no_of_seats_2Tier = ip.nextInt();
        System.out.println("Enter no of Tier 3 seats:");
        no_of_seats_3Tier = ip.nextInt();
    }

    void display() {
        System.out.println("No of Tier 1 seats available are: " + no_of_seats_1Tier);
        System.out.println("No of Tier 2 seats available are: " + no_of_seats_2Tier);
        System.out.println("No of Tier 3 seats available are: " + no_of_seats_3Tier);
    }
}

class Reservation extends Train {
    int seats_booked_1Tier;
    int seats_booked_2Tier;
    int seats_booked_3Tier;

    void bookTickets() {
        int seats, tier;

        System.out.println("Enter the tier: 1, 2 or 3");
        tier = ip.nextInt();
        System.out.println("Enter the no of seats to be booked");
        seats = ip.nextInt();

        switch (tier) {
            case 1:
                if (seats < no_of_seats_1Tier) {
                    no_of_seats_1Tier = no_of_seats_1Tier - seats;
                    System.out.println(seats + " tickets booked");
                } else {
                    System.out.println("Sufficient seats not available");
                }
                break;

            case 2:
                if (seats < no_of_seats_2Tier) {
                    no_of_seats_2Tier = no_of_seats_2Tier - seats;
                    System.out.println(seats + " tickets booked");
                } else {
                    System.out.println("Sufficient seats not available");
                }
                break;
            case 3:
                if (seats < no_of_seats_3Tier) {
                    no_of_seats_3Tier = no_of_seats_3Tier - seats;
                    System.out.println(seats + " tickets booked");
                } else {
                    System.out.println("Sufficient seats not available");
                }
                break;
            default:
                System.out.println("Invalid tier");
                break;
        }
    }

    void cancelTickets() {
        int seats, tier;

        System.out.println("Enter the tier: 1, 2 or 3");
        tier = ip.nextInt();
        System.out.println("Enter the no of seats to be cancelled");
        seats = ip.nextInt();

        switch (tier) {
            case 1:
                no_of_seats_1Tier = no_of_seats_1Tier + seats;
                System.out.println(seats + " tickets cancelled");
                break;

            case 2:
                no_of_seats_1Tier = no_of_seats_1Tier + seats;
                System.out.println(seats + " tickets cancelled");
                break;

            case 3:
                no_of_seats_1Tier = no_of_seats_1Tier + seats;
                System.out.println(seats + " tickets cancelled");
                break;

            default:
                System.out.println("Invalid tier");
                break;
        }
    }
}

public class Program3 {
    public static void main(String[] args) {
        Reservation r1 = new Reservation();
        r1.setData();
        r1.bookTickets();
        r1.display();

    }
}