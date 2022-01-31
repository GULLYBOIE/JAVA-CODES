//Write a java program to show implementation of interfaces

interface interfaceA {
    void methodA();
}

interface interfaceB {
    void methodB();
}

class MultiInterface implements interfaceA, interfaceB {
    public void methodA() {
        System.out.print("Abstract method of interface A");
    }

    public void methodB() {
        System.out.print("Abstract method of interface B");
    }

    void display() {
        System.out.println("");
    }
}