package playground.tasks.exam.someTasks;

import java.util.*;

public class wordFrqCounterReturn {

    public static String solution(String text) {

        String[] arr = text.split(" ");

        Map<String, Integer> myMap = new HashMap<>();

        for (String word : arr) {

            if (myMap.containsKey(word)) {
                int oldScore = myMap.get(word);
                myMap.put(word, oldScore+1);
            } else {
                myMap.put(word, 1);
            }
        }

        String frq = "";
        int count = 1;

        for (String word : myMap.keySet()) {
            if (myMap.get(word) > count) {
                count = myMap.get(word);
                frq = word;
            }
        }

        return frq;
    }

    public static void main(String[] args) {

        String text = "bird cat bird dog cat bird bird dog cat";

        System.out.println(
                solution(text)
        );

    }
}