package playground.tasks.quizOne.strongNumbers;

public class main {

    public  static void findStrongNumbers() {
        for (int number = 1; number < 500; number++) {

            int backupNumber = number;
            int temp = number;

            int sum = 0;

            while (0 < temp) {
                int lastDigit = temp % 10; //  145

                int factorial = 1;
                for (int i = 1; i <= lastDigit; i++) {
                    factorial *= i; // 1 * 2 * 3 * 4 * 5
                }

                sum += factorial;

                temp /= 10;
            }

            if (sum == backupNumber)
                System.out.println(sum);

        }

    }

    static void main(String[] args) {
        findStrongNumbers();
    }
}
