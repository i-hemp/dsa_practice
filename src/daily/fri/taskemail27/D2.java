package daily.fri.taskemail27;
// Question 2: Remove Duplicate Items

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class D2 {
    public static boolean same(String val1, String val2) {
        return val1.equals(val2);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // Scanner s = new Scanner(System.in);
        // System.out.println("Enter no of values: ");
        // int n = s.nextInt();
        // if (n < 1) {
        // System.out.println("No products available");
        // s.close();

        // return;
        // }
        // String[] values = new String[n]
        //
        // String[] values = { "Laptop"};, "de" };
        String[] values = { "Laptop", "Phone", "Mouse", "Phone", "Mouse", "de" };
        System.out.println(Arrays.toString(values));
        Arrays.sort(values);
        System.out.println(Arrays.toString(values));
        String currString = "";
        int n = values.length;
        if (n < 2) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (currString == values[i]) {
                continue;
            }
            System.out.print(i + " " + values[i] + " ");
            if (same(values[i], values[i + 1])) {
                currString = values[i];
            }

            // if(i<values.length-1)System.out.print(" Comparing "+values[i]+values[i+1]);
        }
        if (!same(values[n - 1], values[n - 2])) {
            System.out.print((n - 1) + " " + values[n - 1]);
        }
        System.out.println();

        // for (int i = 0; i < values.length; i++) {
        // // System.out.print(" Current " + values[i]);
        // if (i != values.length - 1) {
        // if (same(values[i], values[i + 1])) {
        // // System.out.print(" Duplicate");
        // continue;
        // }
        // else{
        // System.out.print(values[i]+" ");
        // }
        // } else {
        // if (same(values[i], values[i - 1])) {
        // continue;
        // } else {
        // System.out.print(values[i]);
        // }
        // }
        // // if (!values[i].equals(values[i + 1])) {
        // // System.out.print(values[i] + " : " + i + " | ");
        // // i++;
        // // }

        // // String x = s.next();
        // // list.add(x);
        // // values[i] = x;

        // // list.add(values[i]);
        // System.out.println();
        // }
        // System.out.println();

        // System.out.println(list);
        // Collections.sort(list);
        // System.out.println(list);
        // for (int i = 0; i < values.length; i++) {

        // }
        // System.out.println(list);

    }
}
