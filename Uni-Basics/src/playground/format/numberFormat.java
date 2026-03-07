package playground.format;

import java.text.NumberFormat;

public class numberFormat {
    static void main(String[] args) {
        // Number format is a class
        // .get... is a method
        String result = NumberFormat.getPercentInstance().format(0.1);

        System.out.println("Percentage: " + result);
    }
}
