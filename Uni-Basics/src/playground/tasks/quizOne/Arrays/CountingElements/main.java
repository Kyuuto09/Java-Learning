package playground.tasks.quizOne.Arrays.CountingElements;

public class main {

    public static int countEvens(int[] arr) {
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                counter++;
            }
        }

        return counter;
    }

    static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 6, 7}; // 3

        System.out.println(countEvens(arr));
    }
}
