interface Exam {
    void Percentage_cal();
}

class Student {
    String name;
    int roll_no;
    int marks1, marks2;

    Student(String name, int roll_no, int marks1, int marks2) {
        this.name = name;
        this.roll_no = roll_no;
        this.marks1 = marks1;
        this.marks2 = marks2;
    }

    void show() {
        System.out.println("Name of student is: " + name);
        System.out.println("Roll number of student is: " + roll_no);
        System.out.println("Marks of student is: " + marks1 + " " + marks2);
    }
}

class Result extends Student implements Exam {
    Result(String name, int roll_no, int marks1, int marks2) {
        super(name, roll_no, marks1, marks2);
    }

    float per;

    public void Percentage_cal() {
        per = ((marks1 + marks2) / 2f) * 100;
        display();
    }

    void display() {
        System.out.println("Percentage of student is: " + per);
    }

}

public class Program7 {
    public static void main(String[] args) {
        Result r = new Result("Darshan", 6878, 98, 89);
        r.show();
        r.Percentage_cal();
    }

}
