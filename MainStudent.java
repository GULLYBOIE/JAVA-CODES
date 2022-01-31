/*Write a program to create a class called 'Student' with the following data members:
i) Name
ii) Register number
iii) Marks of three subjects

Define the following methods to perform the following functions:
i) Input the data to instance variable
ii) Calculate the average of three subjects
iii) Display student details
*/

import java.util.Scanner;

class Student {
    String name;
    int regNo, m1, m2, m3;
    float avg;

    Scanner ip = new Scanner(System.in);

    void readStudent() {

        System.out.println("Enter Student name: ");
        name = ip.next();
        System.out.println("Enter the register number of Student: ");
        regNo = ip.nextInt();
        System.out.println("Enter the marks of 3 subjects of Student: ");
        m1 = ip.nextInt();
        m2 = ip.nextInt();
        m3 = ip.nextInt();

    }

    void calAvg() {
        avg = (m1 + m2 + m3) / 3f;
        System.out.println("Average marks of " + name + " is " + avg);
    }

    void display() {
        System.out.println(
                "Name: " + name + " | " + "Register Number: " + regNo + " | " + "Marks of " + name + ": " + m1 + " "
                        + m2
                        + " " + m3);
    }
}

public class MainStudent {
    public static void main(String args[]) {
        Student s[] = new Student[10];
        Scanner p = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = p.nextInt();

        for (int i = 0; i < n; i++)
            s[i] = new Student();

        for (int i = 0; i < n; i++)
            s[i].readStudent();

        for (int i = 0; i < n; i++)
            s[i].display();

        p.close();
    }
}
