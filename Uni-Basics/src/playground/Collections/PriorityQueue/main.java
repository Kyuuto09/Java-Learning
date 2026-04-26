package playground.Collections.PriorityQueue;

import java.util.PriorityQueue;

public class main {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // cool that it will remove the element by priority, it will remove the smallest element

        queue.offer(3);
        queue.offer(10);
        queue.offer(1);

        System.out.println(queue.poll()); // removes the smallest element; Lowest -> Highest

        System.out.println(queue);
    }
}
