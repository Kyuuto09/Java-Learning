package playground.tasks.quizOne.fibonacci;

public class fibonacciNumbers {
                                                //
    public static void printFibonacci(int n) { // 0 1 1 2 3 5 8 13 21 34

        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            System.out.printf(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        int number = 10;

        printFibonacci(number);
    }
}
