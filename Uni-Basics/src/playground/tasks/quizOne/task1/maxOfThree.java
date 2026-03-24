package playground.tasks.quizOne.task1;

import java.util.Scanner;

public class maxOfThree {

    public static int maxOfThree(int a, int b, int c) {
        int max = a;

        if (b > max) max = b;
        if (c > max) max = c;

        return max;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        int a = sc.nextInt();

        System.out.print("b: ");
        int b = sc.nextInt();

        System.out.print("c: ");
        int c = sc.nextInt();

        System.out.println("Max number: "+ maxOfThree(a, b, c));
    }
}
