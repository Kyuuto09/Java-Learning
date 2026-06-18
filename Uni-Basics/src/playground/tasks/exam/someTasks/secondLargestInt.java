package playground.tasks.exam.someTasks;

public class secondLargestInt {

    public static int solution(int[] arr) {

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE; // // 10,10,8,8,3

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i]; // 10

            if (current > first) {
                second = first;
                first = current;
            } else {
                if (current > second && current != first) {
                    second = current; // 10
                }
            }
        }

        return second;
    }

    public static void main(String[] args) {

        System.out.println(solution(new int[]{5,3,8,1}));
        // Expected: 5

        System.out.println(solution(new int[]{10,10,8,8,3}));
        // Expected: 8

        System.out.println(solution(new int[]{7,2,7,5}));
        // Expected: 5

        System.out.println(solution(new int[]{100,90,80}));
        // Expected: 90

    }
}
