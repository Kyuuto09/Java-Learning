package playground.tasks.quizOne.task3_Prime;

import java.util.Scanner;

public class primeNumber {

    public static boolean isPrime(int number) {

        if (number > 1) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) return false;
            }
            return true;

        } else
            return false;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        int number = sc.nextInt();

        System.out.println(isPrime(number));
    }
}
