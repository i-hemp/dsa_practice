package svct.dailytests;

import java.util.ArrayList;

import others.rage.SieveOfEratosthenes;

public class D3 {
    public static void main(String[] args) {
        SieveOfEratosthenes s = new SieveOfEratosthenes();

        int n = 98;
        int k = 2;
        boolean primeArr[] = SieveOfEratosthenes.primes(n);
        System.out.println();
        int cnt = 0;
        while (cnt < k - 1) {
            ++n;
            System.out.print("Checking : " + n + " ");
            int x = sumOfDigit(n);
            // System.out.println(" " + x + " ");
            if (primeArr[x]) {
                cnt++;
            }
            System.out.print(cnt + " \n");
        }
        System.err.println(n);
    }

    private static int sumOfDigit(int i) {
        int sum = 0;
        while (i > 0) {
            sum += (i % 10);
            i /= 10;
        }
        System.out.println(sum);
        return sum;
    }
}
