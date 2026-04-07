package playground.tasks.quizOne.AssesmentPrepTasks.countDivisors;

public class main {

    public static int countDivisors(int n) {
        int counter = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) counter++;
        }

        return counter;
    }

    public static void main(String args[]) {

        int number = 12;

        System.out.println(countDivisors(number));
    }
}