package playground.tasks.quizOne.AssesmentPrepTasks.coprime.main;

public class main {

    public static int isCoprime(int a, int b) {

        while (b != 0) {
            int remainder = a % b;

            a = b;
            b = remainder;
        }

        if (a == 1) return 1;
        else return 0;
    }

    public static void main(String args[]) {
        int a = 5;
        int b = 15;

        System.out.println(isCoprime(a, b));
    }
}