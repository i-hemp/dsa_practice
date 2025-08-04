package others.rage;

import java.util.Arrays;
import java.util.HashSet;

public class Page {
    public static void main(String[] args) {
        int pages = 5;
        // String str  "5\n
        //                 2 4\n
        //              1\n
        //                 1 5\n
        //                 2 3\n
        //              5\n
        //                 2 3"
        
        int input[][] = {
                { 2, 4 },
                { 1 },
                { 1, 5 },
                { 2, 3 },
                { 5 } };
        int frompage = 2;
        int topage = 3;
        System.out.println(Arrays.deepToString(input));
        int res = me(input, frompage, topage);
        System.out.println(res);
        // for(int i=0;i<pages;i++){
        // // for (int j = 0; j < 10; j++) {
        // input[i][j]=s.nexInt();
        // // }
        // }

    }

    private static int me(int[][] input, int frompage, int topage) {
        HashSet<Integer> set = new HashSet<>();

        int count = 0;
        // while (frompage == topage) {
        // // int res = check(set, input, frompage, topage, count);

        // }
        return -1;
    }

    private static int check(HashSet<Integer> set, int[][] input, int frompage, int topage, int count) {

        for (int i = 0; i < input[frompage - 1].length; i++) {
            int page = input[frompage - 1][i];
            if (!set.contains(page) && page != 0) {
                set.add(page);
                check(set, input, page, topage, count);
                if (page == topage) {
                    System.out.println("FOUND : " + count);
                }
                return count;
            }
        }
        return -1;

    }
}
