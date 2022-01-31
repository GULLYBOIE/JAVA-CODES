class A {
    private int p; // Since p is a private variable, it cannot be accessed by subclasses or other
                   // packages.
    int q;
    protected int r;
    public int s;

    void input(int i, int j, int k, int l) {
        p = i;
        q = j;
        r = k;
        s = l;
    }
}

class B extends A {
    void displayB() {
        p = 20; // The field A.p is not visible
        q = 30;
        r = 50;
        s = 100;
    }
}

public class AccessSpecifier {
    public static void main(String args[]) {
        B b1 = new B();
        b1.p = 100; // The field A.p is not visible
        b1.q = 200;
        b1.r = 300;
        b1.s = 400;
    }
}
