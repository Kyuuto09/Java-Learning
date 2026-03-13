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
        // System.out.print("Enter a number: ");
        // int N = sc.nextInt();

        // for (int i = 1; i <= N; i++)
        // System.out.println(i);

        // task 1
        // int i = 1;
        // while (N >= i) {
        // System.out.println(i);
        // i++;
        // }

        // task 2
        // int i = 1;
        // int sum = 0;
        // while (N >= i) {
        // sum += i;
        // System.out.println(i);
        // i++;
        // }
        // System.out.println("Sum: " + sum);

        // task 1 FOR LOOPS
        // for (int i = 1; i <= 10; i++) { // System.out.println((int) Math.pow(i, 2));
        // // or

        // System.out.println(i * i); // this is better (less cpu usage)
        // }

        // task 2 FOR LOOPS
        // System.out.print("Number: ");
        // int N = sc.nextInt();

        // int sum = 0;

        // // for (int i = 1; i <= N; i++) {
        // // if (i % 2 == 0) {
        // // sum += i;
        // // }
        // // }

        // for (int j = 0; j <= N; j += 2) {
        // sum += j;
        // }

        // System.out.println(sum);

        // switch ------------------------
        // task 1
        // int number = 7;

        // switch (number) {
        // case 1:
        // System.out.println("Monday");
        // break;
        // case 2:
        // System.out.println("Tuesday");
        // break;
        // case 3:
        // System.out.println("Wednesday");
        // break;
        // case 4:
        // System.out.println("Thursday");
        // break;
        // case 5:
        // System.out.println("Friday");
        // break;
        // case 6:
        // System.out.println("Saturday");
        // break;
        // case 7:
        // System.out.println("Sunday");
        // break;

        // default:
        // System.out.println("From 1-7 only");

        // }

        // task 2
        // System.out.print("a: ");
        // int a = sc.nextInt();

        // System.out.print("b: ");
        // int b = sc.nextInt();

        // System.out.print("(+ - * /) : ");
        // char operator = sc.next().charAt(0);

        // switch (operator) {
        // case '+':
        // System.out.println(a + b);
        // break;
        // case '-':
        // System.out.println(a - b);
        // break;
        // case '*':
        // System.out.println(a * b);
        // break;
        // case '/':
        // System.out.println(a / b);
        // break;

        // default:
        // System.out.println("Invalid char symbol");
        // }

        // task 2 updated switch that is easier
        // switch (operator) {
        // case '+' -> System.out.println(a + b);
        // case '-' -> System.out.println(a - b);
        // case '*' -> System.out.println(a * b);
        // case '/' -> System.out.println(a / b);
        // default -> System.out.println("Invalid char symbol");
        // }

        // DO-WHILE LOOPS

        // task 1
        // do {
        // System.out.print("Enter a number: ");
        // number = sc.nextInt();
        // } while (number < 0);

        // task 2

        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        int i = N;

        do {
            System.out.println(i);
            i--;
        } while (i >= 1);

        sc.close();

    }
}
