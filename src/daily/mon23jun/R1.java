package daily.mon23jun;

public class R1 {
    public static int checkPrime(int max) {

        if (max < 1)
            return 0;
        if (max == 2 || max == 3 || max == 5)
            return max;
        else {

            while (max > 1) {
                boolean flag = false;
                for (int i = 2; i < max - 1; i++) {
                    if (max % i == 0)
                        flag = true;
                }
                if (flag)
                    continue;
                System.out.println(max);
                max -= 1;
                // for (int each = max; each > 1; each-=1) {

                // for (int i = 2; i < Math.sqrt(max); i++) {
                // if (max % i == 0)
                // continue;
                // }
                // System.out.println(each);
                // return each;

                // }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;
        checkPrime(15);
        // for (int i = 0; i < a.length; i++) {
        // System.out.println(
        // (checkPrime(a[i]))

        // );

        // }
    }
}
