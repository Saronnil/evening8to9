package january30th2025;


class OurNames {
private String fname;
private String lname;
private String mname;

public void Ourdisplay(){
    System.out.println(fname);
    System.out.println(lname);
    System.out.println(mname);
    }

    public OurNames() {
        System.out.println("Inside OurNames constructor");
        fname = "John";
        lname = "Doe";
        mname = "Jane";
    }

    // parameterized constructor
    public OurNames(String firstname, String lastname, String middlename) {
        System.out.println("Inside OurNames parameterized constructor");
        fname = firstname;
        lname = lastname;
        mname = middlename;
    }


}
public class Constructors {
    public static void main(String[] args) {
        OurNames obj = new OurNames();
        obj.Ourdisplay();
        OurNames obj2 = new OurNames("Sukhbir", "Suryvanshi","Vitthal");
obj2.Ourdisplay();

    }
}
