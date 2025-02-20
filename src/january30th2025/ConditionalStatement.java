package january30th2025;

public class ConditionalStatement {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 5;
        String result = "";
        if (a+b > c * 5){
            result = "Condition 1";
            }
        else if (a*2 < b/2){
            result = "Condition 2";
        }else if ((a+b+c)% 3 == 0){
            result = "Condition 3";
        }else {
            result = "No condition Met";
        }
        System.out.println(result);

        System.out.println("******************************************************************");

        int x= 15,y=30,z=10;
        String result2 = "";

        if(x * y -z > 100) {
            if (y / x + z == 12) {
                result2 = "Nested True";
            } else {
                result2 = "Inner Else";
            }
        } else if (z*2< x) {
            result2 = "Else if block";
            }else {
            result2 = "Outer else";
        }
        System.out.println(result2);

        String st1 = "hello";
        String st2 = "Hello";
        String result3 = "";
        if (st1.equals(st2)) {
            result3 = "Equal";
        }else if (st1.equalsIgnoreCase(st2) && st1.length() == st2.length()) {
            result3 = "Ignore Case Equal";
        } else if (st1.length() == st2.length() || st2.charAt(0) == 'H') {
            result3 = "Length or First char";
        }else{
            result3 = "No Match";
        }
        System.out.println(result3);
    }
}
