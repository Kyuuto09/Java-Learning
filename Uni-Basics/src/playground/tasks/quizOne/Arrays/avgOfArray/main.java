package playground.tasks.quizOne.Arrays.avgOfArray;

public class main {

    public static double solutionAvg(int[] arr) {
        double avg = 0;

        for (int i = 0; i < arr.length; i++) {
            avg += arr[i];
        }

        return avg / arr.length;
    }
    static void main(String[] args) {
        int[] arr = {7, 2, 3, 4, 5, 10};

        System.out.printf("%.2f" ,solutionAvg(arr));
    }
}
