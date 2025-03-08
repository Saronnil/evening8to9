public class StringBuildersConcepts {
    public static void main(String[] args) {

        StringBuilder s1 = new StringBuilder("Hello Sukhbir");
         s1.append(" World");
         System.out.println(s1);
         s1.reverse();
         System.out.println(s1);
        s1.insert(0, "Hello");
        System.out.println(s1);
        s1.delete(5,24);
        System.out.println(s1);
        s1.ensureCapacity(500);
        System.out.println(s1);
        System.out.println(s1.length());

    }
}
