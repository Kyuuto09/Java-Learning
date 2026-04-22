package playground.tasks.quizTwo.reverseByK;

import java.util.Arrays;

public class main {

    public static int[] reverseArr(int[] arr, int start, int end) {
        while (start < end) { // 5 < 4
            int temp = arr[start]; // = 1

            arr[start] = arr[end]; //  2
            arr[end] = temp;

            start++;
            end--;
        }

        return arr;
    }

    public static int[] solution(int[] arr, int k) {

        // Defensive programming
        if (arr == null || arr.length <= 1) {
            return arr;
        }

        // Normalize k
        k = k % arr.length;

        if (k == 0) {
            return arr;
        }


        // 1. just reverse the entire array 1, 2, 3, 4, 5 -> 5, 4, 3...
        arr = reverseArr(arr, 0, arr.length - 1);

        // 2. reverse the first k elements from 0 to k-1
        arr = reverseArr(arr, 0, k - 1); // 0, k = 2 - 1 = 1

        // 3. reverse the rest of the array from k to the end.
        arr = reverseArr(arr, k, arr.length - 1);

        return arr;
    }

    public static void main(String args[]) {

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(solution(arr, 2)));
    }
}