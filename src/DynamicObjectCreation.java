 import java.util.Scanner;

class ExampleClass {
    public ExampleClass() {
        System.out.println("ExampleClass object created!");
    }
}

class AnotherClass {
    public AnotherClass() {
        System.out.println("AnotherClass object created!");
    }
}

public class DynamicObjectCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the class name: ");
        String className = scanner.nextLine();

        try {
            // Dynamically load the class
            Class<?> cls = Class.forName(className);
            // Create an instance of the class
            Object obj = cls.getDeclaredConstructor().newInstance();
            System.out.println("Object of class " + className + " created: " + obj);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + className);
        } catch (Exception e) {
            System.out.println("Error creating object: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
{
}
