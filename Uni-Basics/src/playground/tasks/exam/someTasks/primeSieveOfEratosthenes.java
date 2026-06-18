package playground.tasks.exam.someTasks;

import java.util.Arrays;

public class primeSieveOfEratosthenes {

    public static void solution(int n) {

        boolean[] isPrime = new boolean[n + 1];

        // Assume all numbers >= 2 are prime
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // Cross out multiples
        for (int i = 2; i <= n; i++) {

            if (isPrime[i]) {

                for (int j = i * 2; j <= n; j += i) {
                    isPrime[j] = false;
                }

            }
        }

        // Print surviving primes
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        solution(20);

    }
}