package playground.tasks.quizTwo.plateu;

import java.util.Arrays;

public class main {

    public static int[] solutionPlateau(int[] arr) {

        // Always protect the machine from empty or null data before turning it on.
        if (arr == null || arr.length == 0) {
            return new int[]{0, 0};
        }

        // The Champion Buckets
        int maxVal = arr[0];
        int maxLen = 1;

        // The Current Streak Buckets
        int currentVal = arr[0];
        int currentLen = 1;

        for (int i = 1; i < arr.length; i++) {

            // RULE 1: The floor is flat (They match)
            if (arr[i] == arr[i-1]) {
                currentLen++; // Take a step on the plateau

                // Immediately check if we beat the high score
                if (currentLen > maxLen) {
                    maxLen = currentLen;
                    maxVal = arr[i];
                }
            }
            // RULE 2: We hit a wall (They are different)
            else {
                // The streak is broken. Hit the reset button.
                currentLen = 1;
                currentVal = arr[i];
            }
        }

        return new int[]{maxVal, maxLen};
    }

    public static void main(String args[]) {
        int[] arr = {1, 1, 2, 3, 3, 3, 3, 4, 4};
        System.out.println("Plateau [Value, Length]: " + Arrays.toString(solutionPlateau(arr)));
    }
}