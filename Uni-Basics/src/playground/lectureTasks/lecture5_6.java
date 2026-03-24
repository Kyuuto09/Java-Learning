package playground.lectureTasks;

import java.util.Scanner;

public class lecture5_6 {

    public static void arsinh(double epsilon, double x) {
        // start from second term (first term x already in sum)
        double sum = x;
        double term = x;

        double sign = -1.0;
        double power = 3.0;
        double coefficient = 1.0 / 3.0;

        int iterations = 1;

        while (Math.abs(term) > epsilon) {
            //double term1 = -1.0 * (1.0 / 2.0) * (Math.pow(x, 3) / 3.0);
            //double term2 = 1.0 * ( (1.0 * 3.0) / (2.0 * 4.0) ) * (Math.pow(x, 5) / 5);
            //double term3 = -1.0 * ( (1.0 * 3.0 * 5.0) / (2.0 * 4.0 * 6.0) ) * (Math.pow(x, 7) / 7);
            term = sign * coefficient * (Math.pow(x, power) / power);

            sum += term;

            // update for next iteration
            sign *= -1;          // flip sign
            power += 2;          // next odd power (3 -> 5 -> 7 ...)


            // update coefficient: multiply by next pattern (odd/even)
            coefficient *= (power - 2) / (power - 1);

            iterations++;
        }

        System.out.println("Series: " + sum);

        double real = Math.log(x + Math.sqrt(x * x + 1));
        System.out.println("Real: " + real);

        System.out.println("Error: " + Math.abs(sum - real));

        System.out.println("Iterations: " + iterations);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of epsilon: ");
        double epsilon = sc.nextDouble();

        System.out.print("Enter the value of x: ");
        double x = sc.nextDouble();

        arsinh(epsilon, x);

    }
}