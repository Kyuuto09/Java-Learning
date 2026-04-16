package playground.tasks.quizTwo.diffMaxAndMinTask7A;

import java.util.Arrays;

public class main {

    public static int solution(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int currentBox = arr[i];

            if (currentBox > max) { max = currentBox; }
            if (currentBox < min) { min = currentBox; }
        }

        return max - min;
    }

    public static void main(String args[]) {

        int arr[] = {10, 2, 8, 15}; // 15 - 2 = 13

        System.out.println(solution(arr));
    }
}
