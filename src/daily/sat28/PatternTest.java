package daily.sat28;

import java.util.Arrays;

public class PatternTest {
    public static void main(String[] args) {
        int a = 5;
        // int a[] = { 1, 2, 3, 4, 5, 6, 7 };
        // int h[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        // int count = 0;
        // int ele = 3;
        // for (int i = 0; i < h.length; i++) {
        //     if ((h[i] % ele) == 0)
        //         count++;
        // }
        // System.out.println(count);

        // int merge[] = new int[a.length + h.length];
        // for (int i = 0; i < a.length; i++) {
        //     merge[i] = a[i];
        // }
        // System.out.println(Arrays.toString(merge));

        // for (int i = a.length; i < (a.length + h.length); i++) {
        //     merge[i] = h[i - a.length];
        // }
        // System.out.println(Arrays.toString(merge));

        // int low = 0;
        // int right = a.length - 1;
        f1(a);
        // System.out.println(Arrays.toString(a));
        // while (low <= right) {
        // int temp = a[low];
        // a[low] = a[right];
        // a[right] = temp;
        // low++;
        // right--;
        // }
        // System.out.println(Arrays.toString(a));
    }

    private static void f1(int a) {
        for (int i = a; i >=1; i--) {
            for (int j = i; j <= a; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
