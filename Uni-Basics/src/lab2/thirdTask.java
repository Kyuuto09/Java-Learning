package lab2;

import java.util.Scanner;

public class thirdTask {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // add numbers 1 + 2 + 3 -----------------------
        // int sum = 0;

        // while (num > 0) {
        // int lastDigit = num % 10;

        // sum += lastDigit;

        // num /= 10;
        // }
        // System.out.println(sum);

        // reverse the number -----------------
        /*
         * int reversed = 0;
         * while (num > 0) {
         * int lastDigit = num % 10;
         * reversed = reversed * 10 + lastDigit;
         * num /= 10;
         * }
         * System.out.println(reversed);
         */

        // sum the numbers------------
         int i = 1;
         int sum = 0;
         while (num >= i) {
         sum += i;
         System.out.println(i);
         i++;
         }
         System.out.println(sum);

    }
}
