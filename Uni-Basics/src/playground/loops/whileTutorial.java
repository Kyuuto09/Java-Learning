package playground.loops;

import java.util.Scanner;

public class whileTutorial {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = "";

        while (true) {
            System.out.print("User: ");
            input = sc.next().strip().toLowerCase();

            if (input.equals("pass")) {
                System.out.println("Type: quit to exit");
                continue;
            }

            if (input.equals("quit"))
                break;

            System.out.println(input);
        }

        System.out.println("Successfully exited!");

        // Same thing
//        do {
//            System.out.print("user: ");
//            input = sc.next().strip().toLowerCase();
//        } while (!input.equals("quit"));
    }
}