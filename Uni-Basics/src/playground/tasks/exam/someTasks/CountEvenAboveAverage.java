package playground.tasks.exam.someTasks;

public class CountEvenAboveAverage {

    public static int countEvenAboveAverage(int[] arr) {

        int sum = 0;
        int length = arr.length;

        double avg = 0;
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        avg = (double) sum / length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                if (arr[i] > avg) {
                    counter++;
                }
            }
        }

        return counter;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 7, 10};

        System.out.println(countEvenAboveAverage(arr));

    }
}