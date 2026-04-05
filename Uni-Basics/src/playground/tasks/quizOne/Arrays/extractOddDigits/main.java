package playground.tasks.quizOne.Arrays.extractOddDigits;

public class main {

    public static int extractOddDigits(int number) {
        int sum = 0;
        int multiplier = 1;

        while (number > 0) {

            if (number % 2 != 0) {
                int lastDigit = number % 10;

                sum = sum + (lastDigit * multiplier);

                multiplier *= 10;

            } else sum += 0;

            number /= 10;
        }

        return sum;
    }

    public static void main(String args[]) {

        int number = 83725;

        System.out.println(extractOddDigits(number));
    }
}