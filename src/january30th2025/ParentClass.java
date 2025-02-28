package january30th2025;

public class ParentClass {

   public void Triangle(){
       System.out.println("Triangle");
    }

    public void Square(){
        System.out.println("This is parent class Square");
    }

    public static void main(String[] args) {
       ParentClass p = new ParentClass();
       p.Triangle();
       p.Square();


}
}
