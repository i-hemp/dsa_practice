package daily.sat28;

import java.util.Arrays;

public class D1 {
    public static void main(String[] args) {
        int x[] = { 1, 2, 3, 4, 5, 6 };
        int h[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        System.arraycopy(x, 2, h, 2, x.length - 2);
        System.out.println(Arrays.toString(h));
    }
}
