package daily.wed;

import java.util.Arrays;

//tcs nqt series
public class D4 {
    public static int fib(int n) {
        if (n == 1 || n == 0)
            return n;
        else
            return fib(n - 1) + fib(n - 2);
        // return f;

    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 1, 3, 2, 5, 3, 7, 5, 11, 8, 13, 13, 17 };
        // odd fibonnaci
        // even prime
        // 0 1 1 2 3 5 8 13 21 34
        if (a.length % 2 == 0) {
            findPrime((a.length / 2) + 1);
        } else
            System.out.println(fib(0));
    }

    private static int findPrime(int i) {
        int count=0,num=1;
      while (count<i) {
        if () {
            
        }
      }
      return num;
    }
}
