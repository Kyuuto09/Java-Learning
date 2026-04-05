package playground.tasks.quizOne.Arrays.palindrome;

import java.util.Arrays;

public class main {

    public static int findFirstPalindrome(int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            int reversed = 0;

            int backUpNumber = arr[i]; // 565
            int currentNum = arr[i]; // 565

            while (currentNum > 0) {
                int lastDigit = currentNum % 10; // 56

                reversed = (reversed * 10) + lastDigit; // 565

                currentNum /= 10;
            }

            if (reversed == backUpNumber) return reversed;
        }

        return -1;
    }

    public static void main(String args[]) {

        int[] arr = {10, 85, 1221, 565, 90};

        System.out.println(findFirstPalindrome(arr));
    }
}