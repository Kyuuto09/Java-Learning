package playground.tasks.exam.someTasks;

import java.util.Arrays;

public class Matrix3x3 {

    public static int[][] solution(int[][] a, int[][] b) {

        int[][] result = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {
                result[i][j] += a[i][j] + b[i][j];
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] a = {
                {1, 2, 3}, //
                {4, 5, 6}, //
                {7}  //
        };

        int[][] b = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        int[][] result = solution(a, b);

        for (int[] row : result) {
            System.out.println(
                    Arrays.toString(row)
            );
        }

        System.out.println("Size of array: " + b.length);

    }
}