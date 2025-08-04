package d1;

import java.util.Arrays;

public class D8 {
    public static void main(String[] args) {
        int a[] = { 25, 46, 28, 49, 24 };
        int n = 5;
        int m = 4;
        System.out.println(Arrays.toString(a));
        int maxi = Arrays.stream(a).max().getAsInt();
        int sumi = Arrays.stream(a).sum();
        int count = 0;
        while (maxi <= sumi) {
            int mid = (maxi + sumi) / 2;
            int stuCount = fun(a, mid);
            // if (stuCount == m) {
            //     System.out.println("FOUND " + mid);
            //     break;
            // }
              if (stuCount > m) {
                maxi = mid + 1;
            } else {
                sumi = mid - 1;
            }

        }
        System.err.println(maxi + " " + sumi);
    }

    private static int fun(int[] a, int maxpages) {
        int stu = 1;
        int pagecnt = 0;
        for (int i = 0; i < a.length; i++) {
            if (pagecnt + a[i] <= maxpages) {
                pagecnt += a[i];

            } else {
                // pagecnt = 0;
                pagecnt = a[i];
                stu++;
            }

        }
        return stu;
    }
}
