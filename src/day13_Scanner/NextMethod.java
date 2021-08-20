package day13_Scanner;

import java.util.Scanner;

public class NextMethod {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you first name");
        String firstName = scan.next(); // only takes the first world

        System.out.println("Enter you last name");
        String lastName = scan.next(); // only takes the first world

        String fullName = firstName +" "+ lastName;

        System.out.println("fullName = " + fullName);

        System.out.println("Enter you address");
        String address = scan.next(); //7922

        System.out.println("address = " + address);

        String gender = scan.next(); //Jones
        String state = scan.next(); //Branch
        String city = scan.next();

        System.out.println("gender = " + gender);
        System.out.println("address = " + address);
        System.out.println("fullName = " + fullName);


    }




}
