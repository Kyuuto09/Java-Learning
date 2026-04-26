package playground.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Objects;

public class main {
    public static void main(String[] args) {

        ArrayList<String> people = new ArrayList<>();

        people.add("John");
        people.add("Jay");
        people.add("Doe");

        people.remove(1);

        System.out.println(people);

        String findName = "John";
        if (people.contains(findName)) {
            System.out.printf("Hey look %s is here!\n", findName);
        }

        people.clear();

        if (people.isEmpty()) {
            System.out.println("is empty");
        }

    }
}
