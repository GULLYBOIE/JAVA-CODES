class Student{
    protected int rollno;
    protected String name;

    void setData(int rn,String n)
    {
        rollno = rn;
        name = n;
    }


}
class Fees extends  Student{
    protected    int fees;
    public void submitFees(int f){
        fees = f;
    }
    public void generateReceipt()
    {
        System.out.println("Fee Receipt:");
        System.out.println("Roll No: "+rollno);
        System.out.println("Name   : "+name);
        System.out.println("Fees   : "+fees);

    }
}
class Result extends Student
{
    private   int tests,activities,sports;
    private double tm,average;
    private  char grade;
    public void setMarks(int tests, int activities, int sports)
    {
        this.tests=tests;
        this.activities = activities;
        this.sports = sports;
    }
    void generateReceipt()
    {
        tm = tests + activities + sports;
        average=tm/3.0;
        if(average>=90)
        {
            grade = 'A';
        }
        else if(average>=80 && average<90)
        {
            grade = 'B';
        }
        else if(average>=70 && average<80)
        {
            grade = 'C';
        }
        else if(average>=60 && average<70)
        {
            grade = 'D';
        }
        else{
            grade = 'F';
        }

        System.out.println("Marks Receipt            : ");
        System.out.println("Student Marks in Tests   : "+tests);
        System.out.println("Student Marks Activities : "+activities);
        System.out.println("Student Marks in Sports  : "+sports);
        System.out.println("Student Grade            : "+grade);

    }


}

public class Program4 {
    public static void main(String[] args) {

        Fees s=new Fees();
        s.setData(014,"ABC");
        s.submitFees(85);
        s.generateReceipt();
        Result r=new Result();
        r.setMarks(90,85,89);
        r.generateReceipt();
    }
}