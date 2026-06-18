package playground.tasks.exam.someTasks;

public class textReverse {

    public static boolean solution(String text) {

        String reversed = "";

        for (int i = text.length()-1; i >= 0; i--) {
            char lastChar = text.charAt(i); // 1

            reversed += lastChar; // level
        }

        return reversed.equals(text);
    }

    public static void main(String[] args) {

        System.out.println(solution("level"));

    }
}
