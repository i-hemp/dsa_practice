package daily.tue010725.acc;

class Bank {
    public int acc;

    public Bank(int acc) {
        this.acc = acc;
    }

    // synchronized public void withdraw(int money, String name, Bank b) {
    // b.acc = b.acc - money;
    // System.out.println("Active balance: "+this.acc);
    // }
}

class Person extends Thread {

    public String name;
    public int depositAmount;
    public Bank bank;

    public Person(String n, int amount, Bank b) {
        this.name = n;
        this.depositAmount = amount;
        this.bank = b;
    }

    @Override
    public void run() {
        // ONE WAY
        synchronized (bank) {
            // System.out.println(this.toString());
            withdraw(depositAmount, this.name, this.bank);
        }
    }

    public void withdraw(int money, String name, Bank b) {
        b.acc = b.acc - money;
        System.out.println("Active balance: " + b.acc);
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", depositAmount=" + depositAmount + ", bank=" + bank + "]";
    }

}

public class UseBank extends Thread {

    public static void main(String[] args) {
        Bank b = new Bank(10000);
        Person p = new Person("A", 4000, b);
        p.start();
        Person p2 = new Person("B", 400, b);
        p2.start();

    }

}
