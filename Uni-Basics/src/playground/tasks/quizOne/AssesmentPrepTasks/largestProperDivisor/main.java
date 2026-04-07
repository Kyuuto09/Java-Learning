package playground.tasks.quizOne.AssesmentPrepTasks.largestProperDivisor;

public class main {

    public static int largestDivisor(int n) {
        int lastDivisor = 0;

        for (int i = 1; i <= n; i++) { // 12
            if (n % i == 0) { // 1, 2, 4, 6
                if (i < n) {
                    lastDivisor = i;
                }
            }
        }

        return lastDivisor;
    }

    public static void main(String args[]) {

        int number = 7;

        System.out.println(largestDivisor(number));
    }
}