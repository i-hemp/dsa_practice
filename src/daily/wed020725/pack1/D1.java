package daily.wed020725.pack1;

public class D1 {
    public static void main(String[] args) {
        int res = aad(5);
        
        System.out.println(res);
    }

    private static int aad(int n) {
        if (n <= 0)
            return 0;
        return n + aad(n - 1);
    }
}
