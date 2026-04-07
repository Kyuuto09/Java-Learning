package playground.tasks.quizOne.AssesmentPrepTasks.countBinaryOnes;

public class main {

    public static int countBinaryOnes(int number) {

        int counter = 0;

        while (number > 0) {
            int bit = number % 2;

            if (bit == 1) counter++;

            number /= 2;
        }

        return counter;
    }

    public static void main(String args[]) {

        int number = 13;

        System.out.println(countBinaryOnes(number));
    }
}