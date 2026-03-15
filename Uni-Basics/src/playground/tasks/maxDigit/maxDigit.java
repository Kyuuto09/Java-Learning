package playground.tasks.maxDigit;

import java.util.Scanner;

public class maxDigit {

    public static int maxNumber(int number) { // 324

        int max = 0;

        while (0 < number) {
            int lastDigit = number % 10;

            if (lastDigit > max) {
                max = lastDigit;
            }

            number /= 10;
        }

        return max;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        int number = sc.nextInt();

        System.out.println(maxNumber(number));

        sc.close();
    }
}
