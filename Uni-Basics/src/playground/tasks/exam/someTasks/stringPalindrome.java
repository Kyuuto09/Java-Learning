package playground.tasks.exam.someTasks;

import java.util.*;

public class stringPalindrome {

    public static boolean solution(String text) {

        int right = text.length() - 1; // 5
        int left = 0; // 0

        while (right-left > 0) {

            if (text.charAt(right) != text.charAt(left)) { // 1 ? 4
                return false;
            }

            right--;
            left++;
        }

        return true;
    }

    public static void main(String[] args) {

        String test = "123";
        System.out.println(test.length());

        System.out.println(solution("radar"));
        // Expected: true

        System.out.println(solution("java"));
        // Expected: false

        System.out.println(solution("abba"));
        // Expected: true

        System.out.println(solution("abcba"));
        // Expected: true

    }
}
