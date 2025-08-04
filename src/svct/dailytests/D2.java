package svct.dailytests;

import java.util.*;

public class D2 {
    public static void main(String[] args) {

        // String s = "abbaca";
        // s = "azxxzy";
        // Solution sol = new Solution();
        // String res = sol.removeDuplicates(s);
        // System.out.println("GOT RESULT : " + res);

        // int[] a = { 214, 214, -214, -214, -214, 214 };
        // // nums =
        // // [2147483647,2147483647,-2147483647,-2147483647,-2147483647,2147483647]
        // // Use Testcase
        // // Output
        // // 6
        // // Expected
        // // 9
        // // a={3, 2, 4, 5, 1, 20};
        // // ;// = { 1, 3, 2, 3, 1 };
        // int res = new Solution().reversePairs(a);
        // System.out.println("ANS : " + res);
        // String s = "abcaaba";
        // int res = new Solution().maximumLength(s);
        // System.out.println(res);
        int res = new Solution().minStoneSum(new int[] { 4, 3, 6, 7 }, 3);
        System.out.println(res);
    }
}

class Solution {
    // 1962. Remove Stones to Minimize the Total
    public int minStoneSum(int[] piles, int k) {
        // int x = 19;
        // System.out.println((x / 3.0) + " " + (Math.ceil(x / 3.0)) + " " +
        // Math.floor(x / 3.0));

       // int total = 0;

        PriorityQueue<Integer> q = new PriorityQueue<>((arg0, arg1) -> arg1 - arg0);
        for (Integer integer : piles) {
          //  total += integer;
            q.add(integer);
        }
// 3 4 6 7
        for (int i = 0; i < k; i++) {
            int val = q.poll();
            int oper = (int) Math.ceil(val / 2.0d);
            //total = total - val + oper;
            // System.out.println(total);
            q.add(oper);
        }
        int sum = 0;
        for (Integer integer : q) {
            sum += integer;
        }
        System.err.println(sum);
        // System.out.println(q);
        return sum;
    }

    // 2981. Find Longest Special Substring That Occurs Thrice I
    private static int findMin2981(int i, int j, int k, int a[]) {
        if (a[i] <= a[j] && a[i] <= a[k])
            return i;
        if (a[j] <= a[i] && a[j] <= a[k])
            return j;
        return k;
    }

    public int maximumLength(String s) {
        System.out.println(s);
        // HashMap<Character, int[]> map = new HashMap<>();
        s = s.toLowerCase();
        int map[][] = new int[26][3];
        for (int j = 0; j < map.length; j++) {
            map[j][0] = -1;
            map[j][1] = -1;
            map[j][2] = -1;
        }
        char prev = '~';
        int cnt = 0;
        for (char curr : s.toCharArray()) {

            int idx = curr - 'a';
            cnt = (curr == prev) ? cnt + 1 : 1;
            prev = curr;
            int min = findMin2981(0, 1, 2, map[idx]);
            if (map[idx][min] < cnt)
                map[idx][min] = cnt;

        }
        // System.out.println(Arrays.deepToString(map));
        int maxlen = -1;
        for (int i = 0; i < map.length; i++) {
            maxlen = Math.max(maxlen, findMin2981(0, 1, 2, map[i]));
        }
        System.out.println(maxlen);
        return -1;

    }

    // 493: Reverse Pairs
    public int reversePairs(int[] a) {
        int cnt = 0, n = a.length;

        // while () {

        // }

        return cnt;
        // ! bruteforce
        // System.out.println(Arrays.toString(a));
        // int cnt = 0;
        // int n = a.length;
        // for (int i = 0; i < n; i++) {
        // for (int j = i + 1; j < n; j++) {
        // if ((long) a[i] > 2L * (long) a[j]) {
        // cnt++;
        // System.out.println("Pair: (" + i + ", " + j + ") => " + a[i] + " > 2 * " +
        // a[j]);
        // }
        // }
        // }

        // return cnt;

    }

    // 1047. Remove All Adjacent Duplicates In String
    public String removeDuplicates(String s) {
        {

            // for (char ch : s.toCharArray()) {
            // System.out.print(ch + " ");
            // }
            // System.out.println();
            // for (int i = 0; i < s.length(); i++) {
            // System.out.print(i + " ");
            // }
            // System.out.println();
        }
        StringBuilder builder = new StringBuilder();
        for (char ch : s.toCharArray()) {
            int len = builder.length();
            if (len > 0 && builder.charAt(len - 1) == ch) {
                builder.deleteCharAt(len - 1);
            } else {
                builder.append(ch);
            }
        }
        return builder.toString();
        // String ans = "";
        // Stack<Character> st = new Stack<>();
        // for (Character ch : s.toCharArray()) {
        // if (!st.isEmpty() && st.peek() == ch) {
        // st.pop();
        // } else
        // st.push(ch);
        // }
        // for (Character character : st) {
        // ans+=character;
        // }
        // return ans;

        // StringBuilder builder = new StringBuilder();

        // for (char ch : s.toCharArray()) {
        // builder.append(ch);
        // }
        // int i = 1;
        // while (builder.length() > 0 && i < builder.length()) {

        // // System.out.print(builder.charAt(i) + " " + builder.charAt(i + 1) + " | ");
        // if (builder.charAt(i - 1) == builder.charAt(i)) {
        // builder.delete(i - 1, i + 1);
        // i = 0;
        // // System.out.print(builder.toString());
        // }
        // i++;
        // // System.out.println(i + " " + builder.toString());
        // }

        // System.out.println("\n ANS : " + builder.toString());

        // return builder.toString();
    }
}