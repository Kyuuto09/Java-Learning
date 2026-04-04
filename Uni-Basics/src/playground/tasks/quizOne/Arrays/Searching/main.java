package playground.tasks.quizOne.Arrays.Searching;

import java.util.Scanner;

public class main {

    public static int findIndex(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) return i;
        }

        return -1;
    }

    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 10, 12, 1};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int userInput = sc.nextInt();

        System.out.println(findIndex(arr, userInput));
    }
}
