package playground.lectureTasks;

public class lecture5_6 {
    static void main(String[] args) {
        final double epsilon = 0.0001;

        double x = 0.5;
        double sum = x;
        double term = x;

        double sign = -1.0;
        double power = 3.0;
        double coefficient = 1.0 / 2.0;

        // start from second term (first term x already in sum)
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
            //coefficient *= (power - 2) / (power - 1);

            // Pattern explanation:
            // Each step multiplies coefficient by (odd number)/(next even number):
            // 3/4, 5/6, 7/8, 9/10...
            // We hardcode it here to clearly see how the pattern evolves.
            // HARD-CODED version to understand the pattern step-by-step
            if (power == 5) {
                coefficient *= 3.0 / 4.0;   // from 1/2 → 3/8
            } else if (power == 7) {
                coefficient *= 5.0 / 6.0;   // from 3/8 → 15/48
            } else if (power == 9) {
                coefficient *= 7.0 / 8.0;   // next step
            } else if (power == 11) {
                coefficient *= 9.0 / 10.0;  // next step
            }
        }

        System.out.println(sum);
    }
}