package playground.tasks.exam.someTasks;

public class simpleBisectionMethod {

    public static double func(double x) {

        double f = x * x - 4; // 2 is needed to get 0

        return f;
    }

    public static double solution(double left, double right) {

        double mid = 0;

        for (int i = 0; i <= 10; i++) {
            mid = (left+right) / 2;

            if (func(mid) == 0) {
                return mid;
            }

            if (func(mid) > 0) {
                right = mid;
            } else {
                left = mid;
            }
        }

        return mid;
    }

    public static void main(String[] args) {

        System.out.println(solution(0, 5));

    }
}
