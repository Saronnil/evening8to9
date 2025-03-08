public class Arrays {
    public static void main(String[] args) {
        int [] student = new int [5];
        System.out.println(student.length);
        System.out.println(student);
        System.out.println(java.util.Arrays.toString(student));
        java.util.Arrays.fill(student, 5);
        System.out.println(java.util.Arrays.toString(student));

        int []b2 = java.util.Arrays.copyOf(student, 10);
        System.out.println(java.util.Arrays.toString(b2));
        java.util.Arrays.fill(b2,5,10,10);
        System.out.println(java.util.Arrays.toString(b2));
        int []b3 = java.util.Arrays.copyOf(b2, 20);
        System.out.println(java.util.Arrays.toString(b3));
        int []b4 = java.util.Arrays.copyOfRange(b3, 10, 20);
        System.out.println(java.util.Arrays.toString(b4));
        for (int i = 0 ; i < b4.length ; i++) {
            System.out.println(b4[i]);
        }
    }
}
