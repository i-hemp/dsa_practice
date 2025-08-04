package daily.mon30;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
    public static void main(String[] args) {
        ArrayList<Integer> a = (ArrayList<Integer>) spiralOrder(new int[0][0]);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int size = matrix.length;
        // int[][] matrix = new int[size][size];

        int number = 1;
        int top = 0, bottom = size - 1;
        int left = 0, right = matrix[0].length - 1;

        ArrayList<Integer> aa = new ArrayList<>();

        while (top <= bottom && left <= right) {
            for (int col = left; col <= right; col++) {// for(left->right)
                aa.add(matrix[top][col]);

            }
            top++;

            for (int row = top; row <= bottom; row++) {
                aa.add(matrix[row][right]);// = number;

            }
            right--;

            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    aa.add(matrix[bottom][col]);
                }
                bottom--;
            }

            // Bottom to Top
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    aa.add(matrix[row][left]);
                }
                left++;
            }
        }

        return aa;
    }
}