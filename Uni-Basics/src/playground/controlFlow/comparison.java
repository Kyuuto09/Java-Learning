package playground.controlFlow;

import java.util.Scanner;

public class comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weather temp: ");
        int tempurature = sc.nextInt();

        if (tempurature >= 30)
            System.out.printf("It's a hot day\ndrink plenty of water\n");
        else if (tempurature >= 15)
            System.out.println("It's a nice day");
        else
            System.out.println("It's cold");
    }
}
