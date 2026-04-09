package playground.tasks.quizOne.AssesmentPrepTasks.countBinaryZeros;

public class main {

    public static int countBinaryZeros(int n) {

        int count = 0;

        while (n > 0) { // 10
            int bit = n % 2;

            if (bit == 0) {
                count++;
            }

            n /= 2;
        }

        return count;
    }

    public static void main(String args[]) {
        int n = 8;

        System.out.println(countBinaryZeros(n));
    }
}