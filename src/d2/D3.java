package d2;

public class D3 {
    private static String de(int mat[][], int n, int m, int target) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == target)
                    return String.valueOf(i + " " + j);
            }
        }
        return "-1";
    }

    public static void main(String[] args) {
        int target = 8,
                mat[][] = {

                        { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 },
                        { 19, 20, 21, 22 }
                };
        int n = 4;
        int m = 4;
        int max = (n * m);
        int low = 0;
        int high = max - 1;
        int mid = (low + high) / 2;
        // System.err.println(mid);
        System.out.println(de(mat, n, m, target));
    }
}
