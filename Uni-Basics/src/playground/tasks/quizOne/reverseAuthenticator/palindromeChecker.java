package playground.tasks.quizOne.reverseAuthenticator;

import java.util.Scanner;

public class palindromeChecker {

    public static boolean isPalindrome(int number) { // 121 - true; 122 - false
        int reversed = 0;
        int numberCopy = number;

        while (0 < number) {
            int lastDigit = number % 10;

            reversed = (reversed * 10) + lastDigit;

            number /= 10;
        }
        return numberCopy == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        int number = sc.nextInt();

        System.out.println(isPalindrome(number));
    }
}
