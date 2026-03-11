package playground.lectureTasks;

import java.util.Scanner;

public class lecture3_4 {

    public static String taskOne(int x) {
        if (x >= 1)
            return "positive";
        else if (x <= -1)
            return "negative";
        else
            return "zero";
    }

    public static String taskTwo(int a, int b) {
        if (a < b)
            return String.valueOf(b);
        else if (a > b)
            return String.valueOf(a);
        else
            return "equal";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("a: ");
        // int a = sc.nextInt();

        // System.out.print("b: ");
        // int b = sc.nextInt();

        // System.out.println(taskTwo(a, b));

        // System.out.println(taskOne(x));

        // -----
        // WHILE
        // -----
        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        // for (int i = 1; i <= N; i++)
        // System.out.println(i);

        // task 1
        // int i = 1;
        // while (N >= i) {
        // System.out.println(i);
        // i++;
        // }

        // task 2
        int i = 1;
        int sum = 0;
        while (N >= i) {
            sum += i;
            System.out.println(i);
            i++;
        }
        System.out.println("Sum: " + sum);
    }
}
