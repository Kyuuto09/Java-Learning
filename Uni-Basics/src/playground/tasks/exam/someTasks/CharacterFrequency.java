package playground.tasks.exam.someTasks;

import java.util.Map;
import java.util.HashMap;

public class CharacterFrequency {

    public static Map<Character, Integer> countCharacterFrequency(String text) {

        Map<Character, Integer> output = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char cha = text.charAt(i);

            if (output.containsKey(cha)) {
                int lastScore = output.get(cha);
                output.put(cha, lastScore + 1);
            } else {
                output.put(cha, 1);
            }
        }

        return output;
    }

    public static void main(String[] args) {

        String text = "banana";

        System.out.println(countCharacterFrequency(text));

    }
}