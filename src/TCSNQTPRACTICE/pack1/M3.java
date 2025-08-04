package TCSNQTPRACTICE.pack1;

import java.util.Arrays;

public class M3 {
    public static void main(String[] args) {
        int a[] = { 4, 0, 5, 0, 1, 9, 0, 5, 0 };
        int end = a.length - 1;
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
            for (int j = i; j < a.length; j++) {
                if(a[j]!=0)break;
            }
                // int temp = a[i];
                int index = i;
                while (index < end - 1) {
                    a[index] = a[index + 1];
                    index++;
                }
                a[--end] = 0;
                // end--;
                System.out.println(Arrays.toString(a));
            }
        }
        System.out.println("END");
        System.out.println(Arrays.toString(a));
    }
}
