import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Primitive type (does not require memory allocation)
        byte myAge = 18;
        float price = 9.99f;

        // Reference type (need to allocate memory)
        Date now = new Date(); // new operator allocates memory (always needed for Reference types)
        System.out.println("Current date: " + now);

        // Here it links
        /*
         * Point point1 = new Point(1, 2);
         * Point point2 = point1;
         * point1.x = 2;
         * 
         * System.out.println(point2);
         */

        // ------------------------
        // STRINGS
        // ------------------------

        String userName = " User123  ";

        // let's inject some fake data
        userName = userName.replace(userName, "DROP_TABLE_USERS");

        String[] notSafe = { "DROP_TABLE_USERS" };

        if (userName.length() > 20 && userName != notSafe[0]) {
            System.out.printf("%s is too long: %s characters", userName, userName.length());
        } else if (userName.equals(notSafe[0])) {
            System.out.printf("Injection detected--------------> %s <--------------\n", userName);
        } else {
            System.out.printf("%s created successfully!", userName);
        }

        // ------------------------
        // ARRAYS
        // ------------------------
        System.out.println("----------Arrays----------");

        int[] numbers = { 4, 2, 5, 6, 7 };

        System.out.printf("Length of array: %s\n", numbers.length);

        Arrays.sort(numbers); // sorting
        System.out.println(Arrays.toString(numbers));

        // ------------------------
        // MULTI DIMENSIONAL ARRAYS
        // ------------------------
        System.out.println("----------Multi-Dimensional-Arrays----------");

        /*
         * int[][][] array = new int[2][3][5]; // 2 rows & 3 columns
         * array[0][0][0] = 1; // first row & column
         * array[0][0][4] = 4;
         * array[1][0][4] = 1;
         */

        int[][] array = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println(Arrays.deepToString(array));

        // ------------------------
        // CONSTANTS
        // ------------------------
        final float PI = 3.14f; // final = constant
        System.out.println(PI);

        // ------------------------
        // ARITHMETICS
        // ------------------------
        System.out.println("----------Arithmetics----------");

        // float result = (float) 10 / (float) 3;
        // System.out.println(result);

        int x = 1;
        int y = ++x; // with ++x it will print 2, but with x++ it will print 1
        System.out.println(y);

        // By the way: multiplication has highest priority
        int q = 10 + 2 * 3; // to change priority just add (); (10 + 2) * 3 = 36
        System.out.println(q);
    }
}
