package day13_Scanner;

import java.util.Scanner;

public class PersonalInfo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter you salary");
        int salary = scan.nextInt();

        System.out.println("Enter you gender");
        String gender = scan.next();

        System.out.println("Enter you full name");
        String fullName = scan.next();

        System.out.println("Enter you job title");
        String jobTitle = scan.next();
        

        System.out.println("salary = " + salary);
        System.out.println("gender = " + gender);
        System.out.println("fullName = " + fullName);
        System.out.println("jobTitle = " + jobTitle);





    }




}
