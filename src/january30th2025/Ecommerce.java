package january30th2025;

public class Ecommerce {
    private String Username;
    private String Password;

    public Ecommerce() {

    }

    public Ecommerce (String Username, String Password )
    {
        this.Username = Username;
        this.Password = Password;
    }
    public Ecommerce logintoapplication(){
        System.out.println("Login to application" + Username);
        return this;
    }

    public Ecommerce searchproduct(){
        System.out.println("Search product");
        return this;
    }
    public Ecommerce Selectproduct(){
        System.out.println("Select product");
        return this;
    }
    public Ecommerce Addproduct(){
        System.out.println("Add product");
        return this;
    }
    public Ecommerce Payment(){
        System.out.println("Payment");
        return this;
    }
    public Ecommerce Logout(){
        System.out.println("Logout");
        return this;
    }




}
