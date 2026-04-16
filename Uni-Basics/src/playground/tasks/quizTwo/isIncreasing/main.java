package playground.tasks.quizTwo.isIncreasing;

import java.util.Arrays;

public class main {

    public static boolean solution(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i+1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {

        int arr[] = {1, 2, 3, 4, 5, 1};

        System.out.println(solution(arr));
    }
}