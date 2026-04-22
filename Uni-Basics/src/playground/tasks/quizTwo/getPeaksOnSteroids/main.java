package playground.tasks.quizTwo.getPeaksOnSteroids;

import java.util.Arrays;

public class main {

    public static int[] getPeaks(int[] arr) {
        // 1. count
        int count = 0;

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                count++;
            }
        }

        // 2. create new arr by count
        int[] newArr = new int[count];

        // 3. place everything into a newArr
        int index = 0;

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                newArr[index++] = arr[i];
            }
        }

        return newArr;
    }

    public static void main(String args[]) {

        int[] arr = {1, 5, 2, 7, 4};  // 2

        System.out.println(Arrays.toString(getPeaks(arr)));
        //System.out.println(getPeaks(arr));
    }
}