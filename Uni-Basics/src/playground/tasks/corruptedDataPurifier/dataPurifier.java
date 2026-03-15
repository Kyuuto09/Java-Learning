package playground.tasks.corruptedDataPurifier;

import java.util.Scanner;

public class dataPurifier {

    public static int secureMultiplier(int number) {

        int cleanNumber = 1; // 234

        while (0 < number) {
            int lastDigit = number % 10;

            if (lastDigit == 9)
                break;

            if (lastDigit == 0) {
                number /= 10;
                continue;
            }

            cleanNumber *= lastDigit;

            number /= 10;
        }

        return cleanNumber;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        int number = sc.nextInt();

        System.out.println(secureMultiplier(number));

        sc.close();
    }
}
