package d3;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class D7 {
    public static void main(String[] args) {
        // System.out.println(91283472332l > Integer.MAX_VALUE);
        // int dsa = (int) (91283472332l);
        // String s = " 1337c0d3";
        // // s = "-91283472332";
        // // s = " -0 123";
        // // s = " 0.1";

        // // s = "20000000000000000000";
        // // s = " +0a32";
        // // s = " 0000000000012345678";
        // Solution sol = new Solution();
        // int res = sol.myAtoi3(s);
        // System.out.println("returned: " + res);
        String s = "aabcb";
        // s = "aabcbaa";
        s = "xzvfsppsjfbxdwkqe";
        // "aab","aabc","aabcb","abcb","bcb"
        int res = new Solution().beautySum(s);
        System.out.println(res);
    }
}

class Solution {
    // public void prints(String ) {

    // }
    public int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public int getMin(int[] arr) {
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                max = Math.min(max, arr[i]);
        }
        return max;
    }

    public int beautySumSridharSolution(String s) {
        int n = s.length();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int[] arr = new int[26];
            for (int j = i; j < n; j++) {
                int val = s.charAt(j) - 'a';
                arr[val]++;
                // Arrays.stream(arr).max()
                // Arrays.stream(arr).max().getAsInt()
                int ans = getMax(arr) - getMin(arr);
                sum += ans;
            }
        }
        return sum;
    }

    public int beautySum(String s) {
        int n = s.length();
        int sum = 0;
        char chars[] = s.toCharArray();
        Set<String> ans = new HashSet<>();
        for (int i = 0; i < n; i++) {
            // chars[0]
            String str = "";
            int freq[] = new int[('z' - 'a') + 1];
            Arrays.fill(freq, -1);
            Set<Character> set = new HashSet<>();
            int maxi = Integer.MIN_VALUE;
            int mini = Integer.MAX_VALUE;

            for (int j = i; j < n; j++) {
                str += chars[j];
                set.add(chars[j]);
                if (freq[chars[j] - 'a'] == -1)
                    freq[chars[j] - 'a']++;
                freq[chars[j] - 'a']++;
                maxi = Math.max(maxi, freq[chars[j] - 'a']);
                mini = Math.min(mini, freq[chars[j] - 'a']);
                if (set.size() > 1 && (maxi - mini) > 0) {
                    ans.add(str);
                    sum += (maxi - mini);
                    System.out.println(str + " " + ans.size());
                }
                System.out.println(str + " " + set + " max: " + maxi + " min: " + mini);// + Arrays.toString(freq));
                // if(find(str,freq));
            }
            // System.out.println(maxi + " " + mini);
            System.out.println();
            set.clear();
            // System.out.println(freq.length);
        }
        System.out.println(ans);
        System.out.println("sum : " + sum);
        return sum;
    }

    public static boolean isPerfectInt(char ch, int start) {
        if ((ch >= start && ch <= 57)) {
            return true;
        }
        return false;
    }

    public int myAtoi3(String s) {

        s = s.trim();
        String ans = "=>";
        // int ints = Integer.parseInt("00000000000000000001");
        // System.out.println(ints);
        // for (int i = 0; i < s.length(); i++) {
        // char ch = s.charAt(i);
        // if ((ch >= 48 && ch <= 57)) {
        // ans += ch;
        // }
        // }
        boolean isStarted = false;
        for (int i = 0; i < s.length(); i++) {
            if (isStarted) {

            } else {
                char ch = s.charAt(i);
                if (isPerfectInt(ch, 0)) {
                    ans += ch;
                }
            }
        }
        System.out.println(ans);
        return 0;
    }

    public int myAtoi(String s) {

        s = s.trim();
        String ans = "";
        long ansInteger = 0, multiple = 1;
        if (s.length() == 0 || s.equals("-") || s.equals("+"))
            return 0;
        if ((s.charAt(0) >= 97 && s.charAt(0) <= 122) ||
                (s.charAt(0) >= 65 && s.charAt(0) <= 90) || s.charAt(0) == 46) {
            System.out.println(0);
            return 0;
        }
        int level = 0;
        boolean isStarted = false;
        if (s.charAt(0) == '-') {
            multiple = -1;
            level = 1;
        }
        if (s.charAt(0) == '+') {
            multiple = 1;
            level = 1;
        }
        for (int i = level; i < s.length(); i++) {
            if (ans.length() > 10) {
                break;
            }
            char ch = s.charAt(i);
            if (ch == '+' || ch == '-' || ch == '.')
                return ans.equals("") ? 0 : (Integer.parseInt(ans) * (int) multiple);
            if ((ch >= 48 && ch <= 57)) {
                isStarted = true;
                ans += ch;
            } else {
                if (isStarted) {
                    break;
                }
            }
        }
        // ansInteger=Long.parseInt(ans);
        // System.err.println(ansInteger*multiple);
        ansInteger = Long.parseLong(ans);
        ansInteger *= multiple;
        if (ansInteger > Integer.MAX_VALUE) {
            System.out.println(Integer.MAX_VALUE);
            return Integer.MAX_VALUE;
        } else if (ansInteger < Integer.MIN_VALUE) {
            System.err.println(Integer.MIN_VALUE);
            return Integer.MIN_VALUE;
        }
        // System.err.println((int) (ansInteger * multiple));
        return (int) ansInteger;
    }

    public static boolean checkInt(char ch) {
        return false;
    }

    public static int check(String s) {
        String str = " +-";
        boolean isStarted = false;
        // for (int i = 0; i < s.length(); i++) {
        // char ch = s.charAt(i);
        // if(isStarted){
        // if(str.contains(ch) )
        // }
        // }
        return 0;
    }

    public int myAtoi2(String s) {
        System.err.println(s);
        s = s.trim();
        System.out.println(s);
        int i = 0, ansInteger = 0;
        String ans = "";
        if (s.equals(""))
            return 0;
        boolean positive = true, isStarted = false;

        if (s.charAt(0) == '-') {
            positive = false;
            i = 1;
        }
        if (s.charAt(0) == '+')
            i = 1;
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ans.length() > 10) {
                break;
            }
            if (i < s.length() && ch == '0' && s.charAt(i + 1) > 57)
                break;
            if (isStarted != true && ch == '0') {
                i++;
                continue;
            }
            if ((ch >= 48 && ch <= 57)) {
                ans += ch;
                isStarted = true;
            } else {
                if (isStarted)
                    break;

            }
            i++;
        }
        if (ans.equals(""))
            return 0;// 9223372036854775807
        if (ans.length() >= 10 && ans.length() <= 19) {
            if (ans.charAt(0) == '-')
                return Integer.MIN_VALUE;
            else
                return Integer.MAX_VALUE;
        }
        ansInteger = Integer.valueOf(ans);
        return positive ? ansInteger * 1 : ansInteger * -1;
    }
}

