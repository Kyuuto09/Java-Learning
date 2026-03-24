package lab4;

import java.util.Scanner;

public class firstTask {

    public static double calculateTax(double income) {
        double tax = 0;

        if (income < 10_000) tax = 0; // bucket 1
        else if (income <= 30_000) tax = (income - 10_000) * 0.10; // bucket 2; (10%)
        else if (income <= 60_000) tax = 2000 + (income - 30_000) * 0.20; // bucket 3; (20%)
        else if (income <= 60_001) tax = 3000 + income * 0.30;

        return tax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your income: ");
        double income = sc.nextDouble();

        System.out.printf("your tax: %s PLN\n",calculateTax(income));
    }
}
