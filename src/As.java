public class As {
    public static void main(String[] args) {
        int n1 = 2, count = 1;
        int n2 = 12, x = 50;
        int diff = n2 - n1;
        int c1 = x;
        int c2 = 0, c = 0;
        while (c1 >= c2) {
            c1 += n1;
            c2 += n2;
            c += 1;
        }
        System.out.println(c);

        while (true) {
            if (diff * count > x) {
                break;
            }
            count++;
        }
        System.out.println(count);
    }

}