package playground.tasks.quizOne.Arrays.CheckOrder;

public class main {

    public static boolean isIncreasing(int[] arr) {
        boolean isIncreasing = false;

        for (int i = 0, j = 1; i < arr.length - 1; i++) {
            if (arr[j] > arr[i]) {
                isIncreasing = true;
                j++;
            }
            else return false;
        }

        return isIncreasing;
    }

    static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 100}; // true
        //int[] arr = {1, 2, 2, 4, 5}; // false

        System.out.println(isIncreasing(arr));
    }
}
