package playground.tasks.exam.someTasks;

public class secondLargestNumber {

    public static int solution(int[] arr) {

        int largest = arr[0];
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];

            if (current > largest) {
                second = largest;
                largest = current;
            } else if (current > second && current != largest) {
                second = current;
            }
        }

        return second;
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 3}; // 4

        System.out.println(
                solution(arr)
        );

    }
}
