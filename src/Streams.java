import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main (String [] args){
        List <String> l1 = new ArrayList<String>();
        l1.add("Sara");
        l1.add("Sukhbir");
        l1.add("Ronnil");
        l1.add("Vitthal");

        Stream <String> s1 = l1.stream();

        // for each terminal operation
     s1.forEach((String i)-> System.out.println(i));
        // Donot reuse the stream objects in further operations
        //because Stream is one time use object and once the  data is processed in streams
        System.out.println("************************************************************************");
        // filter intermediate operation
      l1.stream().filter(s-> s.length()>5).forEach(s-> System.out.println(s));

        System.out.println("************************************************************************");

      l1.stream().filter(s->s.length()<5).forEach(s -> System.out.println(s));

        System.out.println("************************************************************************");

// map transform the data as per the given condition
        // it is an functiona interface
        // it is an imtermediate operation

        l1.stream().map(s->s.toUpperCase()).forEach(s-> System.out.println(s));
        System.out.println("************************************************************************");

        l1.stream().map(s -> s.substring(0,4)).forEach(s-> System.out.println(s));

        System.out.println("************************************************************************");

        // Sort is used to sort ascending order
        //it is an intermediate operation //

        l1.stream().sorted().forEach(s-> System.out.println(s));

        System.out.println("************************************************************************");

        // Skip is used to skip the data in the list
        // Intermediate operation

        l1.stream().skip(2).forEach(s-> System.out.println(s));

        System.out.println("************************************************************************");

        // Limit the size

        l1.stream().limit(9).forEach(s -> System.out.println(s));

        // Convert list to a set
        // collect() is used to convert the stream to any other collection or any data type
        // collect() is a supplier interface
         // act as an terminal and intermediate operation
        Set <String> s2 = l1.stream().collect(Collectors.toSet());
        System.out.println(s2);

        //List to comma seperated String
        String s = l1.stream().collect(Collectors.joining(":"));
        System.out.println(s);


        l1.stream().map(i->i.length()).forEach(i->System.out.println(i));
        List <Integer> m = l1.stream().map(i ->i.length()).collect(Collectors.toList());
        System.out.println(m);


Map<String,Integer> g = l1.stream().collect(Collectors.toMap((n)->n,(n) -> n.length()));
        System.out.println(g);

        System.out.println(l1.stream().allMatch(o-> o.length()>4));

        System.out.println(l1.stream().anyMatch(o -> o.length()>4));

        System.out.println(l1.stream().noneMatch(o -> o.length()>7));


    }
}
