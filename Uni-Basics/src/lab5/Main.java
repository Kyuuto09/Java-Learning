package lab5;

import java.util.Arrays;

public class Main {

    // sort
    public static int[] sortArray(int[] positiveArray) {

        int counter = 0;

        for (int i = 0; i < positiveArray.length; i++) {
            if (positiveArray[i] != 0) {
                counter++;
            }
        }
        int[] sortedArr = new int[counter];

        for (int j = 0, k = 1; j < positiveArray.length; j++) {
            if (positiveArray[j] > positiveArray[k]) sortedArr[j] = positiveArray[k];
            j++;
            counter++;
        }

        return sortedArr;
    }

    public static int[] positiveArrayNum(int[] arr) {

        int[] positiveArr = new int[arr.length];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                positiveArr[j] = arr[i];
                j++;
            }
        }


        return sortArray(positiveArr);
    }

    public static void main(String[] args) {
        int[] arr = {9, 4, -4, -3, 10};

        System.out.println(Arrays.toString(positiveArrayNum(arr)));
    }
}