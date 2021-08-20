package day17_String;

import java.util.Scanner;

public class Initial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you first name");
        String firstName = scan.next(); // daniel
        System.out.println("Enter you last name");
        String lastName = scan.next(); // john

        String initial = firstName.substring(0,1).toLowerCase()+"."+lastName.substring(0,1).toUpperCase();
                         // d. j.
       //String initial = firstName.charAt(0)+"."+lastName.charAt(0);
        //initial = initial.toUpperCase();

        //String initial = firstName.toUpperCase().charAt(0)+"."+lastName.toUpperCase().charAt(0);

        System.out.println("initial = " + initial);


    }




}
