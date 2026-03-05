package playground.math;

import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        double result = 4.5;
        int roundResult = (int) Math.floor(result); // ! Math.floor, Math.ceil, Math.round, Math.max, Math.min,
                                                    // ! Math.random

        int maxMath = Math.max(100, 200);
        System.out.printf("roundResult: %s,\nMath.max: %s\n", roundResult, maxMath);

        // * Random ------------
        // * let us say I want to make random from 0 to 500, so i just multiply it by
        // * 500
        System.out.println("----Random----");

        int randomValue = (int) (Math.random() * 500);
        // System.out.println((int) randomValue);
        // if i want round value i can just cast it or use Math.round
        System.out.println(randomValue);

        // TASK 1
        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter Celcius temp: ");
        // double tempuratureC = sc.nextDouble();

        // double tempuratureF = 9.0 / 5.0 * tempuratureC + 32;

        // System.out.println(Math.round(tempuratureF));

        // TASK 2 Radius
        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter a radius: ");
        // double r = scanner.nextDouble();

        // double circumference = 2 * Math.PI * r;
        // System.out.printf("Result: %s\n", circumference);
        // System.out.printf("Rounded Result: %s\n", (int) circumference);

        // TASK 3 Minutes to hours
        // Scanner sc = new Scanner(System.in);

        // System.out.print("Please enter minutes: ");
        // double minutes = sc.nextDouble();

        // double hours = minutes / 60;
        // System.out.printf("%s minutes = %.2f hours\n", Math.round(minutes), hours);

        // TASK 4 Distance between two points
        Scanner sc = new Scanner(System.in);

        System.out.print("x1 value: ");
        double x1 = sc.nextDouble();

        System.out.print("y1 value: ");
        double y1 = sc.nextDouble();

        System.out.print("x2 value: ");
        double x2 = sc.nextDouble();

        System.out.print("y2 value: ");
        double y2 = sc.nextDouble();

        System.out.println("Result: " + dFormula(x1, y1, x2, y2));
    }

    // TASK 4
    public static double dFormula(double x1, double y1, double x2, double y2) {
        double xMinus = x2 - x1;
        double yMinus = y2 - y1;

        double resultD = Math.sqrt(Math.pow(xMinus, 2) + Math.pow(yMinus, 2));
        // ** OR
        // double d = Math.sqrt((xMinus * xMinus) + (yMinus * yMinus));
        return resultD;
    }
}
