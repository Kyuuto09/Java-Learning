package playground.tasks.exam.someTasks;

import java.util.*;

public class leastFrequentCharacter {

    public static char solution(String text) {

        Map<Character, Integer> myMap = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);

            myMap.put(current, myMap.getOrDefault(current, 0) + 1);
        }

        int smallest = Integer.MAX_VALUE;
        char leastFrq = ' ';

        for (Character cha : myMap.keySet()) {
            int current = myMap.get(cha); // number

            if (current < smallest) {
                smallest = current;
                leastFrq = cha;
            }
        }

        return leastFrq;
    }

    public static void main(String[] args) {

        System.out.println(solution("banana"));
        // Expected: b

        System.out.println(solution("hello"));
        // Expected: h or e or o

    }
}