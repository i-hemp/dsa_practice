package d2;

public class D4 {
    public static void main(String[] args) {
        int a[][] = { { 10, 20, 15 },
                      { 21, 30, 14 },
                      { 7 , 16, 32 } };
        int res = peak(a);
        System.out.println(res);
    }

    private static int peak(int[][] a) {
        int low = 0;
        int high = a[0].length - 1;

        while (low <= high) {
            // for (int i = 0; i < a.length; i++) {
            int mid = (low + high) / 2;
            int maxidx = findMax(a, mid);
            int left = mid - 1 >= 0 ? a[maxidx][mid - 1] : -1;
            int right = mid + 1 <= a[0].length ? a[maxidx][mid + 1] : -1;

            if (a[maxidx][mid] > left &&
                    a[maxidx][mid] > right) {
                System.out.println(a[maxidx][mid]);
                break;
            } else if (a[maxidx][mid] < left) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            // System.err.println(maxi);

        }
        return 0;

    }

    private static int findMax(int[][] a, int mid) {
        int maxi = Integer.MIN_VALUE;
        int maxIdx = -1;
        for (int i = 0; i < a.length; i++) {
            if (maxi < a[i][mid]) {
                maxi = a[i][mid];
                // maxi = Math.max(maxi, a[i][mid]);
                maxIdx = i;
            }
        }
        return maxIdx;
    }
}
