package daily.wed.arunasalambank;

import java.util.Scanner;

public class Main {
    public static int takePerfectInputForWithdraw(Bank b, int withdrawAmount, Scanner s) {
        withdrawAmount = s.nextInt();
        if (b.getBalance() <= withdrawAmount) {
            System.out.println("Error\nEnter withdraw amount again: ");
            return takePerfectInputForWithdraw(b, withdrawAmount, s);
        }
        return withdrawAmount;
    }

    public static int takePerfectInputForDeposit(Bank b, int depositAmount, Scanner s) {
        depositAmount = s.nextInt();
        if (depositAmount <= 0) {
            System.out.println("Error\nEnter deposit amount again: ");
            return takePerfectInputForDeposit(b, depositAmount, s);
        }
        return depositAmount;
    }

    public static void main(String[] args) {

        Bank b = new Bank();
        System.out.println("\nWelcome Arunasalam ....\n");
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter Principle Amount ");
        int amount = s.nextInt();
        b.setBalance(amount);
        System.out.println("Your new Balance: " + b.getBalance());
        do {
            System.out.println("\nSelect One Option : ");
            String[] options = { "1. Deposit", "2. Withdraw", "3. Balance", " 4. Quit" };
            for (String opt : options) {
                System.out.println(opt);
            }
            int option = s.nextInt();
            switch (option) {
                case 1:

                    System.out.println("Enter amount to be deposited : ");
                    int depositAmount = takePerfectInputForDeposit(b, 0, s);

                    b.setBalance(b.getBalance() + depositAmount);

                    System.out.println("\nUpdated balance : " + b.getBalance());
                    break;
                case 2:

                    System.out.println("Enter amount for withdraw : ");
                    int withdrawAmount = takePerfectInputForWithdraw(b, 0, s);
                    b.setBalance(b.getBalance() - withdrawAmount);
                    System.out.println("\nUpdated balance : " + b.getBalance());
                    break;
                case 3:
                    System.out.println("\nYou account balance : " + b.getBalance());
                    break;
                case 4:
                    System.out.println("\n\nThank you!\nexiting..................");
                    return;
                default:
                    System.out.println("Error");
                    break;
            }
            // s.nextInt() != 4
        } while (true);
        // s.close();
    }

}
