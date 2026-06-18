package playground.tasks.exam.someTasks;

public class epsilonBisectionMethod {

    public static double func(double x) {

        double result = (Math.pow(x, 3)) - x - 2;

        return result;
    }

    public static double solution(double left, double right) {

        double epsilon = 0.001;
        double mid = 0;

        while (right - left >= epsilon) {
            mid = (left+right) / 2;

            if (func(mid) > 0) {
                right = mid;
            } else {
                left = mid;
            }

            // stop
            if (right - left < epsilon) {
                break;
            }
        }

        return Math.round(mid * 100.0) / 100.0;
    }

    public static void main(String[] args) {

        System.out.println(solution(1, 2));

    }
}