public class StaticKeyword {
    // Static methods and static variables are always binded to the class
    // any static methods and variables will never be part of the object /heap memory
    // Non static methods and non static variable are always binded to object/heap memory

    class  Cars {
        String model;
        String colour;
        double price;
        static int noofwheels = 4 ; // no need to create object to access this variable as it is same for all cars.

        public void display(){
            System.out.println("Model is "+ model + "Colour is " + colour + "Price is "+ price);
        }
    }


    public void main(String[] args){

        Cars c1 = new Cars();
        c1.colour = "Black";
        c1.model = "Jeep";
        c1.price = 12342234;

        c1.display();

    }
}
