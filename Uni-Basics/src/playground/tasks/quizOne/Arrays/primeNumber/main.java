package playground.tasks.quizOne.Arrays.primeNumber;

import java.util.Arrays;

public class main {

    public static int countPrimes(int[] arr) {

        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];

            boolean isPrime = true;

            if (number > 1) {
                for (int j = 2; j < number-1; j++) {
                    if (number % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime == true) counter++;
            }
        }

        return counter;
    }

    public static void main(String args[]) {

        int[] arr = {4, 7, 10, 11, 1, -5};

        System.out.println(countPrimes(arr));
    }
}
