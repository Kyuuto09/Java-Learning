package playground.tasks.exam.someTasks;

import java.util.ArrayList;

public class UniquePreservingOrder {

    public static ArrayList<Integer> uniquePreservingOrder(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int currentNum = arr[i];

            if (!list.contains(currentNum)) {
                list.add(currentNum);
            }
        }

        return list;
    }

    public static void main(String[] args) {

        int[] arr = { 3, 1, 3, 2, 1 }; // output [3, 1, 2]

        System.out.println(uniquePreservingOrder(arr));

    }
}
