package january30th2025;

public class MethodDeclaration {

    // creating a method
    public static void main(String[] args) {

        MethodDeclaration a1 = new MethodDeclaration();
        int n = a1.SumOfNumbers(12,23,34);
        System.out.println("Sum of numbers: " + n);

    }



  private  int  SumOfNumbers(int a, int b, int c) {
        return a+b+c;
       }

    //Syntax for method declaration
    // accessmodifier returntype methodname(argument to be passed)

    // AM defines the scope or visibility of method public , private , default , protected
}
