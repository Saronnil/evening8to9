package january30th2025;

class Names {
  String firstname;
 String lastname;
  int age;
  String gender;

 public void display(){
     System.out.println("My Fistname is " + firstname);
     System.out.println("My Lastname is " + lastname);
     System.out.println("My Age is " + age);
     System.out.println("My Gender is " + gender);
 }
}

class PhoneNumbers {
 String CountryCode;
 String PhoneNumber;
 String AreaCode;

 public void DisplayPhonenumbers(){
     System.out.println("Country Code is " + CountryCode);
     System.out.println("Phone Number is " + PhoneNumber);
     System.out.println("Area Code is " + AreaCode);

 }

}

public class ObjectsCreation {
    public static void main(String[] args) {
            Names n1 = new Names();
            n1.firstname = "John";
            n1.lastname = "Doe";
            n1.age = 18;
            n1.gender = "Male";
            n1.display();

            Names n2 = new Names();
            n2.firstname = "Sara";
            n2.lastname = "Doe";
            n2.age = 20;
            n2.gender = "Female";
            n2.display();

            n1= n2 ;

            PhoneNumbers n3 = new PhoneNumbers();

            n3.AreaCode = null;
            n3.CountryCode = "+01";
            n3.PhoneNumber = "123-456-789";
        n3.DisplayPhonenumbers();

            PhoneNumbers n4 = new PhoneNumbers();
               
        n4.AreaCode = null;
        n4.CountryCode = "+01";
        n4.PhoneNumber = "126-456-789";
    // updating the object reference
        n4 = n3 ;
        n4.DisplayPhonenumbers();



    }


}
