package playground.tasks.quizTwo.getRangeStartToEnd;

import java.util.Arrays;

public class main {

    public static int[] getRange(int[] arr, int start, int end) {

        int[] newArr = new int[end-start]; // 3
        int index = 0;

        for (int i = start; i < end; i++) { // 1, 3
            newArr[index++] = arr[i];  // at 0 place
        }

        return newArr;
    }

    public static void main(String args[]) {

        int[] arr = {10, 20, 30, 40, 50}; // 1, 4 : 20, 30, 40

        System.out.println(Arrays.toString(getRange(arr, 1, 4)));
    }
}