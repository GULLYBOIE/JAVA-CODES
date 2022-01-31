/*Write a program to create a class called 'Employee' for the following data members:
i) Employee number
ii) Name
iii) Salary

Define the following methods to perform the following functions:
i) Input data to instance variable
ii) Display the details of an employee

In the main function, find the employee who earns the maximum salary.
*/

import java.util.Scanner;

class Employee {
    int empID, salary;
    String name;

    Scanner ip = new Scanner(System.in);

    void readEmp() {
        System.out.println("Enter employee details: ");
        System.out.println("Enter the employee ID: ");
        empID = ip.nextInt();
        System.out.println("Enter the employee name: ");
        name = ip.next();
        System.out.println("Enter the employee salary: ");
        salary = ip.nextInt();

    }

    void display() {
        System.out.println("The details of employee are: ");
        System.out.println("Employee ID: " + empID + " | " + "Name " + name + " | " + "Salary " + salary);
    }
}

public class MainEmployee {
    public static void main(String args[]) {
        Employee e[] = new Employee[10];
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the number of employees: ");
        int n = ip.nextInt();

        for (int i = 0; i < n; i++)
            e[i] = new Employee();

        for (int i = 0; i < n; i++)
            e[i].readEmp();

        int maxSal = 0;
        String maxSalEmp = "";

        for (int i = 0; i < n; i++) {
            if (maxSal < e[i].salary) {
                maxSal = e[i].salary;
                maxSalEmp = e[i].name;
            }

        }

        ip.close();

        System.out.println("Employee with maximum salary is " + maxSalEmp);
    }
}
