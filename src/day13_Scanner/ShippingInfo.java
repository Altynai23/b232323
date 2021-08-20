package day13_Scanner;

import java.util.Scanner;

public class ShippingInfo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter you salary");
        int salary = scan.nextInt(); // 100000

        System.out.println("Enter you gender");
        String gender = scan.next(); // Male
        
        scan.nextLine(); // EnterEnter

        System.out.println("Enter you full name");
        String fullName = scan.nextLine(); //Jon JonesEnter

        System.out.println("Enter you job title");
        String jobTitle = scan.nextLine();

        System.out.println("salary = " + salary);
        System.out.println("gender = " + gender);
        System.out.println("fullName = " + fullName);
        System.out.println("jobTitle = " + jobTitle);






    }




}
