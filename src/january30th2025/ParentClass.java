package january30th2025;

import january30th2025MultilevelInheritance.GrantParentClass;

public class ParentClass extends GrantParentClass {

   public void Triangle(){
       System.out.println("Triangle");
    }

    public void Square(){
        System.out.println("This is parent class Square");
        Vehicle();
    }

    public static void main(String[] args) {
       ParentClass p = new ParentClass();
       p.Triangle();
       p.Square();



}
}
