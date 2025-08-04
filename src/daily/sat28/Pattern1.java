package daily.sat28;

import java.util.Scanner;

public class Pattern1

{

    public static void main(String args[])

    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No : ");

        int no = sc.nextInt();

        int i, j, c = 1, s;

        for (i = 0; i < no; i++)

        {

            for (s = 1; s <= no - i; s++)

                System.out.print(" ");

            for (j = 0; j <= i; j++)

            {

                if (j == 0 || i == 0)

                {

                    c = 1;

                }

                else

                {

                    c = c * (i - j + 1) / j;

                }

                System.out.print(c + " ");

            } // j++

            System.out.println();

        }

    }

}