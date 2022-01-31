// Write a program to create a class named shape.In this class we have three
// subclasses:circle,triangle and square.Each class has two member functions
// named draw()and erase().Create these using polymorphism concepts.

class Shape {
    void draw() {
        System.out.println("A shape is drawn.");
    }

    void erase() {
        System.out.println("A shape is erased.");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("A circle is drawn.");
    }

    void erase() {
        System.out.println("A circle is erased.");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("A triangle is drawn.");
    }

    void erase() {
        System.out.println("A triangle is erased.");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("A square is drawn.");
    }

    void erase() {
        System.out.println("A square is erased.");
    }
}

public class prog1 {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        Circle c = new Circle();
        Triangle t = new Triangle();
        Square s = new Square();
        s1.draw();
        s1.erase();
        c.draw();
        c.erase();
        t.draw();
        t.erase();
        s.draw();
        s.erase();
    }
}