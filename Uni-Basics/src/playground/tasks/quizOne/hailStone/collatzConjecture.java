package playground.tasks.quizOne.hailStone;

public class collatzConjecture {

    public static void printHailstone(int number) {

        while (1 < number) {
            System.out.print(number + " ");

            if (number % 2 == 0)
                number /= 2;
            else
                number = number * 3 + 1;
        }

        System.out.println(number);
    }
    static void main(String[] args) {
        printHailstone(6);
    }
}
