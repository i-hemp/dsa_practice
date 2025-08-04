package daily.mon30;

public class D3 {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3, 4, 5 }

                , { 16, 17, 18, 19, 6 }

                , { 15, 24, 25, 20, 7 }

                , { 14, 23, 22, 21, 8 }

                , { 13, 12, 11, 10, 9 } };

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(String.format("%2d ", a[i][j]));
            }
            System.out.println();
        }
    }
}
