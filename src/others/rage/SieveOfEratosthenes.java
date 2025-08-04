package others.rage;

import java.util.ArrayList;
import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 1000;
        boolean primeArr[] = primes(n);
        // System.out.println(nums);
    }

    public static void prints(boolean[] primeArr) {
        for (int i = 2; i < primeArr.length; i++) {
            if (i % 6 == 0)
                System.out.println();
            if (i == 2)
                System.out.print("                ");

            System.out.printf("  %3d-%d ", i, primeArr[i] ? 1 : 0);

        }
        System.out.println();
    }

    public static boolean[] primes(int n) {

        ArrayList<Integer> res = new ArrayList<>();
        boolean primeArr[] = new boolean[n + 1];
        Arrays.fill(primeArr, true);
        // int cnt=
        for (int i = 2; i < Math.sqrt(primeArr.length); i++) {// for(int i=2;i*i<=n;i++)

            if (primeArr[i] == true) {
                int j = i * i;
                while (j < primeArr.length) {
                    primeArr[j] = false;
                    j += i;
                }
                // break;
            }
            // prints(primeArr);
        }
        for (int i = 2; i < primeArr.length; i++) {
            if (primeArr[i] == true)
                System.out.print(i+" ");
        }
        return primeArr;
    }
}
