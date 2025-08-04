package daily.mon30;

import java.util.ArrayList;

public class SpiralMatrixSimplified {
    public static void main(String[] args) {
        int size = 5;
        int[][] matrix = new int[size][size];

        int number = 1;
        int top = 0, bottom = size - 1;
        int left = 0, right = size - 1;

        ArrayList<String> powerPoints = new ArrayList<>();
        powerPoints.add("(" + 0 + "," + 0 + ")");
        while (top <= bottom && left <= right) {
            for (int col = left; col <= right; col++) {// for(left->right)
                matrix[top][col] = number++;
                if (number % 11 == 0)
                    powerPoints.add("(" + top + "," + col + ")");
                // number++;
            }
            top++;

            for (int row = top; row <= bottom; row++) {
                matrix[row][right] = number;
                if (number % 11 == 0)
                    powerPoints.add("(" + row + "," + right + ")");
                number++;
            }
            right--;

            for (int col = right; col >= left; col--) {
                matrix[bottom][col] = number;
                if (number % 11 == 0)
                    powerPoints.add("(" + bottom + "," + col + ")");
                number++;
            }
            bottom--;
            for (int row = bottom; row >= top; row--) {
                matrix[row][left] = number;
                if (number % 11 == 0)
                    powerPoints.add("(" + row + "," + left + ")");
                number++;
            }
            left++;
        }

        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%2d ", val);
            }
            System.out.println();
        }

        System.out.println("Total Power Points: " + powerPoints.size());
        for (String point : powerPoints) {
            System.out.println(point);
        }
    }
}
