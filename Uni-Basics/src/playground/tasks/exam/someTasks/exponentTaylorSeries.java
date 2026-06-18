package playground.tasks.exam.someTasks;

public class exponentTaylorSeries {

    public static long factorial(int n) {

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static double solution(double x, int terms) {

        if (terms <= 0) return 0;

        double result = 0;

        for (int i = 0; i < terms; i++) {
            result += (Math.pow(x, i) / ( factorial(i) ));
        }

        return Math.round(result * 10.0) / 10.0; // 2 decimal round, just add 0 to 3 decimal round
    }

    public static void main(String[] args) {

        System.out.println(
                solution(1, 4)
        );

    }
}