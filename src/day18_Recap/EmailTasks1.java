package day18_Recap;

import java.util.Scanner;

public class EmailTasks1 {

    public static void main(String[] args) {

        String email = new Scanner(System.in).next();
        int indexOf_ = email.indexOf("_"); // returns the index number of the underscore from the mail
        int indexOfAt = email.indexOf("@"); // return the index number of @ in email

        String firstName = email.substring(0, indexOf_);

        String lastName = email.substring(indexOf_ +1, indexOfAt);

        String remaining = email.substring(indexOfAt);

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("remaining = " + remaining);

        String result = lastName+"_"+firstName+remaining;

        System.out.println(result);


    }

}
