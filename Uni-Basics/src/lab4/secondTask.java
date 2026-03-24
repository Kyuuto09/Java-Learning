package lab4;

import java.util.Scanner;

public class secondTask {
    // prime number divides by itself and by 1
    // Example: 5; 1 -> yes, 2 -> no. 3 -> no, 4 -> no, 5 -> yes
    
    public static boolean isPrime(int number) {
        if (number <= 1) return false;

        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Number: ");
//        int number = sc.nextInt();
        // test
        for (int i = 1; i < 40; i++) {
            System.out.printf("Number: %d: %b\n",i ,isPrime(i));
        }
    }
}
