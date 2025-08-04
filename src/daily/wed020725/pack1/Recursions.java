package daily.wed020725.pack1;

import org.apache.commons.lang3.SystemUtils;

@SuppressWarnings("unused")
public class Recursions {

    private static int aad(int n) {
        if (n <= 0)
            return 0;
        return n + aad(n - 1);
    }

    public static boolean isPali(String s, int l, int r) {
        if (l >= r)
            return true;
        return (s.charAt(l) == s.charAt(r)) && isPali(s, ++l, --r);
    }

    public static int pows(int base, int n) {
        if (n < 1)
            return 1;
        return base * pows(base, n - 1);
    }

    public static void main(String[] args) {
        // String s = "maadAam";
        // boolean res = isPali(s.toLowerCase(), 0, (s.length() - 1));
        // System.err.println("Pali check : " + res);
        // int res = pows(2, 3);
        // System.out.println(res);
        // printDesOrder(10);
        // int a[] = { 1, 2, 3, 4, 5, 6 };
        // printDesOrder(a, a.length - 1);
        // int a = 0;
        // int b = 1;
        // int c = 1;
        // System.out.println(a + " " + b);
        // for (int i = 0; i < 25; i++) {
        // System.out.print(a + " ");
        // int nextTerm = a + b + c;
        // a = b;
        // b = c;
        // c = nextTerm;
        // }
        // System.out.println();
        // for (int i = 0; i < 27; i++) {
        // System.out.print(fib(i) + " ");
        // }
        System.out.println();
        // boolean res = tre(513);
        // System.out.println(res);
        // System.out.println(fact(90));
        // long sum = 1;
        // for (int i = 2; i <= 30; i++) {
        // sum = sum * i;
        // }
        // System.out.println(sum);
        // System.out.println(trailingZeroes(20));
        System.out.println();
        // System.err.println(
        doi(7);
    }
    static int numSquareSumTWo(int n)
{
    int squareSum = 0;
    while (n!= 0)
    {
        squareSum += (n % 10) * (n % 10);
        n /= 10;
    }
    return squareSum;
}
 
//  method return true if n is Happy number
static boolean isHappynumberTWo(int n)
{
    int slow, fast;
 
    //  initialize slow and fast by n
    slow = fast = n;
    do
    {
        //  move slow number
        // by one iteration
        slow = numSquareSumTWo(slow);
 
        //  move fast number
        // by two iteration
        fast = numSquareSumTWo(numSquareSumTWo(fast));
 
    }
    while (slow != fast);
 
    //  if both number meet at 1,
    // then return true
    return (slow == 1);
}
 
 static boolean isHappynumber(int n)
    {
        int sum = n, x = n;

        // this loop executes till the sum of square of
        // digits obtained is not a single digit number
        while (sum > 9) {
            sum = 0;

            // this loop finds the sum of square of digits
            while (x > 0) {
                int d = x % 10;
                sum += d * d;
                x /= 10;
            }
            x = sum;
        }
        if (sum == 1 || sum == 7)
            return true;
        return false;
    }
    private static void doi(int i) {
        int sum = 0;
        for (int j = 0; j < 20; j++) {
            int r = i % 10;
            sum += r * r;
            System.out.print(sum + " ");
        }
    }

    public static boolean isHappy(int n) {
        int sum = 0;
        if (n < 9) {
            if (n == 1)
                return true;
            else
                return false;
        }
        while (n > 0) {
            int r = n % 10;
            sum = sum + r * r;
            n /= 10;
        }
        System.out.println(sum);

        return isHappy(sum);
    }
    // public int addDigits(int num) { O(1)
    // TIMECOMPLEXITY!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // if(num==0)
    // {
    // return 0;
    // happynumber
    // int num=0;
    // while(num==1){

    // while(n>0){
    // num=num*10+(num%10)
    // }
    // }
    // eds
    // }
    // return (num%9==0) ? 9: num%9;
    // }
    private static int helpBase(int n, int k) {
        int sum = 0;
        String val = "";
        while (n > 0) {
            sum = (n % k) + sum * 10;
            val = (n % k) + val;
            n = n / k;
        }
        System.out.println("sum" + sum);
        System.out.println(val);
        return sum;
    }

    public static int addDigits(int num) {
        if (num / 10 == 0)
            return num;
        int s = 0;
        while (num != 0) {
            s += num % 10;
            num = num / 10;
        }
        num = s;
        return addDigits(num);
    }

    public static int trailingZeroes(int n) {

        // if(n<=0)return false;
        // int copyn=n;
        int mul = 5, sum = 0;

        while (n / mul != 0) {
            // (n/5);
            sum += (n / mul);
            mul *= 5;
        }
        return sum;
    }

    private static int fact(int n) {

        if (n < 1)
            return 1;
        return n * fib(n - 1);
    }

    public static boolean tre(int n) {
        return false || (powerOfTwo(n) % 2 == 0);

    }

    public static int powerOfTwo(int n) {
        System.out.print(n + " ");
        if (n == 0)
            return 0;
        return powerOfTwo(n / 2);
    }

    public static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    private static void printDesOrder(int[] a, int i) {
        if (i < 0) {
            return;
        }
        System.out.print(a[i] + " ");
        printDesOrder(a, i - 1);
    }

    private static void printDesOrder(int i) {
        if (i < 1)
            return;
        System.out.print(i + " ");
        printDesOrder(i - 1);
    }
}
