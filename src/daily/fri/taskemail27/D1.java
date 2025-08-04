package daily.fri.taskemail27;

import java.util.Scanner;
// Question 1: Add and Display Products

public class D1 {
    public static void main(String[] args) {
        // Laptop, Phone, Mouse
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of values: ");
        int n = s.nextInt();
        if (n<1) {
            System.out.println("No products available");
        s.close();

            return;
        }
        String[] values = new String[n];
        for (int i = 0; i < values.length; i++) {
            values[i] = s.next();
        }
        s.close();
        for (int i = 0; i < values.length; i++) {
            System.err.print(values[i]+" ");
        }
        System.out.println();
    }

}
