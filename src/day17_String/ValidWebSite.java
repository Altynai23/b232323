package day17_String;

import java.util.Scanner;

public class ValidWebSite {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your website: ");
        String data = scan.next();

        String message = "";

        boolean isValidURL = data.startsWith("www.") &&(data.endsWith(".com") ||data.endsWith(".edu")||data.endsWith(".gov"));
        if (isValidURL){
            message = "Valid web address ";
        }
        else {
            message = "Invalid web address ";

        }
        scan.close();



    }

}
