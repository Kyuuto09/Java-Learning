package playground.tasks.quizTwo.smallestGapTask7C;

import java.util.Arrays;

public class main {

    public static int solution(int[] arr) {
        int smallestGap = arr[0] - arr[1]; // = 3

        if (smallestGap < 0) { smallestGap *= -1; } // Math ABS

        for (int i = 0; i < arr.length - 1; i++) {
            int currentGap = arr[i] - arr[i+1];

            if (currentGap < 0) { currentGap *= -1; } // Math ABS

            if (currentGap < smallestGap) {
                smallestGap = currentGap;
            }
        }

        return smallestGap;
    }

    public static void main(String args[]) {

        int arr[] = {10, 15, 12, 20}; // smallest gap: 3

        System.out.println(solution(arr));
    }
}