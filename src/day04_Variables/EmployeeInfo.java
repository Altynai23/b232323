package day04_Variables;

public class EmployeeInfo {

    public static void main(String[] args) {

        String firstName = "Mousa";
        String lastName = "Adolai";
        String fullName = firstName + lastName;
        String gender = "Male";
        int age = 24;
        String companyName = "Microsoft";
        String jobTitle = "SDET";

        boolean isFullTime = true;
        boolean isMarried = true;
        int salary = 110000;

        //aaron king
        // Employee" full name is: Aaron King

        System.out.println("Employee full name is:" +fullName);

        System.out.println("fullName = " + fullName);

        // Aaron King is male
        // System.out.println ("Aaron King is male");
        System.out.println(fullName + "is"  +  gender);



        // fullName is age years old
        System.out.println(fullName + "is" + age + "years old");

    }
}
