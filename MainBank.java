/*Write a java program to show bank transaction by defining class called 'BankAccount' with the following data members:
i) Account number
ii) Customer Name
iii) Balance amount

Define the following the operations:
i) Deposit amount
ii) Withdraw amount
ii) Display balance amount
*/

class BankAccount {
    long accNo, bal;
    String name;

    BankAccount(long accNo, String name) {
        this.accNo = accNo;
        this.name = name;
        bal = 1000;
    }

    void deposit(int amt) {
        bal = bal + amt;
        display();
    }

    void withdraw(int amt) {
        if (amt > bal)
            System.out.println("Insufficient funds");
        else {
            bal = bal - amt;
            display();
        }
    }

    void display() {
        System.out.println("The available balance is " + bal);
    }
}

public class MainBank {
    public static void main(String args[]) {
        BankAccount a1 = new BankAccount(120321300, "ABC");
        a1.deposit(1000);
        a1.withdraw(2000);
        a1.display();
    }
}