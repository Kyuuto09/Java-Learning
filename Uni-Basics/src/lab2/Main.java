package lab2;

import java.util.Scanner;

public class Main {
    // --------------------
    // LEAP YEAR
    // --------------------
    public static boolean leapYear(int input) {
        boolean isLeapYear = ((input % 100 != 0 && input % 4 == 0) || input % 400 == 0);

        if (isLeapYear)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        // Leap year
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (leapYear(year))
            System.out.println("Is a leap year");
        else
            System.out.println("Not a leap year");
        // Leap Year
    }
}