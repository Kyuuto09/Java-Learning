package playground.Collections.HashMap;

import java.util.HashMap;

public class main {

    public static void main(String[] args) {

        HashMap<String, Integer> populationByCity = new HashMap<>();

        populationByCity.put("Nagoya", 230021);
        populationByCity.put("Tokyo", 2323232);
        populationByCity.put("Kyoto", 123334);

        Integer population = populationByCity.get("Tokyo");

        System.out.println(population);

        if (populationByCity.containsKey("Tokyo")) {
            System.out.println("We got TOKYO!!!");
        }

        populationByCity.keySet();
        populationByCity.values();
        populationByCity.entrySet();
    }
}
