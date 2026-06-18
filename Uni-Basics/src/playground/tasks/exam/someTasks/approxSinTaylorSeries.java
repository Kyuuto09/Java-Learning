package playground.tasks.exam.someTasks;

public class approxSinTaylorSeries {

    public static long factorial(int n) {

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static double solution(double x, int terms) {

        if (terms <= 0) return 0;

        double result = x;
        double sign = -1.0;


        for (int i = 3; i <= (terms * 2); i+=2) {
            int power = i;

            result += sign * ( (Math.pow(x, power)) / factorial(power) );

            sign *= -1;
        }

        return Math.round(result * 100.0) / 100.0;
    }

    public static void main(String[] args) {

        double x = 1;
        int terms = 2;

        System.out.println(solution(x, terms));

    }
}
