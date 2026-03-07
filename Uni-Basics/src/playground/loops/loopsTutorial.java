package playground.loops;

import java.util.Scanner;

public class loopsTutorial {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        byte number = sc.nextByte();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number); // 3
            }
            System.out.println();
        }


    }
}
