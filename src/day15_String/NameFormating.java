package day15_String;

import java.util.Scanner;

public class NameFormating {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you first name");

        String firstName = scan.nextLine().trim(); // mUHtar
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();

        System.out.println("Enter you last name");
        String lastName = scan.nextLine().trim();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        String fullName = firstName+" "+lastName;

        System.out.println(fullName);





    }




}
