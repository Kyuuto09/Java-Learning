package playground.tasks.exam.someTasks;

import java.sql.SQLOutput;

public class PascalTriangle {

    public static long factorial(int n) {

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void solution(int rows) {
        long result = 1;

        for (int i = 0; i <= rows; i++) {

            for (int j = 0; j <= i; j++) {
                result = ( factorial(i) ) / (factorial(j) * factorial((i-j)) );
                System.out.print(result + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        solution(7);
    }
}
