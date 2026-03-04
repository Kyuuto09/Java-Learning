package playground.basics;

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

        System.out.println("Hello " + 7 + 2); // this wil be a string Hello 72
        System.out.println("Hello " + (7 + 2)); // () helps to add them Hello 9

        // TASK for Refreshing brain
        // PART 1
        String user = " Admin123 ";
        String formatUser = user.strip();

        if (formatUser.equalsIgnoreCase("Admin")) {
            System.out.println("Reserved username!");
        } else if (formatUser.length() > 15) {
            System.out.println("Too long!");
        } else {
            System.out.printf("Username accepted: <%s>\n", formatUser);
        }

        // PART 2
        int[] scores = { 78, 90, 66, 84, 95 };

        System.out.printf("Original array is: %s\n", Arrays.toString(scores));

        Arrays.sort(scores);
        System.out.println("Sorted scores: " + Arrays.toString(scores));
        System.out.println("Lowest score: " + scores[0]);
        System.out.println("Highest score: " + scores[scores.length - 1]);

        // ------------------------
        // Implicit casting
        // ------------------------
        System.out.println("----------Implicit casting----------");

        // byte > short > int > long > float > double
        double x1 = 1.1;
        int y2 = (int) x1 + 2;
        System.out.println(
                "The x1 value was formated\nto the interger by using (int) x1\nso the result of 1.1 + 2 -> " + y2);

        // ** Imporant String Casting
        System.out.println("--Strings Casting--");

        String someString = "1.2";

        // ! Integer.parseInt(variable) or Double.parseDouble(variable)
        System.out.printf("String to Integer casting: %s\n", Double.parseDouble(someString) + 2);
    }
}
