package daily.mon30;

import java.util.ArrayList;

public class SpiralMatrixWithPowerPoints {
    public static void main(String[] args) {
        int n = 7;
        int[][] matrix = new int[n][n];

        int topRow = 0;
        int bottomRow = n - 1;
        int leftCol = 0;
        int rightCol = n - 1;

        int currentNumber = 1;
        int totalElements = n * n;

        int powerPointCount = 0;
        ArrayList<Integer> powerPointCoordinates = new ArrayList<>();

        // Optional starting point
        powerPointCoordinates.add(0);
        powerPointCoordinates.add(0);

        while (leftCol < rightCol && topRow < bottomRow) {
            // 1. Left to Right
            for (int col = leftCol; col <= rightCol && currentNumber <= totalElements; col++) {
                matrix[topRow][col] = currentNumber;
                if (currentNumber % 11 == 0) {
                    powerPointCount++;
                    powerPointCoordinates.add(topRow);
                    powerPointCoordinates.add(col);
                }
                currentNumber++;
            }
            topRow++;
            print(matrix);

            // 2. Top to Bottom
            for (int row = topRow; row <= bottomRow && currentNumber <= totalElements; row++) {
                matrix[row][rightCol] = currentNumber;
                if (currentNumber % 11 == 0) {
                    powerPointCount++;
                    powerPointCoordinates.add(row);
                    powerPointCoordinates.add(rightCol);
                }
                currentNumber++;
            }
            rightCol--;
            print(matrix);

            // 3. Right to Left
            for (int col = rightCol; col >= leftCol && currentNumber <= totalElements; col--) {
                matrix[bottomRow][col] = currentNumber;
                if (currentNumber % 11 == 0) {
                    powerPointCount++;
                    powerPointCoordinates.add(bottomRow);
                    powerPointCoordinates.add(col);
                }
                currentNumber++;
            }
            bottomRow--;
            print(matrix);

            // 4. Bottom to Top
            for (int row = bottomRow; row >= topRow && currentNumber <= totalElements; row--) {
                matrix[row][leftCol] = currentNumber;
                if (currentNumber % 11 == 0) {
                    powerPointCount++;
                    powerPointCoordinates.add(row);
                    powerPointCoordinates.add(leftCol);
                }
                currentNumber++;
            }
            leftCol++;
            print(matrix);

        }

        print(matrix);

        // Print power point details
        System.out.println("Total Power points: " + powerPointCount);
        for (int i = 0; i < powerPointCoordinates.size(); i += 2) {
            System.out.println("(" + powerPointCoordinates.get(i) + "," + powerPointCoordinates.get(i + 1) + ")");
        }
    }

    public static void print(int[][] matrix) {
        // Print the final matrix
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%2d ", value);
            }
            System.out.println();

        }

        System.out.println();
        System.out.println();
    }

}
