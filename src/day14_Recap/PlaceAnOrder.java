package day14_Recap;

import java.util.Scanner;

public class PlaceAnOrder {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter product name");
        String productName = scan.nextLine();

        System.out.println("Enter the price");
        double price = scan.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = scan.nextInt();

        double totalPrice = price * quantity;

        scan.nextLine();

        System.out.println("Enter you first name");
        String firstName = scan.next();

        scan.close();

        System.out.println(firstName+", your order for "+quantity+""+productName
                            +" has been placed. your total is $"+totalPrice+".");






    }


}
