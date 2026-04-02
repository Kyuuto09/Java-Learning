package playground;

import java.util.Arrays;

public class arrays {

    public static int[] cleanArray(int[] nums) {
        // helper
        int numsLength = nums.length - 1;

        int arraySize = 0;

        for (int i = 0; i <= numsLength; i++) {
            if (nums[i] >= 1) {
                arraySize++;
            }
        }

        int[] cleanedArr = new int[arraySize];

        int cleanedArrLength = cleanedArr.length - 1;
        int currentLow = 0;
        for (int i = 0; i <= cleanedArrLength; i++) {
            currentLow = i; // 0

            for (int j = i; j <= cleanedArrLength; j++) {
                if (nums[j] < nums[currentLow]) {
                    currentLow = j; // 1
                }
            }

            // The Three-Cup Trick (Swap) using a single integer, not an array
            int temp = cleanedArr[i];               // Step 1: Safe house
            cleanedArr[i] = cleanedArr[currentLow]; // Step 2: The Move
            cleanedArr[currentLow] = temp;          // Step 3: Final Placement
        }
        // {3, 1, 3, 4, 10, 5};
        return cleanedArr;
    }

    public static int[] positiveArray(int[] nums) {
        int[] positiveNumbers = new int[nums.length];

        for (int i = 0, j = 0; i <= nums.length - 1; i++) {
            if (nums[i] > 0) {
                positiveNumbers[j] = nums[i];

                j++;
            }
        }

        return cleanArray(positiveNumbers);
    }

    static void main(String[] args) {
        int[] numbers = {3, 1, 3, -2, 4, 10, -3, 5};

        System.out.println(Arrays.toString(positiveArray(numbers)));

    }
}
