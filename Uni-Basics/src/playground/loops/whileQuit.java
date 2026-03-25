package playground.loops;

import java.util.Scanner;

public class whileQuit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String quit = "";

        while (!quit.equals("q")) {
            System.out.print("Enter q to quit: ");
            quit = sc.next().toLowerCase();
        }
        System.out.println("We are out!");
    }
}
