// Write a class Worker and derive classes DailyWorker and SalariedWorker from
// it.
// Every worker has a name and a salary rate.Write method ComPay(inthours) to
// compute the weekly pay of every worker. A Daily Worker is paid on the basis
// of
// the number of days he or she works.The Salaried Worker gets paid the wage for
// 40
// hours a week no matter what the actual hours are.Test this program to
// calculate
// the pay of workers.You are expected to use the concept of polymorphism to
// write this program.

class Worker {
    String name;
    int salRate;

    Worker(String name, int salRate) {
        this.name = name;
        this.salRate = salRate;
    }

    void comPay(int hours) {
        System.out.println("Monthly pay of worker is " + (salRate * 40));
    }
}

class DailyWorker extends Worker {
    DailyWorker(String name, int salRate) {
        super(name, salRate);
    }

    void comPay(int hours) {
        System.out.println("Monthly salary of daily worker is " + (salRate * hours));
    }
}

class SalariedWorker extends Worker {
    SalariedWorker(String name, int salRate) {
        super(name, salRate);
    }

    void comPay() {
        System.out.println("Monthly salary of salaried worker is " + (salRate * 40));
    }
}

public class Program5 {
    public static void main(String[] args) {
        DailyWorker dw = new DailyWorker("ABC", 258);
        SalariedWorker sw = new SalariedWorker("XYZ", 5400);
        dw.comPay(50);
        sw.comPay();
    }
}