package playground.tasks.exam.someTasks;

public class secondSmallestNumber {

    public static int solution(int[] arr) {

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        // 1,1,2,2,3
        for (int i = 0; i < arr.length; i++) { // 1, 1
            int current = arr[i]; // 1

            if (current < first) { //
                second = first; // 2nd 100
                first = current; // 1st 1
            } else  {
                if (current < second && current != first) {
                    second = current;
                }
            }
        }

        return second;
    }

    public static void main(String[] args) {

        System.out.println(solution(
                new int[]{5,1,8,3}));
        // Expected: 3

        System.out.println(solution(
                new int[]{1,1,2,2,3}));
        // Expected: 2

    }
}