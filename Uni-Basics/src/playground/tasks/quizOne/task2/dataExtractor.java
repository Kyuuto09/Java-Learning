package playground.tasks.quizOne.task2;

import java.util.Scanner;

public class dataExtractor {

    public static void returnSum(int number) {
        int sum = 0;
        while(0 < number) { // 452
            int lastDigit = number % 10;

            sum += lastDigit;

            number /= 10;
        }

        System.out.println("Sum: " + sum);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        returnSum(number);
    }
}
