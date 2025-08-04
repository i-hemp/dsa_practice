package daily.fri.taskemail27;

import java.util.ArrayList;
import java.util.Arrays;

public class D5 {
    public static void main(String[] args) {
        int a[] = { 2, 20, 2, 30, 2, 90, 2, 21, 2 };
        // ArrayList<Integer> list = new ArrayList<>();
        // for (Integer i : a) {
        // list.add(i);
        // }
        Integer removeElement = 2;
        int j = a.length - 1;
        System.out.println(Arrays.toString(a));
        for (int i = 0; i <= j; i++) {
            if (a[i] == removeElement) {
                System.out.println(i+" "+j);
                swap(i, j, a);
                j--;
            }
        }
        System.out.println(Arrays.toString(a));
        // System.out.println(list);
        // int j = list.size() - 1;
        // for (Integer integer : list) {
        // list.remove(removeElement);
        // }
        // System.out.println(list);
    }

    private static void swap(int i, int j, int[] a) {
        
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
