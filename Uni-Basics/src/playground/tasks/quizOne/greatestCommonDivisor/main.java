package playground.tasks.quizOne.greatestCommonDivisor;

public class main {

    public static int findGCD(int a, int b) {
        if (a < 0) a *= -1;
        if (b < 0) b *= -1;


        if (a == 0) return b;
        if (b == 0) return a;

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;

    }

    public static void main(String args[]) {

        int a = 12;
        int b = 18;

        System.out.println(findGCD(a, b));
    }
}