package playground.tasks.quizTwo.indexOfElemTask4C;

public class main {

    public static int solution(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) throws Exception {
        int n = 5;
        int[] arr = {5, 8, 5, 2}; // 3

        System.out.println(solution(arr, n));
    }
}
