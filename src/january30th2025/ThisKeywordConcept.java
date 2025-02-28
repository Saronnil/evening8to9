package january30th2025;

    class Players{

        // This is instance variable
        String name;
        int age;
        String country;

// This is local variable
        public Players(String name, int age, String country) {
            this.name = name;
            this.age = age;
            this.country = country;
        }

        public void display(){
            System.out.println(name + " " + age + " " + country);

        }
    }
public class ThisKeywordConcept {
    public static void main(String[] args) {

        Players p1 = new Players("Sukhbir",4,"India");
    p1.display();
    }

}
