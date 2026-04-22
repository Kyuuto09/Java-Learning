package playground.tasks.quizTwo.evenNumbersTask6C;

import java.util.Arrays;

public class main {

    public static int[] solution(int[] arr) {
        int sizeOfArray = 0;

        for (int element : arr) {

            if (element % 2 == 0) {
                sizeOfArray++;
            }
        }

        int[] evenArray = new int[sizeOfArray];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenArray[index++] = arr[i];
            }
        }

        return evenArray;
    }

    public static void main(String args[]) {

        int arr[] = {1, 2, 3, 4, 5, 6};

        System.out.println(Arrays.toString(solution(arr)));
    }
}