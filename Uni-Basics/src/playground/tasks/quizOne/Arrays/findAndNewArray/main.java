package playground.tasks.quizOne.Arrays.findAndNewArray;

import java.util.Arrays;

public class main {

    public static int[] solution(int[] arr) {
        int counter = 0;

        // discover size
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                counter++;
            }
        }

        // new array with the appropriate size
        int[] newArr = new int[counter];
        int arrIndex = 0;
                            // 8 times
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                newArr[arrIndex] = arr[i];
                arrIndex++;
            }
        }

        return newArr;
    }

    static void main(String[] args) {
        int[] arr = {2, 4, 5, 3, 10, 3, 6, 8, 5}; // 10, 2, 4, 0

        System.out.println(Arrays.toString(solution(arr)));
    }
}
