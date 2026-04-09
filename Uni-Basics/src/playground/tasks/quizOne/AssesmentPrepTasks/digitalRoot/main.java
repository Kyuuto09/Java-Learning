package playground.tasks.quizOne.AssesmentPrepTasks.digitalRoot;

public class main {

    public static int digitalRoot(int n) {
        while (n > 9) {
            int sum = 0;

            while (n > 0) {
                int lastDigit = n % 10;

                sum += lastDigit;

                n /= 10;
            }

            n = sum;
        }

        return n;
    }

    public static void main(String args[]) {
        int n = 99993;

        System.out.println(digitalRoot(n));
    }
}