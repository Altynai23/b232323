package day13_Scanner;

import java.util.Scanner;

public class NextLineMethod {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you job title");
        String jobTitle = scan.next();

        scan.next();

        System.out.println("Enter you gender");
        String gender = scan.next();

        System.out.println("jobTitle = " + jobTitle);
        System.out.println("gender = " + gender);
        
        
        
        
    }



}
