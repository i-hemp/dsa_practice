package d1;

public class D4 {
    public static void main(String[] args) {
        int a[] = { 2, 3, 4, 7, 11 }, k = 4;

        for (int i = 0; i < a.length; i++) {
            // if (a[i] <= k)
            if (a[i] > k) {
                System.out.println(k);
                break;
            }
            k++;
        }
        System.out.println(k);
    }

    public static void find() {
        int a[] = { 2, 3, 4, 7, 11 }, k = 6;
        int low = 0;
        int high = a.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int missing = a[mid] - mid - 1;
            if (missing < k)
                low = mid + 1;
            else
                high = mid - 1;

        }

        System.out.println(low + k);
    }
}
