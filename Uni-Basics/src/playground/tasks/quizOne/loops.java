package playground.tasks.quizOne;

public class loops {

    public static void printHashes() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void printTriangle() {
        int number = 5;

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void main(String[] args) {
        //printHashes();
        printTriangle();
    }
}
