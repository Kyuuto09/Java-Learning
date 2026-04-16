package playground.tasks.quizTwo.sumOfAllTask3A;

import java.util.Arrays;

public class main {

    public static double solution(int[] arr) {
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String args[]) {

        int arr[] = {10, 1, 2, 3, 5}; // 21

        System.out.println(solution(arr));
    }
}