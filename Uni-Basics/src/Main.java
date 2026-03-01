import java.awt.*;
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
            System.out.printf("Injection detected--------------> %s <--------------", userName);
        } else {
            System.out.printf("%s created successfully!", userName);
        }

    }
}
