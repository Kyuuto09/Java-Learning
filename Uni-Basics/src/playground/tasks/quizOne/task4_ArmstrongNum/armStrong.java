package playground.tasks.quizOne.task4_ArmstrongNum;

import java.util.Scanner;

public class armStrong {
    static void main(String[] args) {

        for (int i = 100; i < 999; i++) {
            int temp = i;

            int sum = 0;

            while(0 < temp) {
                int lastDigit = temp % 10;

                lastDigit = lastDigit*lastDigit*lastDigit;
                sum += lastDigit;

                temp /= 10;
            }

            if (sum == i) {
                System.out.println(i + " true");
            }
        }

    }
}
