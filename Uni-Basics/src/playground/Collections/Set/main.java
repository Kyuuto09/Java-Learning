package playground.Collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class main {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        // no identical, only one can be kept
        set.add(10);
        set.add(10);
        set.add(30);

        System.out.println(set);

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
    }
}
