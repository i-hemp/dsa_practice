package daily.wed020725.bank_task.ashwin;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

class SplashScreen {
    public static void show() throws InterruptedException {
        String[] splash = {

                "     WELCOME TO KOMAPATTI ATM            ",
                "     Secured. Fast. Reliable.   YANGAAA.        ",
        };
        for (String line : splash) {
            System.out.println(centerText(line));
        }
        Thread.sleep(1000);
        System.out.println("\n\n" + centerText(" WELCOME USER ") + "\n");
    }

    public static String centerText(String text) {
        int width = 80;
        int padSize = (width - text.length()) / 2;
        return " ".repeat(Math.max(0, padSize)) + text;
    }
}

class BankAccount {
    private int balance;
    private int accNo;

    public BankAccount(int accNo, int initialBalance) {
        this.accNo = accNo;
        this.balance = initialBalance;
    }

    public synchronized void withdraw(String name, int amount) throws IOException {
        System.out.println(name + " is trying to withdraw Rs." + amount);
        if (balance >= amount) {
            System.out.println(name + " is processing withdrawal...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            balance -= amount;
            System.out.println(name + " completed withdrawal. Remaining balance: Rs." + balance);
            TransactionLogger.log(name, accNo, "Withdraw", amount, balance);
        } else {
            System.out.println("Insufficient balance for " + name + ". Withdrawal failed.");
        }
    }

    public synchronized void deposit(String name, int amount) throws IOException {
        System.out.println(name + " is depositing ₹" + amount);
        balance += amount;
        System.out.println("Deposit successful. Current balance: Rs." + balance);
        TransactionLogger.log(name, accNo, "Deposit", amount, balance);
    }

    public int getAccNo() {
        return accNo;
    }

    public int getBalance() {
        return balance;
    }
}

class ATM {
      public static String centerText(String text) {
        int width = 80;
        int padSize = (width - text.length()) / 2;
        return " ".repeat(Math.max(0, padSize)) + text;
    }
    String user;

    ATM(String user) {
        this.user = user;
    }

    ATM(String user, int pin) {
        this.user = user;
        System.out.println("ATM session started for: " + user);
    }

    public void showOptions() {

        // centerText("");
        System.out.println(centerText("\n--- ATM Menu ---"));
        System.out.println(centerText("1. Withdraw"));
        System.out.println(centerText("2. Deposit"));
        System.out.println(centerText("3. Check Balance"));
        System.out.println(centerText("4. Exit"));
    }
}

class TransactionLogger {
    public static void log(String user, int accNo, String type, int amount, int balance) throws IOException {
        FileWriter fw = new FileWriter("transaction_log.txt", true);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String timestamp = dtf.format(LocalDateTime.now());

        fw.write("[" + timestamp + "] User: " + user + ", AccNo: " + accNo +
                ", Type: " + type + ", Amount: Rs." + amount + ", Balance: Rs." + balance + "\n");
        fw.close();
    }
}

public class MiniProject {
    static Scanner sc = new Scanner(System.in);
    static BankAccount account = new BankAccount(123456, 10000);

    // Multiple user support
    static Map<String, String> userDB = new HashMap<>();

    static {
        userDB.put("ashwin", "2005");
        userDB.put("batman", "2005");
        userDB.put("superman", "2005");
    }

    public static void main(String[] args) throws Exception {
        SplashScreen.show();

        System.out.print("Enter Username: ");
        String username = sc.next();
        System.out.print("Enter Password: ");
        String password = sc.next();

        if (userDB.containsKey(username) && userDB.get(username).equals(password)) {
            ATM atm = new ATM(username, 1234);

            while (true) {
                atm.showOptions();
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();
                if (choice == 1) {
                    System.out.print("Enter amount to withdraw: ");
                    int amt = sc.nextInt();
                    Thread t = new Thread(() -> {
                        try {
                            account.withdraw(username, amt);
                        } catch (IOException e) {
                            System.out.println("Error writing to file.");
                        }
                    });
                    t.start();
                    t.join(); // wait for transaction to finish
                } else if (choice == 2) {
                    System.out.print("Enter amount to deposit: ");
                    int amt = sc.nextInt();
                    Thread t = new Thread(() -> {
                        try {
                            account.deposit(username, amt);
                        } catch (IOException e) {
                            System.out.println("Error writing to file.");
                        }
                    });
                    t.start();
                    t.join(); // wait for transaction to finish
                } else if (choice == 3) {
                    System.out.println("Current Balance: Rs." + account.getBalance());
                } else if (choice == 4) {
                    System.out.println("Thank you for banking with us, " + username + "!");
                    System.out
                            .println("Transaction log saved to: " + new File("transaction_log.txt").getAbsolutePath());
                    break;
                } else {
                    System.out.println("Invalid choice. Try again.");
                }

                Thread.sleep(1500);
            }
        } else {
            System.out.println("Invalid credentials. Exiting...");
        }
    }
}