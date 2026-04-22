package playground.tasks.quizTwo.removeDuplicate;

import java.util.Arrays;

public class main {

    public static int[] solution(int[] arr) {

        if (arr.length == 0) { return new int[0]; } // FILTER

        int counter = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) {
                counter++;
            }
        }

        int[] newArr = new int[counter];
        newArr[0] = arr[0];

        int index = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) {
                newArr[index++] = arr[i];
            }
        }

        return newArr;
    }

    public static void main(String args[]) {

        int[] arr = {10, 20, 20, 30, 30, 40, 40}; // 10, 20, 30, 40

        System.out.println(Arrays.toString(solution(arr)));
    }
}