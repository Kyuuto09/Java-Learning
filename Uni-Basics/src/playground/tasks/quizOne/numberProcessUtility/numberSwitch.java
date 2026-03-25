package playground.tasks.quizOne.numberProcessUtility;

import java.util.Scanner;

public class numberSwitch {

    public static void processNumber(int operationCode, int targetNumber) {
        switch (operationCode) {
            case 1:
                int reverse = 0;

                while (0 < targetNumber) {
                    int lastDigit = targetNumber % 10;

                    reverse = (reverse * 10) + lastDigit;

                    targetNumber /= 10;
                }
                System.out.println(reverse);

                break;
            case 2:
                int sum = 0;

                while (0 < targetNumber) { // 123
                    int lastDigit = targetNumber % 10;

                    sum += lastDigit;

                    targetNumber /= 10;
                }
                System.out.println(sum);

                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Code: ");
        int operationCode = sc.nextInt();

        System.out.print("Target number: ");
        int targetNumber = sc.nextInt();

        processNumber(operationCode, targetNumber);
    }
}
