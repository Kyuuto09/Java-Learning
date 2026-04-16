package playground.tasks.quizTwo.countIfDivisibleByBothTask5D;

public class main {

    public static int solution(int[] arr) {
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) throws Exception {
        int[] arr = {15, 30, 10, 9}; // 2

        System.out.println(solution(arr));
    }
}
