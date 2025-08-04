package daily.mon30;

import java.util.ArrayList;

public class Spiral2 {
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = new int[n][n];

        int number = 1;
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        ArrayList<String> powerPoints = new ArrayList<>();
        powerPoints.add("(" + 0 + "," + 0 + ")");
        while (top <= bottom && left <= right) {
            for (int col = left; col <= right; col++) {// for(left->right)
                matrix[top][col] = number++;
            }
            top++;

            for (int row = top; row <= bottom; row++) {
                matrix[row][right] = number++;
            }
            right--;

            for (int col = right; col >= left; col--) {
                matrix[bottom][col] = number++;
            }
            bottom--;
            for (int row = bottom; row >= top; row--) {
                matrix[row][left] = number++;
            }
            left++;
        }

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%2d ", value);
            }
            System.out.println();

        }

    }

}
