package playground.tasks.quizTwo.sumOfGapsTask7B;

import java.util.Arrays;

public class  main {

    public static int solution(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int gap = arr[i] - arr[i+1];

            if (gap < 0) { gap *= -1; }

            sum += gap;
        }

        return sum;
    }

    public static void main(String args[]) {

        int arr[] = {2, 4, 1, 5}; // total gap: 9

        System.out.println(solution(arr));
    }
}
