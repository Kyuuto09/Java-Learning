package playground.tasks.quizTwo;

import java.util.Arrays;

public class findMaxInArray {

    public static int maxArray(int[] arr) {
        int maxElem = arr[0];

        for (int i = 1; i < arr.length; i++) { // 8 1 2

            if (arr[i] > maxElem) {
                maxElem = arr[i];
            }
        }

        return maxElem;
    }

    public static void main(String args[]) {

        int arr[] = {8, 1, 2, 12, 3, 4, 5, 6, 7};

        System.out.println(maxArray(arr));
    }
}