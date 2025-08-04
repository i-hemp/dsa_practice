package d1;

public class D1 {

    public static void main(String[] args) {
        int a[] = { 8, 4, 2, 3 }, limit = 10;
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            low = Math.min(low, a[i]);
            high = Math.max(high, a[i]);
        }
        System.out.println(low + " " + high);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int divisors = divisors(a, mid);
            if (divisors <= limit) {
                System.out.println("Found" + mid);
                high = mid - 1;
            } else
                low = mid + 1;
        }
        System.out.println(low);

    }

    public static int divisors(int a[], int val) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += Math.ceil((double) a[i] / val);
        }
        return sum;
    }
}