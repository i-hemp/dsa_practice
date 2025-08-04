package TCSNQTPRACTICE.pack2;

import java.util.Arrays;
import java.util.HashSet;

// import java.util.Arrays;

public class MaximumsubarrayinStringArray {
    public static void main(String[] args) {
        // String a[] = { "abca", "abd", "abce" };
        // String a[] = { "abcde", "ace" };// , "abce" };
        String a[] = { "flower", "flow", "flight" };
        // Arrays.sort(a);
        // String val = "";
        // val = a[0];
        // HashSet<String> set = new HashSet<>();
        // int count = 0;
        String txt1 = a[0];
        String res = txt1;

        for (int i = 0; i < txt1.length(); i++) {
            int k = 0;
for (int j = 1; j < a.length; j++) {
                 if (i>=a[k].length() ||  ) {//error
res=a[k].substring(0,i);
                }
                k++;
            }
        }
        System.out.println(res);

        // for (int i = 0; i < a.length; i++) {
        // for (int j = i + 1; j < a.length; j++) {
        // int maxLen = Math.min(a[i].length(), a[j].length());
        // int k = 0;
        // while (k < maxLen) {
        // System.out.print(a[i].charAt(k) + " ");
        // if (a[i].charAt(k) == a[j].charAt(k)) {
        // val += a[i].charAt(k);
        // }
        // k++;
        // }
        // }
        // }
        // for (int i = 0; i < a.length; i++) {
        // for (int j = i + 1; j < a.length; j++) {

        // if (a[i].contains(a[j])) {
        // val = a[i];
        // } else {
        // break;
        // }
        // }
        // }

        // System.out.println(val);
        System.out.println();
    }
}
