enum StudentData {
    HARI(80, "Promoted to 5th class"), RITA(80, "Promoted to 6th class"), SAM(80, "Promoted to 5th class");

    private int grade;
    private String status;

    private StudentData(int g, String s) {
        grade = g;
        status = s;
    }

    public final int getGrade() {
        return grade;
    }

    public final String getStatus() {
        return status;
    }
}

public class StudentDataEx {
    public static void main(String args[]) {
        for (StudentData sd : StudentData.values())
            System.out.println(sd + "\t" + sd.getGrade() + "\t" + sd.getStatus());
    }
}
