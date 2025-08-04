package daily.mon30.pack1;

import java.util.ArrayList;
import java.util.List;

public class P1 {
    public static void main(String[] args) {

        List<List> Mixed = new ArrayList<List>();

        ArrayList<String> lststr = new ArrayList<String>();
        ArrayList<Integer> lstint = new ArrayList<Integer>();
        lststr.add("John");
        lststr.add("Kim");
        lststr.add("Peter");
        lststr.add("Steve");

        lstint.add(100);
        lstint.add(200);
        lstint.add(300);
        lstint.add(400);

        Mixed.add(lststr);
        Mixed.add(lstint);

        System.out.println(Mixed);
    }
}
