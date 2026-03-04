package playground.math;

public class math {
    public static void main(String[] args) {
        double result = 4.5;
        int roundResult = (int) Math.floor(result); // ! Math.floor, Math.ceil, Math.round, Math.max, Math.min,
                                                    // ! Math.random

        int maxMath = Math.max(100, 200);
        System.out.printf("roundResult: %s,\nMath.max: %s\n", roundResult, maxMath);

        // * Random ------------
        // * let us say I want to make random from 0 to 500, so i just multiply it by
        // * 500
        System.out.println("----Random----");

        int randomValue = (int) (Math.random() * 500);
        // System.out.println((int) randomValue);
        // if i want round value i can just cast it or use Math.round
        System.out.println(randomValue);
    }
}
