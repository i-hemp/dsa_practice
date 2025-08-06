package d3;

public class D1 {
    public static void main(String[] args) {
        String num = "2246";//"354270";
        String res = me(num);
        System.out.println(res);

    }

    private static String me(String num) {
        char[] a = num.toCharArray();
        int i = a.length - 1;
        int x = -1;

        while (i >= 0) {
            x = a[i] - '0';
            if (x % 2 != 0 && x!=0) {
                return num.substring(0, i + 1);
                // System.out.print(a[i]+" ");
                
            }
            i--;
        }

        return new String();
    }
}
