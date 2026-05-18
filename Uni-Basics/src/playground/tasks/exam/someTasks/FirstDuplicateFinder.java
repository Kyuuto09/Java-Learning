package playground.tasks.exam.someTasks;

import java.util.ArrayList;

public class FirstDuplicateFinder {

    public static int findFirstDuplicate(int[] arr) {

        ArrayList<Integer> myList = new ArrayList<>();

        for (int num : arr) {
            if (!myList.contains(num)) {
                myList.add(num);
            } else {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 1, 2, 3, 5, 3, 2 }; // 2

        System.out.println(findFirstDuplicate(arr));

    }
}