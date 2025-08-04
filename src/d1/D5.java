package d1;

import java.util.Arrays;

public class D5 {

    private static void me(int[] a, int space, int cows) {
        int i = 1, currentCowsPlaced = 1;

        int lastCowIndex = a[0];
        while (i < a.length) {
            if ((a[i] - lastCowIndex) >= space) {
                currentCowsPlaced += 1;
                lastCowIndex = a[i];

            }
            i++;
        }
        if (currentCowsPlaced >= cows) {
            System.out.println("can ");
        }

    }

    public static void main(String[] args) {
        int a[] = { 0, 3, 4, 7, 9, 10 };
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            max = Math.max(max, a[i]);
            min = Math.min(min, a[i]);

        }
        Arrays.sort(a);
        int cows = 4;
        int low = 0;
        int high = max - min;
        while (low <= high) {
            int mid=(low+high)/2;
        }
    }
}
