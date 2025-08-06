package d2;

public class D1 {
    public static void main(String[] args) {
        int n = 3, m = 3, mat[][] = {
                { 0, 0, 1 },
                { 0, 0, 1 },
                { 0, 1, 1 }
        };
        int maxCount = 0;
        int idx = -1;
        for (int i = 0; i < n; i++) {
            int count = m - fun(mat[i], m, 1);
            if (count > maxCount) {
                maxCount = count;
                idx = i;
            }
        }
        System.out.println(idx);
    }
rivate static int fun(int[] a, int n, int x) {
        int low = 0;
        int high = n - 1;
        int ans = n;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a[mid] >= x) {
                ans = mid;
          
    p      high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
