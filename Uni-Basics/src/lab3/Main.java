package lab3;

public class Main {

    // Task 1
    public static void powLoop(int a) {
        for (int i = 1; i <= a; i++) {
            System.out.println(i * i);
        }
    }

    // Task 2
    // matrix num variable = 10
    public static void matrixTable(int matrixNum) {
        System.out.print(""); //

        for (int k = 1; k <= matrixNum; k++) {
            System.out.print(" " + k + " ");
        }
        System.out.println(); //

        for (int i = 1; i <= matrixNum; i++) {

            System.out.print(i + "| "); //

            for (int j = 1; j <= matrixNum; j++) {
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }
    }

    // Task 3
    public static int getReversedNumber(int number) { // 123
        int reverse = 0;
        while (number > 0) {
            int lastDigit = number % 10; // get 3
            reverse = (reverse * 10) + lastDigit;  // put 3 at [0] index that multiplied by 10

            number /= 10;
        }
        return reverse;
    }

    // Task 4
    public static double cosSeries(double x, double n) {
        

        return 0;
    }

    public static double factorial(int num) {
        double result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        // task 1
        //powLoop(10);


        // task 2
        // matrixTable(10);

        // task 3
        //System.out.println(getReversedNumber(123));

        // Task 4
        System.out.println(factorial(3));
    }
}
