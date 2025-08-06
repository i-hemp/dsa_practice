package d3;

import java.util.Arrays;
import java.util.Comparator;

import org.apache.commons.lang3.ArraySorter;

public class D2 {
    public static void main(String[] args) {
        String a[] = {"abab","aba","abc"};//{ "flower", "flow", "flight" };// ["dog","racecar","car"]
        String res = longestCommonPrefix(a);

        System.out.println(res);
    }

    public static String longestCommonPrefix(String[] a) {
        // int minLen = Integer.MAX_VALUE;
        // int cntChars = 0;
        // String minLen = Arrays.stream(a).forEach(arg0 -> (arg0.length(),minLen));
        String ans = "";// + a[0].charAt(0);
        // int cnt = 0;
        // for (int i = 0; i < a.length; i++) {
        // if (a[i].length() < minString.length()) {
        // minString = a[i];
        // }
        // }a
        Arrays.sort(a, Comparator.comparingInt(String::length));

        String minString = a[0];
        String maxString = a[a.length - 1];
        int cnt = 0;
        for (int i = 0; i < minString.length(); i++) {
            if(minString.charAt(i)==maxString.charAt(i)){
                ans+=minString.charAt(i);
            }
        }
        // for (int i = 0; i < minString.length(); i++) {
        //     cnt++;
        //     if (minString.charAt(i) == maxString.charAt(i)) {
        //         if (cnt == a.length) {
        //             ans += minString.charAt(i);
        //             cnt = 0;
        //         }
        //     } else {
        //         return ans;
        //     }
        // }
        // Arrays.sort(a);
        // System.out.println(Arrays.toString(a));
        // Arrays.sort(a, Comparator.comparingInt(arg0 -> arg0.length()));
        // Arrays.sort(a, Comparator.comparingInt(String::length));
        // System.out.println(Arrays.toString(a));
        // String minString = a[0];
        // String maxString = a[a.length - 1];
        // for (int i = 0; i < minString.length(); i++) {
        // if (minString.charAt(i) == maxString.charAt(i)) {
        // ans += minString.charAt(i);
        // } else {
        // return ans;
        // }
        // }

        // System.out.println(minString);

        // for (int i = 0; i < minString.length(); i++) {
        // for (int j = 0; j < a.length; j++) {
        // if(i>a[j].length())return ans;
        // if (minString.charAt(i) == a[j].charAt(i)) {
        // cnt++;
        // // System.out.print(cnt + " ");
        // }
        // }
        // if (cnt == a.length) {
        // ans += minString.charAt(i);

        // }
        // cnt = 0;
        // }
        return ans;
        // for (int j = 0; j < a.length; j++) {

        // if (ans.charAt(cntChars) == a[j].charAt(j)) {
        // cnt++;
        // }
        // }
        // if(cnt==a.length){
        // ans+=a[i].charAt();
        // }
        // }
        // System.out.println(ans);
        // return new String();
    }
}
