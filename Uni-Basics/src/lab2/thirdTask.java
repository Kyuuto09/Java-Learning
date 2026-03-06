package lab2;

import java.util.Scanner;

public class thirdTask {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int digitsNo = 0;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
            digitsNo++;

        }
        System.out.println(num);
        System.out.println(sum);

    }
}
