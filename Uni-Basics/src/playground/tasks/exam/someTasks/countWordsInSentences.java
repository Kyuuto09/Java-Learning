package playground.tasks.exam.someTasks;

import java.util.*;

public class countWordsInSentences {

    public static int solution(String text) {

        String[] words = text.split(" ");

        if (text.isEmpty()) {
            return 0;
        }

        return words.length;
    }

    public static void main(String[] args) {

        String text = "";

        System.out.println(solution(text));
    }
}
