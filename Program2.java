// Create a class called Students that reads USN,Name,SEM details of students.
// Create a class Marks that extends Students which reads marks of six subjects.
// Create another class named Percentage,derived from Marks class which
// calculates percentage obtained by students.

import java.util.Scanner;

class Students {
    String USN;
    String name;
    int sem;

    Scanner ip = new Scanner(System.in);

    void readStudentData() {
        System.out.println("Enter USN of student");
        USN = ip.next();
        System.out.println("Enter name of student");
        name = ip.next();
        System.out.println("Enter semester of student");
        sem = ip.nextInt();
    }
}

class Marks extends Students {
    int marks[] = new int[6];

    Scanner ip = new Scanner(System.in);

    void readMarks() {
        System.out.println("Enter marks of six subjects");
        for (int i = 0; i < marks.length; i++)
            marks[i] = ip.nextInt();

    }

}

class Percentage extends Marks {
    float percentage;
    int sum;

    void calPercentage() {
        for (int i : marks)
            sum = sum + i;
        percentage = sum / 6.0f;
    }

    void display() {
        System.out.println("Percentage of " + name + " is " + percentage);
    }
}

public class Program2 {
    public static void main(String[] args) {
        Percentage p = new Percentage();
        p.readStudentData();
        p.readMarks();
        p.calPercentage();
        p.display();
    }
}
