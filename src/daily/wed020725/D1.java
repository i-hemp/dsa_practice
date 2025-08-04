package daily.wed020725;

import java.util.Arrays;

public class D1 {
    public static void main(String[] args) {
        String s = "Aute ullamco consequat deserunt magna ullamco sunt enim anim Nulla non veniam cupidatat esse excepteur do laborum Sit laboris veniam pariatur pariatur in reprehenderit eiusmod"
                .toLowerCase();
        String a[] = s.split(" ");
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int low = 0, high = a.length - 1;
        System.out.println("LOw : "+low+" High ; "+high);
        while (low <= high) {
            int mid = (low + high) / 2;
            System.out.print(mid+ " ||| ");
            int x = a[mid].compareTo("in");
            System.out.println(x);
            if (x == 0) {
                System.err.println("Found at : " + mid);
                break;
            } else if (x < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }


        }
    }
}
