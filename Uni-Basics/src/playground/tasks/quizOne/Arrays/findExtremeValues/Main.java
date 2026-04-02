package playground.tasks.quizOne.Arrays.findExtremeValues;

public class Main {

    public static int addInteger(int number) {
        int sum = 0;

        while (0 < number) {
            int lastDigit = number % 10;

            sum += lastDigit;

            number /= 10;
        }

        return sum;
    }

    public static int solution(int[] arr) {
        int maxElement = arr[0];

        for (int i = 0; i < arr.length; i++) { // i = 1; j = 2
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }

        return maxElement;
    }

    static void main(String[] args) {

        int[] arr = {22, 20, 2, 5, 7, 21, 23};

        int number = solution(arr);

        System.out.println(solution(arr));

        System.out.println(addInteger(number));
    }
}
