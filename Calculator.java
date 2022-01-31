//Write a java program to show hierarchical inheritance

class Number {
    int n1;
    int n2;

    void setData(int x, int y) {
        n1 = x;
        n2 = y;
    }

    void displayNums() {
        System.out.println("n1 = " + n1 + "n2 = " + n2);
    }
}

class Add extends Number {
    void sum() {
        System.out.println("SUM = " + (n1 + n2));
    }
}

class Sub extends Number {
    void diff() {
        System.out.println("DIFFERENCE = " + (n1 - n2));
    }
}

public class Calculator {
    public static void main(String args[]) {
        Add a = new Add();
        a.setData(10, 20);
        a.sum();
        Sub s = new Sub();
        s.setData(50, 10);
        s.diff();
    }
}
