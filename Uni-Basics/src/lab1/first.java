package lab1;

import java.util.Scanner;

public class first {

    // ---------------------------
    // FUNC WITH INPUT
    // ---------------------------

    // Multiply by two
    public static void multiply_by_two(int num) {
        // int multiply = a * 2;
        String message = String.format("Multiply by two: %,d", num * 2);

        System.out.println(message);
    }

    // ---------------------------
    // SUM CALCULATOR
    // ---------------------------
    public static void calculator_sum(int first, int second) {
        String calculator_message = String.format("Sum of two nums are: %,d", first + second);
        System.out.print(calculator_message);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!\t<- tab is here \nH\ne\nl\nl\no");
        System.out.println("\tH\te\tl\tl\to");
        // System.out.print("does not shift");

        // Arithmetics
        int a = 10;
        int b = 2;
        float c = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / c);
        System.out.println(5 % 3);

        // Logical
        System.out.println(true || false); // or
        System.out.println(true && false); // and
        System.out.println(!true); // not

        // ---------------------------
        // FUNC WITH INPUT
        // ---------------------------
        // Scanner variable = new Scanner(System.in);
        // System.out.println("Enter a number: ");
        //
        // int number = variable.nextInt();
        // multiply_by_two(number);

        Scanner calculator_var = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int input_1 = calculator_var.nextInt();
        int input_2 = calculator_var.nextInt();
        calculator_sum(input_1, input_2);

        // ---------------------------
        // Loops
        // ---------------------------
        // String word = "Hello";
        // for (int i = 0; i < word.length(); i++) {
        // System.out.println(word.charAt(i));
        // }

    }

}
