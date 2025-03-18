package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashsetConcepts {
    public static void main (String [] args){
        // preserves the Insertion order
       LinkedHashSet<Integer> s5 = new LinkedHashSet<Integer>();
       s5.add(33);
       s5.add(45);
       s5.add(67);
       s5.add(11);
        System.out.println(s5);
        s5.addFirst(1);
        s5.addLast(10);
        System.out.println(s5);
        System.out.println(s5.getFirst());
        System.out.println(s5.getLast());

        for (Integer i : s5)
        {
            System.out.println(i);
        }
        // Convert a set to a List
        List<Integer> l2 = new ArrayList<Integer>(s5);
        l2.add(55);
        l2.add(98);
        System.out.println(l2);
    }
}
