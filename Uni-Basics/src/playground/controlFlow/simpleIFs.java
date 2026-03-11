package playground.controlFlow;

public class simpleIFs {
    public static void main(String[] args) {
        int income = 120_000;
        // boolean hasHighIncome = (income > 100_000);

        // System.out.println(hasHighIncome);

        String className = income >= 100_000 ? "Fist class" : "Economy";

        System.out.println(className);
    }
}
