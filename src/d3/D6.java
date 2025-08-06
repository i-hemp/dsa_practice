package d3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
// import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Pair {
    char ch;
    int cnt;

    public Pair(char ch, int cnt) {
        this.ch = ch;
        this.cnt = cnt;
    }

    public char getCh() {
        return ch;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

}

public class D6 {
    public static void sa() {
        for (int i = 0; i < 255; i++) {
            System.out.print(" " + i + "->" + (char) i + " ");
        }
    }
    // 58->: 59->; 60->< 61->= 62->> 63->? 64->@
    // 49->1 50->2 51->3 52->4 53->5 54->6 55->7 56->8 57->9
    // 65->A 66->B 67->C 68->D 69->E 70->F 71->G 72->H 73->I 74->J 75->K 76->L 77->M
    // 78->N 79->O 80->P 81->Q 82->R 83->S 84->Integer 85->U 86->V 87->W 88->X 89->Y
    // 90->Z
    // 97->a 98->b 99->c 100->d 101->e 102->f 103->g 104->h 105->i 106->j 107->k
    // 108->l 109->m 110->n 111->o 112->p 113->q 114->r 115->s 116->t 117->u 118->v
    // 1-19->w 120->x 121->y 122->z
    // 91->[ 92->\ 93->] 94->^ 95->_ 96->`

    public static void main(String[] args) {
        String s = "tree";
        // char chs[] = new char[s.length() + 1];
        // ArrayList<char[]> listss = new ArrayList<>();

        HashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        ArrayList<ArrayList<Character>> bucketList = new ArrayList<ArrayList<Character>>();
        ArrayList<Character> a;
        // System.out.println(map);
        for (int i = 0; i < s.length(); i++) {
            bucketList.add(new ArrayList<Character>());
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            a = bucketList.get(entry.getValue());
            a.add(entry.getKey());
            // bucketList.add(entry.getValue(), a);
        }
        String ans = "";

        Map<Integer, String> alistsFinal = new HashMap<Integer, String>();
        for (int i = 0; i < s.length(); i++) {
            alistsFinal.put(i, "");
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            alistsFinal.put(entry.getValue(),
                    alistsFinal.get(entry.getValue()) + entry.getKey());
        }
        // for (Map.Entry<Integer, String> entry : alistsFinal.entrySet()) {
        // if (entry.getValue() != "") {
        // ans += entry.getValue().repeat(entry.getKey());
        // }
        // }
        int n = alistsFinal.size() - 1;
        for (int i = 0; i < alistsFinal.size(); i++) {
            // System.err.println( alistsFinal.get(n-i));
            ans += alistsFinal.get(n - i).repeat(n - i);
            // !failing this test case called aaaccc it gives this cacaca but the actual
            //! output is aaaccc or cccaaa
        }
        System.out.println(ans);
        System.out.println(alistsFinal);

        // for (int i = 0; i < bucketList.size(); i++) {
        // if(!bucketList.get(i).isEmpty()){
        // ans+= bucketList.get(i).toArray(arg0 -> String.valueOf(arg0).repeat(i));
        // }
        // }
        // for (ArrayList<Character> aList : bucketList) {
        // if (aList.size() != 0) {
        // System.out.println(aList);
        // ans+=String.valueOf(aList.forEach(arg0 -> String.valueOf(arg0).repeat(0)))
        // }
        // }
        // System.out.println(bucketList);
        // Character chars[] = (Character[])s.toCharArray();
        // String chars[] = new String[s.length()];
        // for (int i = 0; i < s.length(); i++) {
        // chars[i] = s.substring(i, i + 1);
        // }
        // System.err.println(Arrays.toString(chars));
        // Comparator<Integer> c = new Comparator<Integer>() {
        // public int compare(Integer arg0, Integer arg1) {
        // return chars[arg0].compareTo(chars[arg1]);
        // }
        // };
        // Arrays.sort(chars, c);

        // HashMap<Character, Integer> map = new LinkedHashMap<>();
        // for (int i = 0; i < s.length(); i++) {
        // map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        // }
        // map.entrySet().stream()//.sorted(Map.Entry.comparingByValue())
        // .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a1, a2) ->
        // a1,
        // LinkedHashMap::new));
        // map = map.entrySet()
        // .stream()
        // .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) // or
        // comparingByValue().reversed() for
        // // descending
        // .collect(Collectors.toMap(
        // Map.Entry::getKey,
        // Map.Entry::getValue,
        // (oldValue, newValue) -> oldValue, // Merge function for duplicate keys (if
        // any)
        // LinkedHashMap::new // Preserve insertion order for sorted elements
        // ));
        // System.out.println(map);
        // ArrayList<Pair> list = new ArrayList<>();
        // for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        // list.add(new Pair(entry.getKey(), entry.getValue()));
        // }
        // ArrayList<Map<Character,Integer>> list2 = new ArrayList<>();
        // // for (Map.Entry<Character,Integer> entry : map.entrySet()) {
        // // list2.add();
        // // }0
        // System.out.println(list);
        // list.sort((arg0, arg1) -> {
        // return arg1.cnt - arg0.cnt;
        // });
        // System.out.println(list);

        // Arrays.sort(chars);

        // System.out.println(map);
        // map = map.entrySet()
        // .stream()
        // .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
        // .collect(Collectors.toMap(arg0 -> arg0.getKey(),
        // arg0 -> arg0.getValue(), (arg0, arg1) -> arg0, LinkedHashMap::new));
        // String ans = "";
        // for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        // ans += String.valueOf(entry.getKey()).repeat(entry.getValue());
        // }
        // System.err.println(ans);
        // System.out.println(map);
        // List<Map.Entry<Character ,Integer> list = new Entry<Character,Integer>() {

        // };
        // Collections.sort(new List<Map.Entry<Character, Integer>> map);
        // PriorityQueue<Map.Entry<Character, Integer>> queue = new PriorityQueue<>(
        // (arg0, arg1) -> arg1.getValue() - arg0.getValue());
        // for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        // queue.add(entry);

        // }
        // System.out.println(queue);
        // String ans = "";
        // for (Map.Entry<Character, Integer> entry : queue) {
        // ans += String.valueOf(entry.getKey()).repeat(entry.getValue());
        // }
        // System.out.println(ans);
        // // sa();
        // }
        // int al[] = new int[122];
        // Arrays.fill(al, 0);
        // ArrayList<Pair> list = new ArrayList<>();

        // for (int i = 0; i < s.length(); i++) {
        // al[s.charAt(i)]++;

        // }
        // System.out.println(Arrays.toString(al));
        // map.entrySet()
        // .stream()
        // .sorted(Map.Entry.comparingByValue())
        // .collect(Collectors.toMap(
        // Map.Entry::getKey,
        // Map.Entry::getValue,
        // (e1, e2) -> e1, // merge function
        // LinkedHashMap::new // maintains insertion order
        // ));
        // Collections.sort(map.values());

        // System.err.println(map);

    }
}
