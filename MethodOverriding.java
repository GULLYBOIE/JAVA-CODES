// Write a java program to show method overriding.

class X {
    void display() {
        System.out.println("This is class X");
    }
}

class Y extends X {
    void display() {
        System.out.println("This is class Y");
    }
}

public class MethodOverriding {
    public static void main(String args[]) {
        X x1 = new X();
        x1.display();

        Y y1 = new Y();
        y1.display();

        X refX = new X();
        refX.display();
        refX = new Y();
        refX.display();
    }
}
