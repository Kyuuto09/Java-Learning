package lab2;

import java.util.Scanner;
import java.util.List;

public class secondTask {

    public static void checkTemp() {

        List<String> tempList = List.of("Very cold", "Cold", "Moderate", "High");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        int temp = sc.nextInt();

        /*
         * if (temp <= -10) {
         * System.out.println("Very cold");
         * } else if (temp < 0) {
         * System.out.println("Cold");
         * } else if (temp <= 25) {
         * System.out.println("Moderate");
         * } else {
         * System.out.println("Hot");
         * }
         */

        System.out.println(
                temp <= -10 ? tempList.get(0)
                        : temp < 0 ? tempList.get(1) : temp <= 25 ? tempList.get(2) : tempList.get(3));
    }

    public static void main(String[] args) {
        // temp check
        checkTemp();
    }
}
