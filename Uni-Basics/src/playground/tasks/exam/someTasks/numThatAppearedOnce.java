package playground.tasks.exam.someTasks;

import java.util.*;

public class numThatAppearedOnce {

    public static ArrayList<Integer> solution(
            ArrayList<Integer> list) {

        ArrayList<Integer> myList = new ArrayList<>();
        Map<Integer, Integer> myMap = new HashMap<>();

        for (Integer num : list) {
            myMap.put(num, myMap.getOrDefault(num, 0)+1);
        }

        for (Integer num : myMap.keySet()) {
            int current = myMap.get(num);

            if (current == 1) {
                myList.add(num);
            }
        }

        return myList;
    }

    public static void main(String[] args) {

        System.out.println(solution(
                new ArrayList<>(Arrays.asList(
                        1,2,2,3,4,4,5))));
        // Expected: [1,3,5]

        System.out.println(solution(
                new ArrayList<>(Arrays.asList(
                        7,7,7))));
        // Expected: []

        System.out.println(solution(
                new ArrayList<>(Arrays.asList(
                        4, 25, 1, 1, 3, 5, 5, 4))));

    }
}