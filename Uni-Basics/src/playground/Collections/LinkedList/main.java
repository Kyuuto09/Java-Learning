package playground.Collections.LinkedList;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {

        LinkedList<Integer> myList = new LinkedList<>();

        myList.add(10);
        myList.add(20);
        myList.add(30);

        //myList.remove(0);
        myList.remove(Integer.valueOf(10));

        System.out.println(myList);

        myList.push(10);
        System.out.println(myList.pop());

    }
}
