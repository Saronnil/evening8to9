package Collections;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ListConcepts {
    public static void main (String [] args){
        List <String> li = new ArrayList<String>();
        List <String> ko = new ArrayList<String>();

        li.add("My");
        li.add("Name is Sukhbir");
        li.add(null);
        System.out.println(li);
        System.out.println(li.size());
        li.add(2,"we");
        System.out.println(li.contains("Myw"));
        System.out.println(li.isEmpty());
        System.out.println(li.getFirst());
        System.out.println(li.getLast());
        li.set(2,"Ronnil");
        System.out.println(li);
        System.out.println(li.reversed());
        System.out.println(li);
        li.addFirst("We");
        System.out.println(li);
        System.out.println(li.size());
        System.out.println(li.remove(2));
        System.out.println(li);

        li.clear();

        List <String> bl = new ArrayList<String>();
        bl.add("Tomorrow");
        bl.add("is");
        bl.add("Holiday");
        li.addAll(bl);
        System.out.println(li);
        li.retainAll(bl);
        li.removeAll(bl);
        System.out.println(li);
        bl.removeIf(s->s.length()>4);
        System.out.println(bl);

        // iterate over the list
        System.out.println("Iterate over the list");
        for(int i = 0;i< bl.size();i++)
        {
            System.out.println(bl.get(i));
        }

    }
}
