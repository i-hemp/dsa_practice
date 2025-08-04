package others.rage;

import java.util.*;

public class SnakeandPriest {
    public static String MOVEMENTS[] = { "RIGHT", "LEFT", "TOP", "BOTTOM" };
    public static String DIRECTIONS[] = { "WEST", "EAST", "NORTH", "SOUTH" };

    public static <K, V> void main(String[] args) {
        int matrixSize = 10;

        int a[][] = new int[matrixSize][matrixSize];
        boolean snakeKillableArea[][] = new boolean[matrixSize][matrixSize];
        HashMap<Integer, int[][]> map = new HashMap<>();
        map.put(1, new int[][] { { 1, 5 }, { 1, 8 } });
        map.put(2, new int[][] { { 7, 4 }, { 7, 7 } });
        map.put(3, new int[][] { { 2, 10 }, { 4, 10 } });
        map.put(4, new int[][] { { 4, 2 }, { 2, 2 } });
        // map.put(1, new int[][]{ { 1, 5 }, { 1, 8 } });
        int snakeCount = 4;
        // for (int i = 0; i < snakeCount; i++) {
        // int coord[][] = { { 1, 5 }, { 1, 8 } };
        for (Map.Entry<Integer, int[][]> entry : map.entrySet()) {

            // coord[0][0] = 0;
            // coord[0][1] = 4;
            // coord[1][0] = 0;
            // coord[1][1] = 7;
            snakeKillableArea = fillSnakes(snakeKillableArea, map.get(entry.getKey()), matrixSize);
            printAreaOfSnake(snakeKillableArea);
            // int movement = findMovementOfSnake(map.get(entry.getKey()));

        }
        // Snake1 1,5 1,8

        // Snake2 7,4 7,7
        // Snake3 2,10 4,10
        // Snake4 4,2 2,2

        // W2
    }

    private static boolean[][] fillSnakes(boolean[][] snakeKillableArea, int[][] coord, int matrixSize) {
        int x = coord[0][0] - 1;
        int y = coord[0][1] - 1;
        int a = coord[1][0] - 1;
        int b = coord[1][1] - 1;
        System.out.printf("\n\t%d %d %d %d \n", x, y, a, b);
        if (x == a && y <= b) {

            // for (int i = ; i < matrixSize; i++) {
            for (int j = y; j <= b; j++) {
                snakeKillableArea[x][j] = true;
            }
            // }
        }
        if (x == a && y >= b) {
            for (int j = b; j < y; j++) {
                snakeKillableArea[x][j] = true;
            }
        }
        if (x >= a && y == b) {
            // System.out.println("ifb\n");

            // for (int i = ; i < matrixSize; i++) {
            for (int j = a; j <= x; j++) {
                snakeKillableArea[j][y] = true;
            }
            // }
        }
        if (x <= a && y == b) {
            // System.out.println("ifb\n");
            for (int j = x; j <= a; j++) {
                snakeKillableArea[j][y] = true;
            }
        }

        return snakeKillableArea;
    }

    private static int findMovementOfSnake(int[][] coord) {

        return 0;

    }

    private static void printAreaOfSnake(boolean a[][]) {
        System.err.println();
        System.out.print("  ");
        for (int i = 0; i <= 9; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        int idx = 0;
        for (int i = 0; i < a.length; i++) {
            // if (i > 0)
            System.out.print(idx++ + " ");
            for (int j = 0; j < a.length; j++) {
                System.out.print(!a[i][j] ? "᫅ " : "0 ");
            }
            System.out.println();
        }
        System.err.println();
        // System.out.println("\n" + Arrays.deepToString(a) + "\n");
    }
}
