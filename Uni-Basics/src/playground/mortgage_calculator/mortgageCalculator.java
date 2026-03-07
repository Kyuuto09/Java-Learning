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
        Scanner sc = new Scanner(System.in);

        System.out.print("Money to loan: "); // P amount to loan
        double loanMoney = sc.nextDouble();

        System.out.print("Annual Interest Rate: "); // R monthly interest rate / 100 and then / 12
        double annualRate = sc.nextDouble();

        System.out.print("Period (Years): ");
        byte loanPeriod = sc.nextByte();

        System.out.printf("Mortgage: %s\n", NumberFormat.getCurrencyInstance().format(calc(loanMoney, annualRate, loanPeriod)));
    }
}
