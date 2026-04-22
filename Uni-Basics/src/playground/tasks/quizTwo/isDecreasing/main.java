package playground.tasks.quizTwo.isDecreasing;

import java.util.Arrays;

public class main {

    public static boolean task2(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i+1] >= arr[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {

        int[] arr = {11, 11, 10, 8, 2};

        System.out.println(task2(arr));
    }
}