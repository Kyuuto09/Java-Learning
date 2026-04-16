package playground.tasks.quizTwo.counterTask4B;

public class main {

    public static int solution(int[] arr, int value) {
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) { counter++; }
        }

        return counter;
    }

    public static void main(String[] args) throws Exception {
        int n = 7;
        int[] arr = {7, 7, 7}; // 3

        System.out.println(solution(arr, n));
    }
}
