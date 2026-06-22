package playground.tasks.exam.someTasks;

public class approxSinTaylorSeries {

    public static long factorial(int x) {
        long factorial = 1;

        for (int i = 1; i <= x; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static double solution(double x, int terms) {

        double result = 0;
        double sign = 1;

        for (int i = 1; i <= (terms*2); i+=2) {

            result += sign * ( (Math.pow(x, i)) / factorial(i) );

            sign *= -1;
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(solution(1, 1));
        // Expected: 1.0

        System.out.println(solution(1, 2));
        // Expected: ~0.833333

        System.out.println(solution(1, 3));
        // Expected: ~0.841667

    }
}