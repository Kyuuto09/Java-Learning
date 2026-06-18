package playground.tasks.exam.someTasks;

public class primeInRange {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int solution(int n) {

        int counter = 0;

        for (int i = 0; i <= n; i++) {
            if (isPrime(i)) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {

        int n = 10;

        System.out.println(solution(n));

    }
}