package playground.tasks.quizOne.Arrays.findClosestPair;

import java.util.Arrays;

public class main {

    public static int[] findClosestPair(int[] arr) {

        int firstElem = arr[0];
        int secondElem = arr[1];
        int difference = firstElem - secondElem;

        if (difference < 0) difference *= -1;

        for (int i = 0; i < arr.length-1; i++) {

            int currentDifference = arr[i] - arr[i + 1];

            if (currentDifference < 0) currentDifference *= -1;

            if (currentDifference <= difference) {
                difference = currentDifference;

                firstElem = arr[i];
                secondElem = arr[i + 1];
            }

        }

        int[] closestPairArr = {firstElem, secondElem};

        return closestPairArr;
    }

    public static void main(String args[]) {
        int[] arr = {10, 50, 52, 20};

        System.out.println(Arrays.toString(findClosestPair(arr)));
    }
}