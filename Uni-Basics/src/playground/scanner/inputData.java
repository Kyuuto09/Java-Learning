package playground.scanner;

import java.util.Scanner;

public class inputData {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        // String name = scanner.next();
        // when we use .next() and if i write Volodymyr M., M part will not output because next reads things in tokens.
        String name = scanner.nextLine().trim();

        System.out.println("You are: " + name);
    }
}
