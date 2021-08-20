package day17_String;

import java.util.Scanner;

public class AccountNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you account number");
        String account = scan.next();
        char firstChar = account.charAt(0);

        String result = "";

        switch (firstChar) {
            case '2': // if the first character of account is 2
                if (account.length() == 7) { // if length of account is 7
                    System.out.println("Valid Account");
                } else { // if length of account is not 7
                    System.out.println("INVALID: should be 7 characters long");
                }
                break;

            case '5': // the first character of account is 5
                if (account.length() == 10) {
                    System.out.println("Valid account");
                } else {
                    System.out.println("INVALID: should be 10 characters long");
                }
                break;

            default:
                System.out.println("INVALID: first character need to be 2 or 5");
        }

                System.out.println(result);

        /*
        if( account.length() == 7 || account.length() == 10){

            if(account.charAt(0) == '2' && account.length() == 7){ // if thr first character is 2 && has 7 characters in
                System.out.println("Valid Account");
            }else if (account.charAt(0) == '5' && account.length() == 10){
                System.out.println("Valid Account");
            }else{
                System.out.println("Invalid Account");
            }

        }else{
            System.out.println("Invalid Account");
        }

        */
        scan.close();
    }




}
