package january30th2025;

public class ChildClass extends  ParentClass {

        public void circle(){
            System.out.println("Circle");
        }

        public void  rhombus(){
            System.out.println("Rhombus");
        }
        @Override
        public void Square(){
            super.Square();
            System.out.println("Square");
        }

        public static void main(String[] args) {
            ChildClass c = new ChildClass();
            c.Triangle();
            c.Square();
            c.circle();
            c.rhombus();


        }

    }




