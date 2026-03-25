package playground.tasks.quizOne.mathGrid;

public class mathGrid {

    public static void tableGrid(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.printf("%5d", i * j);
            }
            System.out.println();
        }
    }
    static void main(String[] args) {
        tableGrid(5);
    }
}