// class D4 {
// public static void main(String[] args) {
// System.out.println(91283472332l > Integer.MAX_VALUE);
// // int dsa = (int) (91283472332l);
// // String s = " 1337c0d3";
// // String s = "-91283472332";
// // String s = "20000000000000000000";
// // String s = " +0a32";
// String s = " 0000000000012345678";
// Solution sol = new Solution();
// int res = sol.myAtoi2(s);
// System.out.println(res);
// // // String s = " +13.37c0d3";
// // // StringBuilder res = new StringBuilder();
// // s = s.trim();
// // String ans = "";
// // long ansInteger = 0, multiple = 1;

// if ((s.charAt(0) >= 97 && s.charAt(0) <= 122) ||
// (s.charAt(0) >= 65 && s.charAt(0) <= 90) || s.charAt(0) == 46) {
// System.out.println(0);
// return;
// }
// int level = 0;
// boolean isStarted = false;
// if (s.charAt(0) == '-') {
// multiple = -1;
// level = 1;
// }
// if (s.charAt(0) == '+') {
// multiple = 1;
// level = 1;
// }
// for (int i = level; i < s.length(); i++) {
// char ch = s.charAt(i);

// if ((ch >= 48 && ch <= 57)) {
// isStarted = true;
// ans += ch;
// } else {
// if (isStarted) {
// break;
// }
// }
// }
// ansInteger = Long.parseLong(ans);
// ansInteger *= multiple;
// if (ansInteger > Integer.MAX_VALUE){
// System.out.println(Integer.MAX_VALUE);
// return;
// }
// else if (ansInteger < Integer.MIN_VALUE){
// System.err.println(Integer.MIN_VALUE);
// return;
// }
// int p=(int)(ansInteger);
// System.err.println((int) (ansInteger * multiple));

// // // System.err.println(Math.toIntExact(ansInteger * multiple));

// // // || s.charAt(0) != 32 || s.charAt(0) != 43 || s.charAt(0) != 45 ||
// // s.charAt(0) != 46)
// }
// }
