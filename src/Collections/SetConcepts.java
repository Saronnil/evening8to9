package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetConcepts {
    public static void main (String [] args){
        Set<Integer> s1 = new HashSet<Integer>();
        s1.add(23);
        s1.add(-56);
        s1.add(24);
        s1.add(-57);
        s1.add(20);
        s1.add(-56);
        System.out.println(s1);
        System.out.println(s1.isEmpty());
        System.out.println(s1.size());
        System.out.println(s1.contains(-5));
        s1.remove(23);
        System.out.println(s1);

        // converting sets to arrays
        Integer [] i1 = s1.toArray(new Integer[s1.size()]);
        System.out.println(Arrays.toString(i1));
        s1.clear();
        System.out.println(s1);
        Set <Integer> s2 = new HashSet<Integer>();
        s2.add(67);
        s2.add(68);
        s2.add(69);
        s2.add(65);
        s2.add(63);
        s2.add(61);
        s2.add(65);

        s1.addAll(s2);

        System.out.println(s1);
        s1.retainAll(s2);
        System.out.println(s1);
        s1.removeAll(s2);
        System.out.println(s1);
        // Iterate the data over the set use for each loop
        for(Integer i2:s2) //for(int i=0;i<s3.size();i++)
        {
            System.out.println(i2);
        }

        // Create Hetrogeneous set
        HashSet h2 = new HashSet();
        h2.add(10);
        h2.add("Hello");
        h2.add(20.5);
        h2.add('A');
        h2.add(true);

        System.out.println(h2);


    }
}
