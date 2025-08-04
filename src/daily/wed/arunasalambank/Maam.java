package daily.wed.arunasalambank;

import java.util.*;

class ATM

{

    static int p;

    public ATM()

    {
        System.out.print("Welcome Ur Name .... ");
    }

    public ATM(int p)

    {
        this.p = p;
    }

    public ATM(int Amt, char T)

    {

        if (T == 'W')

        {

            this.p = this.p - Amt;

            System.out.println("You have Withdrawn : " + Amt + " Rs/-");

        }

        else if (T == 'D')

        {

            this.p = this.p + Amt;

            System.out.println("You have Deposited: " + Amt + " Rs/-");

        }

    }

    public ATM(char T)

    {

        System.out.println("Balance Amount is : " + this.p);

    }

}

class Test

{

    static ATM d;

    static int n, P = 0;

    static void options()

    {

        System.out.println("\n\t Select One Option : \n\t 1. Deposit \n\t 2. Withdraw  \n\t 3. Balance \n\t 4. Quit");

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        if (n == 1)

        {

            System.out.print("\nEnter Amount to Deposit  :  ");

            P = sc.nextInt();

            d = new ATM(P, 'D');
            System.out.println(d.toString());
            options();

        }

        else if (n == 2)

        {

            System.out.print("\nEnter Amount to Withdraw : ");

            P = sc.nextInt();

            d = new ATM(P, 'W');
            System.out.println(d.toString());

            options();

        }

        else if (n == 3)

        {

            d = new ATM('B');
            System.out.println(d.toString());
            options();

        }

        else if (n == 4)

        {

            System.out.print("\nThank you for visiting");

            System.exit(0);

        }

    }

    public static void main(String args[])

    {

        ATM d;

        Scanner sc = new Scanner(System.in);

        d = new ATM();

        System.out.print("\nEnter Principle Amount  : ");

        P = sc.nextInt();

        d = new ATM(P);

        options();

    }

}
