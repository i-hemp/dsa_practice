package d1;

import java.util.Arrays;

public class D6 {

    public static int checkCapacity(int a[], int size) {
        int sumForOneBoat = 0;
        int daysCount = 1;
        for (int i = 0; i < a.length; i++) {
            if ((a[i] + sumForOneBoat) > size) {
                sumForOneBoat = a[i];
                daysCount += 1;
            } else {
                sumForOneBoat += a[i];
            }
        }
        return daysCount;
    }

    public static void main(String[] args) {
        int a[] = { 5, 4, 5, 2, 3, 4, 5, 6 }, d = 5;
        int low = Arrays.stream(a).max().getAsInt();
        int high = Arrays.stream(a).sum();
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (checkCapacity(a, mid) <= d) {
                high = mid - 1;

            } else {
                low = mid + 1;
            }
        }
        System.out.println(low);
    }
}
