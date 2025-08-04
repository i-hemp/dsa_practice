package others.ashwin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Pair {
    int lastIndex;
    int firstIndex;

    public Pair(int lastIndex, int firstIndex) {
        this.lastIndex = lastIndex;
        this.firstIndex = firstIndex;
    }

}

public class A1 {
    public static void main(String[] args) {

        {
            // map.put('a', new int[] { 1, 2 });
            // map2.put('a', new Pair(20, 30));
            // System.out.println(map.get('a')[0]);
            // System.out.println(map2.get('a'));

            // boolean[] bool = new boolean[charr.length];
            // Arrays.fill(bool, true);
            // for (int i = 0; i < charr.length; i++) {
            // System.out.print(charr[i] + " ");
            // }
            // System.out.println();

            // ArrayList<Integer> answer = new ArrayList<>();
            // char[] charr = str.toCharArray();
            // Set<Character> set = new HashSet<>();
            // int n = charr.length;
            // for (int i = 0; i < charr.length; i++) {
            // int firstIndex = i;
            // int lastIndex = -1;
            // for (int j = n - 1; j >= 0; j--) {
            // if (i < j && charr[i] == charr[j] && !set.contains(charr[i])) {
            // lastIndex = j;
            // set.add(charr[i]);

            // }
            // }
            // if (lastIndex != -1) {
            // System.out.println(firstIndex + " " + lastIndex);
            // }
            // int sum = 0;
            // for (int j = firstIndex + 1; j < lastIndex; j++) {
            // sum += charr[j];
            // }
            // if (sum != 0)
            // answer.add(sum);
            // }
            // System.out.println(answer);

            // for (int j = 0; j < charr.length; j++) {
            // if (i<j&&charr[i] == charr[j] && bool[i] == true) {
            // lastIndex = Math.max(lastIndex, j);
            // Arrays.fill(bool,i, j,false);

            // }
            // }

            // for (int i = 0; i < charr.length; i++) {
            // System.out.print((i) + " ");
            // }
            // boolean flag = true;
            // System.out.println();
            // for (int i = 0; i < charr.length; i++) {
            // int firstIndex=i;
            // int lastIndex=-1;
            // for (int j = n-1; j >=0; j--) {
            // if(charr[i]==charr[j]){
            // lastIndex=Math.max(lastIndex, j);
            // }
            // }
            // }
            // for (int i = 0; i < n; i++) {
            // int sum = 0;
            // int firstIndex = i;
            // int lastIndex = 0;
            // // if(!set.contains(charr[i])){

            // for (int j = n - 1; j >= 0; j--) {
            // if (i != j && charr[i] == charr[j]) {
            // firstIndex = Math.max(firstIndex, i);
            // lastIndex = Math.max(lastIndex, j);

            // }
            // }
            // // }
            // System.out.println(firstIndex + " " + lastIndex);
            // }
            // System.out.println(map);
            // for (Pair entry : map.values()) {
            // System.out.println(entry.firstIndex + " "+entry.lastIndex);
            // }
            // for (Map.Entry<Character,Integer> it : map.entrySet()) {
            // System.out.println(it.getKey()+""+it.getValue());
            // }
        }

        String str = "acdac";
        str = "ufvvzdv";// [340]
        // str = "xhnwazunnwdrkdmccz";
        /*
         * It's Correct output is:
         * [221, 556, 565, 1184]
         * Output Difference:
         * [0, 221, 556, 565, 1184]
         */
        ArrayList<Integer> res = me(str);

        System.out.println(res);
    }

    private static ArrayList<Integer> me(String str) {
        // int nums[] = {1,3,-1,-3,5,3,6,7}, k = 3;

        {

            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i) + " ");
            }
            System.out.println();
            for (int i = 0; i < str.length(); i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            // Map<Character, Pair> map2 = new HashMap<>();

            // for (int i = 0; i < a.length; i++) {
            // int firstIndex = i;
            // int lastIndex = -1;
            // if (!map.containsKey(a[i])) {
            // map.put(a[i], new int[] { firstIndex, lastIndex });
            // }
            // }
        }

        ArrayList<Integer> answer = new ArrayList<>();
        char a[] = str.toCharArray();
        Map<Character, int[]> map = new HashMap<>();

        int n = a.length;
        int i = 0, j = n;
        while (i < j) {
            j--;
            // System.out.printf("Checking [ %d ] %c = [ %d ] %c\n", i, a[i], j, a[j]);
            if (i < j && a[i] == a[j]) {
                if (!map.containsKey(a[i]))
                    map.put(a[i], new int[] { i, j });
                System.out.println("ans : " + i + " " + j);
                j = n;
                i++;
            }
            if (i == j) {
                i++;
                j = n;
            }
        }
        System.out.println();

        for (Map.Entry<Character, int[]> entry : map.entrySet()) {
            // System.out.println();
            int firstIndex = entry.getValue()[0];
            int lastIndex = entry.getValue()[1];
            System.out.println(entry.getKey() + " : " + firstIndex + " " + lastIndex);
            if ((lastIndex - firstIndex) > 1) {
                int sum = get(a, firstIndex, lastIndex);
                answer.add(sum);
            }
        }
        return answer;
    }

    private static Integer get(char[] a, int i, int j) {
        int sum = 0;
        System.out.print("adding ");
        for (int k = i + 1; k < j; k++) {
            System.out.print(k + " " + a[k] + " | ");
            sum += a[k];
        }
        System.out.println(" SUM : " + sum);
        return sum;
    }
}