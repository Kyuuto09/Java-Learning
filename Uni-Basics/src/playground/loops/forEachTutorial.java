package playground.loops;

public class forEachTutorial {

    final static String[] fruits = {"Apple", "Mango", "Banana", "Coconut", "Strawberry"}; // 5 items

    static void main(String[] args) {
        System.out.println("--For loop--");
        for (int i = 0; i < fruits.length; i++) {
            System.out.printf("%d: %s \n", i, fruits[i]);
        }

        System.out.println("--For each loop--");

        // I found what I've been wanting to find after coding in python
        // but here there's no index access ! so for loop is much better for tinkering
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
