package day17_String;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        String correctUserName = "Cybertek@gmail.com";
        String correctPassword = "Cybertek123";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you username");
        String username = scan.next();

        System.out.println("Enter you password");
        String password = scan.next();

        boolean canLogIn = username.equalsIgnoreCase(correctUserName) && password.equals(correctPassword);

        if(canLogIn){
            System.out.println("Login in successfully");
        }else{
            System.out.println("Invalid user name or password");
        }





    }



}
