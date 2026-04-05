package playground.tasks.quizOne.Arrays.transformToDigitSums;

import java.util.Arrays;

public class main {

    public static int[] transformToDigitSums(int[] arr) {
        int[] newArr = new int[arr.length];


        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            int elem = arr[i];

            while (elem > 0) {
                int lastDigit = elem % 10;

                sum += lastDigit;

                elem /= 10;
            }
            newArr[i] = sum;
        }

        return newArr;
    }

    public static void main(String args[]) {

        int[] arr = {15, 204, 7};

        System.out.println(Arrays.toString(transformToDigitSums(arr)));
    }
}