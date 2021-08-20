package day18_Recap;

import java.util.Scanner;

public class EmailTask2 {

    public static void main(String[] args) {
        System.out.println("Enter you email:");
        String email = new Scanner(System.in).next();

        int indexOf_ = email.indexOf("_");
        int indexOfAt = email.indexOf("@");

        String firstName = email.substring(0, indexOf_); //craig

        firstName = ( ""+firstName.charAt(0)).toUpperCase() + firstName.substring(1).toLowerCase();

        System.out.println("firstName = " + firstName);

        String lastName = email.substring(indexOf_ +1, indexOfAt); //federight

        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println("lastName = " + lastName);

        String domain = email.substring(indexOfAt + 1, email.indexOf(".") );

        System.out.println("domain = " + domain);


    }


}
