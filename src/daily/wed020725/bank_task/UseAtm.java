package daily.wed020725.bank_task;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UseAtm {
    public static int takePerfectInputForWithdraw(Account b, int withdrawAmount, Scanner s) {
        withdrawAmount = s.nextInt();
        if (b.getBalance() <= withdrawAmount) {
            System.out.println("Error\nEnter withdraw amount again: ");
            return takePerfectInputForWithdraw(b, withdrawAmount, s);
        }
        return withdrawAmount;
    }

    public static int takePerfectInputForDeposit(Account b, int depositAmount, Scanner s) {
        
            depositAmount=s.nextInt();
   
        depositAmount = s.nextInt();
        if (depositAmount <= 0) {
            System.out.println("Error\nEnter deposit amount again: ");
            return takePerfectInputForDeposit(b, depositAmount, s);
        }
        return depositAmount;
    }

    public static void main(String[] v) throws IOException {
        // System.out.println(new File(".").getAbsolutePath());

        Scanner s = new Scanner(System.in);
        System.out.println("ATM starting ");
        // thread
        // {

        // try {
        // Thread.sleep(3000);
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }

        // }
        Atm atm = new Atm();
        // String ss =
        // "//src//"/home/hemanth/ubuntuFolder/Hemanth/learnjava/dsa/src/daily/wed020725
        File f = new File("src/daily/wed020725/bank_task/tranx.txt");

        if (!f.exists()) {
            if (f.canWrite()) {
                f.setWritable(true);
            }
            try {
                f.createNewFile();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } // throws IOException, handle it
            System.out.println("file created");
        }
        FileWriter fWriter = new FileWriter(f);
        // BufferedWriter writer = new BufferedWriter(fWriter);

        // Bank b = new Bank();
        atm.showAccounts(1);
        System.out.print("Select Account by number: ");
        System.out.println("If want to create and access another account press 3");
        int no = s.nextInt();
        System.err.println();
        Account acc = atm.getAccountsMap().get(1001);
        switch (no) {
            case 1001:
            case 1:
                System.err.println("Enter password : ");
                String pass = s.next();
                acc = atm.getAccountsMap().get(1001);
                if (!pass.equals(acc.getPassword())) {

                    System.out.println("Entered wrong password");
                    fWriter.close();
                    return;
                }
                break;
            case 1021:
            case 2:
                System.err.println("Enter password : ");
                String pass2 = s.next();
                acc = atm.getAccountsMap().get(1021);
                if (!pass2.equals(acc.getPassword())) {

                    System.out.println("Entered wrong password");
                    fWriter.close();
                    return;
                }
                break;
            case 3:
                System.out.println("Enter details ");
                System.out.println("name");
                String name = s.next();
                System.out.println("password");
                String password = s.next();
                System.out.println("Email");
                String email = s.next();
                if (acc.verify(email)) {// && password.length()!=8){
                    Account newacc = new Account(1031, name, password, 1000, email);
                    acc = newacc;
                } else {
                    fWriter.close();
                    System.out.println("entered wrong password");
                    return;
                }

                break;
            default:
                System.out.println("Error");
                break;
        }
        System.out.println("\n\n\t\tWelcome " + acc.name + " ....\n");

        do {
            System.out.println("\n\t\tSelect One Option : ");
            String[] options = { "1. Deposit", "2. Withdraw", "3. Balance", " 4. Quit" };
            for (String opt : options) {
                System.out.println("\t\t" + opt);
            }
            int option = s.nextInt();
            BufferedWriter writer = new BufferedWriter(fWriter);

            switch (option) {
                case 1:

                    System.out.println("Enter amount to be deposited : ");
                    int depositAmount = 0;
                    // try {

                    depositAmount = takePerfectInputForDeposit(acc, 0, s);
                    // depositAmount = s.nextInt();

                    acc.setBalance(acc.getBalance() + depositAmount);
                    // try {
                    // System.out.println("\nUpdated balance : " + acc.getBalance());
                    // BufferedWriter writer = new BufferedWriter(fWriter);

                    writer.write("Acc NO. " + acc.accountNumber + " is deposited with " + depositAmount + "/-");
                    writer.newLine(); // w
                    writer.close();
                    // } catch (IOException e) {
                    // // TODO: handle exception
                    // }
                    System.out.println("Done");
                    break;
                case 2:

                    System.out.println("Enter amount for withdraw : ");
                    int withdrawAmount = takePerfectInputForWithdraw(acc, 0, s);
                    acc.setBalance(acc.getBalance() - withdrawAmount);

                    writer.write("Acc NO. " + acc.accountNumber + " is withdrawn by " + withdrawAmount + "/-");
                    writer.newLine(); // w
                    writer.close();
                    // System.out.println("\nUpdated balance : " + acc.getBalance());
                    System.out.println("Done");

                    break;
                case 3:
                    System.out.println("\nYou account balance : " + acc.getBalance());
                    break;
                case 4:
                    // fWriter.close();
                    // writer.close();
                    System.out.println("\n\nThank you!\nexiting..................");
                    return;
                default:
                    System.out.println("Error");
                    break;
            }

        } while (true);
    }
}

class Atm extends Bank {

    @Override
    public void addAccount(Account acc) throws Exception {
        super.addAccount(acc);
    }
}
