package d1;

import java.util.Arrays;

public class D2 {
    public static int findDays(int a[], int cap) {
        return -1;
    }

    public static void main(String[] args) {
        int a[] = { 5, 4, 5, 2, 3, 4, 5, 6 }, d = 5;
        int ANSWER = 9;
        int min = Arrays.stream(a).max().getAsInt();
        int max = Arrays.stream(a).sum();

        // for (int capacity = min; capacity < max; capacity++) {
        int capacity = min;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            int countForDays = 1;
            int load = 0;
            System.out.println("Capacity: " + capacity);
            for (int i = 0; i < a.length; i++) {
                if (load + a[i] > capacity) {
                    load = a[i];
                    countForDays += 1;
                } else {
                    load += a[i];
                }
                System.out.print("load: " + load + "| ");
            }
            System.out.println("\nDays: " + countForDays);
            if (countForDays <= d) {
                System.out.println("FOUND " + capacity);
                // break;
                max=mid-1;
            } 
            // if(capacity){
            else {
                min = mid+ 1;
            }
        }
        System.out.println(capacity);
    }
}
