package playground.tasks.exam.someTasks;

import java.util.Random;

public class randomNum {
    static void main(String[] args) {
        Random r = new Random();

        int r1 = r.nextInt(1000); // bound 1000
        int r2 = r.nextInt(2000); // bound 2000

        System.out.println("Random int1: " + r1);
        System.out.println("Random int2: " + r2);
    }
}
