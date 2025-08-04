package daily.sun;

public class D2 {
    public static boolean findPrime(int a) {

        if (a < 3) {
            if (a == 2 || a == 3)
                return true;
            return false;
        }
        int i = 2;

        while (i <= Math.sqrt(a)) {
            if (a % i == 0) {

                return false;
            }
            i++;
        }

        return true;
    }

    public static void main(String[] args) {

        int N = 23;
        int primeCount = 0;
        while (N > 0) {
            if (findPrime(N)) {
                System.out.print(N + " ");
                primeCount += 1;
            }
            N -= 1;
        }
        System.out.println("Prime numbers: " + primeCount);
    }
}
