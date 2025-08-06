package d2;

import java.util.Arrays;
import java.util.Collections;

public class D6 {
    public static void main(String[] args) {
        String s = "this is an amazing program";
        String sTest = "this is an amazing     program";
        String ans = "";
        // “program amazing an is this”
        // for (int i = 0; i < s.length(); i++) {
        // System.out.print((Character.isWhitespace(s.charAt(i)) ? 't' : 'f') + " ");
        // }
        System.out.println();
        boolean wordStarted = !Character.isWhitespace(s.charAt(s.length() - 1));
        int cnt = 0;
        System.out.print(" ");
        // char sc[] = s.toCharArray();
        // Collections.reverse(Arrays.asList(sc));
        String sc = "";
        for (int i = 0; i < s.length(); i++) {
            sc += s.charAt(s.length() - 1 - i);
        }
        // s = sc;
        System.out.println(s);
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {
                System.out.print(" ");
            } else
                System.out.print(s.charAt(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {
                System.out.print(" ");
            } else
                System.out.printf("%2d", i);
        }
        System.out.println();
        s = s.trim();
        // int before = s.length() - 1;
        int startIndex = -1;
        int endIndex = s.length() - 1;
        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) == ' ' || i == 0) {

                // System.out.print(s.charAt(i));
                // } else {
                startIndex = i;
                System.out.println(
                        (startIndex) + " " + (endIndex + 1) + " " + s.substring(startIndex, endIndex + 1));
                endIndex = i;
            }
        }
        // for (int i = 0; i < s.length(); i++) {
        // if (s.charAt(i) == ' ') {

        // }
        // // else
        // // System.out.print(s.charAt(i));
        // }
        // System.out.println();
        // main

        // for (int i = s.length() - 1; i > 0; i--) {

        // if (s.charAt(i) == ' ' &&
        // s.charAt(i - 1) != ' ') {
        // System.out.print(i + " ");
        // ans += s.substring(i + 1, before + 1);
        // before = i + 1;
        // }
        // // else

        // // System.out.print(s.charAt(i));
        // }

        // for (int i = s.length() - 1; i >= 0; i--) {

        // if (wordStarted) {
        // cnt++;
        // wordStarted = !Character.isWhitespace(s.charAt(i));
        // } else {

        // System.out.print(" " + s.charAt(i));

        // }
        // // System.out.print(s.charAt(i));
        // }
        // System.out.println(ans);
        // System.err.println(cnt);

    }
}