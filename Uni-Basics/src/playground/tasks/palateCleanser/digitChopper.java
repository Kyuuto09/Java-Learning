package playground.tasks.palateCleanser;

import java.util.Scanner;

public class digitChopper {

    public static int reverseNum(int number) {
        int reversedNum = 0;

        while (number > 0) {
            int lastDigit = number % 10; // 123

            reversedNum = (reversedNum * 10) + lastDigit;

            number /= 10;
        }

        return reversedNum;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        int number = sc.nextInt(); // 123 -> 321

        System.out.println(reverseNum(number));

    }
}
