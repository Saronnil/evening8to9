package january30th2025;

public class MethodChaining {
    public static void main(String[] args) {
        Ecommerce e2 = new Ecommerce("sukhbir","1212");
        e2.logintoapplication().Payment().Logout().Addproduct().Selectproduct().searchproduct();
    }
}
