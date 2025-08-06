package d3;

import java.util.Arrays;
import java.util.HashMap;

@SuppressWarnings("unused")
public class D4 {
    public static void main(String[] args) {
        String s = "egg", t = "add";
        // s = "aabrred";
        // t = "xxywwet";
        // s = "aabrree";
        // t = "xxywwet";
        // ! failed cases
        // s = "bbbaaaba";
        // t = "aaabbbba";
        // String b = "dyhnjitfuexuxgauaxekaqc";
        // String a = "meghoqtclljtuwgladtgfun";
        // s = a;
        // t = b;

        boolean res = isIsomorphic(s, t);
        System.out.println(res);
    }

    public static boolean isIsomorphic2(String s, String t) {
        s = "bbbaaaba";
        t = "aaabbbba";
        if (s.length() != t.length())
            return false;

        char a[]=s.toCharArray();
        char b[]=t.toCharArray();
        int cnt=0;
        char curr = '1';
        for (char c : a) {
            if(cnt==0 ){

            }
        }


        
        return false;

    }

    public static boolean isIsomorphic(String s, String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();
        // int ss[] = new int[26];
        // for (int i = 0; i < s.length(); i++) {
        // ss[s.charAt(i) - 'a']++;
        // }
        System.out.println("s " + s + " t " + t);
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),
                    map.getOrDefault(s.charAt(i), 0) + 1);
        }
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            map2.put(t.charAt(i),
                    map2.getOrDefault(t.charAt(i), 0) + 1);
        }
        HashMap<Integer, Integer> mapCnt = new HashMap<>();

        for (Integer ch : map.values()) {
            mapCnt.put(ch, mapCnt.getOrDefault(ch, 0) + 1);
        }
        HashMap<Integer, Integer> mapCnt2 = new HashMap<>();

        for (Integer ch : map2.values()) {
            mapCnt2.put(ch, mapCnt2.getOrDefault(ch, 0) + 1);
        }

        System.out.println(map);
        System.out.println(map2);

        System.out.println(mapCnt);
        System.out.println(mapCnt2);
        System.out.println(mapCnt.equals(mapCnt2));
        // int ts[] = new int[26];
        // for (int i = 0; i < t.length(); i++) {
        // ts[t.charAt(i) - 'a']++;
        // }
        // System.out.println(Arrays.toString(ss));
        // System.out.println(Arrays.toString(ts));
        return false;
    }
}

// class Solution {
// public String longestCommonPrefix(String[] strs) {
// if (strs == null || strs.length == 0)
// return "";
// String pref = strs[0];
// int prefLen = pref.length();
// for (int i = 1; i < strs.length; i++) {
// String s = strs[i];
// while (prefLen > s.length() || !pref.equals(s.substring(0, prefLen))) {
// prefLen--;
// if (prefLen == 0) {
// return "";
// }
// pref = pref.substring(0, prefLen);
// }
// }
// return pref;
// }
// }