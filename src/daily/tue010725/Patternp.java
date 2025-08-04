package daily.tue010725;

public class Patternp {

    /*
     * 
     * 4 4 4 4 4 4 4
     * 4 3 3 3 3 3 4
     * 4 3 2 2 2 3 4
     * 4 3 2 1 2 3 4
     * 4 3 2 2 2 3 4
     * 4 3 3 3 3 3 4
     * 4 4 4 4 4 4 4
     * 
     * 
     */
    public static void main(String[] args) {
        int n = 4;
        p1(n);
    }

    private static void p1(int n) {

        int size = 2 * n - 1; // Total size of the square matrix

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Find the minimum distance to any edge
                System.out.print(i + " " + j + " " + (size - 1 - i) + " " + (size - 1 - j) + " | ");
                int min = Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));
                // System.out.print((n - min) + " ");
            }
            System.out.println();
        }
    }

}
