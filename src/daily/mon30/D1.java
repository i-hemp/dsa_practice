package daily.mon30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.apache.commons.lang3.StringUtils;

public class D1 {

    public static void main(String[] args) {
        Integer a[] = new Integer[10];

        for (int i = 0; i <= 10; i++) {
            a[i] = i + 1;
        }
        StringUtils s = new StringUtils();

        HashMap<Integer, Integer> h = new HashMap<>();
        System.out.println(h);
        System.out.println();
        Arrays.stream(a).forEach(arg0 -> {

        });
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(a));
        System.err.println(list);
    }
}
