package playground.mortgage_calculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class mortgageCalculator {

    public static double calc(double loanMoney, double annualRate, byte loanPeriod) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        double r = (annualRate / PERCENT) / MONTHS_IN_YEAR;
        double mortgage = loanMoney * (r * Math.pow((1 + r), loanPeriod*MONTHS_IN_YEAR) / (Math.pow((1 + r), loanPeriod*MONTHS_IN_YEAR) - 1));

        return mortgage;
    }

    static void main(String[] args) {
        double loanMoney = 0;
        double annualRate = 0;
        byte loanPeriod = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Money to loan($1K - $1M): "); // P amount to loan
            loanMoney = sc.nextDouble();

            if (loanMoney >= 1000 && loanMoney <= 1_000_000)
                break;

            System.out.println("Invalid range!\nPlease enter the sum between $1K - $1M");
        }

        while (true) {
            System.out.print("Annual Interest Rate: "); // R monthly interest rate / 100 and then / 12
            annualRate = sc.nextDouble();

            if (annualRate >= 1 && annualRate <= 30)
                break;

            System.out.println("Invalid range!\nEnter a value between 1 - 30");
        }

        while (true) {
            System.out.print("Period (Years): ");
            loanPeriod = sc.nextByte();

            if (loanPeriod >= 1 && loanPeriod <= 30)
                break;

            System.out.println("Invalid range!\nEnter a value between 1 - 30");
        }

        System.out.printf("Mortgage: %s\n", NumberFormat.getCurrencyInstance().format(calc(loanMoney, annualRate, loanPeriod)));
    }
}
