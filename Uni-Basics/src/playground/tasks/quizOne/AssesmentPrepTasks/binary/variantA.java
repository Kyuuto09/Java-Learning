package playground.tasks.quizOne.AssesmentPrepTasks.binary;

public class variantA {

    public static String toBinary(int n) {
        if (n == 0) return "0";

        String binary = "";
        while (n > 0) {
            int bit = n % 2;

            binary = bit + binary;

            n /= 2;
        }

        return binary;
    }

    public static void main(String args[]) {

        int number = 13;

        System.out.println(toBinary(number));
    }
}