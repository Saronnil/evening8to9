package january30th2025;

public class VariableConcepts {
    public static void main(String[] args) {
        // Variable are temporary storage for values.
        // It ill be stored during the execution of program
        // It will get destroyed once the execution is destroyed.
        // datatype variableName;
        // variableName should always start with small character , not Numbers .
        // It should not have whitespace instead use _
        // Do not use JAVA Keyword as variable name .
        // Java is Statically typed programming language

        //Different datatype in Java
        // primitive - int, char , boolean, double , float , byte , short
        // Non primitive - string, Arrays, List , Set etc.....


        boolean b1;  // accepts true or false  - 1 bit of memory
        int a1;  // 4 bytes
        char c1;   // accepts 'a' , 'A' , '3', ' ', '$' - 2 byte
        double d1;  // 8 bytes
        float f1;   // 5 significant digits 45.454543  - 4 byte
        short s1; // -32768 to 32768  - 2 byte
        byte b2;  // 128 to 128  - 1 byte
        long l1;   //8 byte

        b1 = true;
        a1 = 1;
        c1 = 'a';
        d1 = 1.0;
        f1 = 4.34f;  // float f
        s1 = 1;
        b2 = 127;
        l1 = 1435345345435L;  // Long L

        // from jdk 10 we have var variable

        var v1 = 40;
        System.out.println(v1);
         v1 = 'd';
         System.out.println(v1);
        System.out.println("The value of b1: " + b1);

    }
}
