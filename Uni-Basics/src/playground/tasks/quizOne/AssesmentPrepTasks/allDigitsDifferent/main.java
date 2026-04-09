package playground.tasks.quizOne.AssesmentPrepTasks.allDigitsDifferent;

public class main {

    public static int allDigitsDifferent(int n) {

        while (n > 0) {
            int temp = n;
            int lastDigit = n % 10; // 123

            int innerNum = temp/10;
            while (innerNum > 0) {
                int lastDgInner = innerNum % 10; //

                if (lastDigit == lastDgInner) { //
                    return 0;
                }

                innerNum /= 10;
            }

            n /= 10;
        }

        return 1;
    }

    public static void main(String args[]) {

        int number = 123456; // 1234564

        System.out.println(allDigitsDifferent(number));
    }
}