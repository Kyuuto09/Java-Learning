package playground.tasks.quizOne.AssesmentPrepTasks.alternatingSum;

public class main {

    public static int calculateAlternatingSum(int number) {

        int result = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) { result += i; }
            else { result -= i; }
        }

        return result;

    }

    public static void main(String args[]) {

        int number = 4;

        System.out.println(calculateAlternatingSum(number));
    }
}