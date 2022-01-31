/*Write a program to monitor the status of two conference halls with respect to its capacity. The maximum seating/capacity of the hall is 30. Create a class by the name 'Conference Hall' with the following data members: i) Name of the conference hall ii) Availabilitiy of seats

Update the seat availability in each hall as and when a person enters and leaves the hall. To do that implement the following methods:
i) enterHall()
ii) exitHall()
iii) display()
*/

class ConferenceHall {
    String name;
    int availSeats;

    ConferenceHall(String name) {
        this.name = name;
        availSeats = 30;
    }

    void enterHall() {
        if (availSeats == 0)
            System.out.println("There are no available seats.");
        else {
            availSeats--;
            display();
        }
    }

    void exitHall() {
        if (availSeats == 30)
            System.out.println("No people in the hall.");
        else {
            availSeats++;
            display();
        }
    }

    void display() {
        System.out.println("The number of available seats is " + availSeats);
    }
}

public class MainConference {
    public static void main(String args[]) {
        ConferenceHall h1 = new ConferenceHall("Conference Hall 1");
        ConferenceHall h2 = new ConferenceHall("Conference Hall 2");
        h1.enterHall();
        h2.enterHall();
        h1.enterHall();
        h2.exitHall();
        h1.display();
    }
}