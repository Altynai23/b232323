package day13_Scanner;

import java.util.Scanner;

public class NextMethod2 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); 
        
        System.out.println("Enter you age");
        int age = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter you job title");
        String jobTitle = scan.nextLine();

        System.out.println("age = " + age);
        System.out.println("jobTitle = " + jobTitle);
        
        
        
        
    }
    
    
    
    
}
