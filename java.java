public static boolean hasSubarraySum(int[] arr, int targetSum) {
    // DEFENSIVE GUARD CLAUSE
    if (arr == null || arr.length == 0 || targetSum < 0) {
        return false;
    }

    int currentSum = 0;
    int start = 0; // The left side of the window

    // The "end" pointer is the right side of the window expanding forward
    for (int end = 0; end < arr.length; end++) {
        currentSum += arr[end]; // Add the new box to our window

        // THE SHRINKING LOOP:
        // If the window gets too heavy, shrink it from the left until it's light enough
        while (currentSum > targetSum && start <= end) {
            currentSum -= arr[start]; // Subtract the left-most box from the sum
            start++; // Move the left side of the window forward
        }

        // THE ALARM: Did we hit the exact target?
        if (currentSum == targetSum) {
            return true;
        }
    }

    // We searched the whole array and never hit the exact target
    return false;
}