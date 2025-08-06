package d2;

public class D8 {
    public static void main(String[] args) {
        String num = "1332097";
        int val = Integer.parseInt(num);
        if (val % 10 != 0 && (val % 10) % 2 != 0) {
            // return num;
            System.out.println(num);
            return;
        }
        int maxi = -1;
        while (val > 0) {
            int r = val % 10;
            if (r % 2 != 0)
                maxi = Math.max(maxi, r);
            val = val / 10;
        }
        // System.out.println(maxi);
        // while (condition) {
        if (maxi == -1) {
            System.out.println("");
            // return "";';'
            return;

        }
        System.out.println(maxi);
        // return String.valueOf(maxi);
        // }
    }
}
