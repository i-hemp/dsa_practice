package TCSNQTPRACTICE.pack2;

import java.util.Arrays;

@SuppressWarnings("unused")
public class Sorting {
    public static void main(String[] args) {
        int a[] = new int[] { 98, 11, 0, 4, 2, 31, 1, 119, 10, 73 };
        // bubbleSort(a);
        System.out.println(Arrays.toString(a));

        insertionSort(a);
        System.out.println(Arrays.toString(a));

    }

    private static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int curr = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > curr) {
                
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = curr;
            System.out.println(Arrays.toString(a));
        }
        
    }

    private static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(a));
    }
}
