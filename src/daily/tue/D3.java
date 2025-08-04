package daily.tue;

import java.util.Arrays;
import java.util.Scanner;

public class D3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {

            a[i] = s.nextInt();
        }
        s.close();

        System.out.println(Arrays.toString(a));
        System.out.println(a);
    }
}
