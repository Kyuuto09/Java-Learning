import java.awt.*;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Primitive type
        byte myAge = 18;
        float price = 9.99f;

        // Reference type (need to allocate memory)
        Date now = new Date();
        System.out.println("Current date: " + now);

        //
        Point point1 = new Point(1, 2);
        Point point2 = point1;
        point1.x = 2;

        System.out.println(point2);

    }
}
