package BreakOut;

import java.util.Scanner;

public class Grocery_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;

        System.out.println("Shop items from Shop and total the price of each item:");

        while (true) {
           total = total + sc.nextDouble();
            System.out.println("Do you want to proceed to billing counter");
            if (sc.next().equalsIgnoreCase("Yes")) {
                System.out.println("Total price is $" + total);
                System.out.println("Select the payment method:");
                if (sc.next().equalsIgnoreCase("card")) {
                    System.out.println("Make payment of " + total+" via card");
                    break;
                }
                else if (sc.next().equalsIgnoreCase("cash")) {
                    System.out.println("Make payment of " + total+" via cash");
                    break;
                }
                break;
                }
else    {
    System.out.println("Keep shopping the item");
            }
        }
    }
}
