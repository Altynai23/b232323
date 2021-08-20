package day13_Scanner;

import java.util.Scanner;

public class CentsToDollars {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter Cents");
        int cents = scan.nextInt(); // 225 ===2
        int dollars = cents / 100; // 2
        int reminder = cents % 100; //25

    if (cents>=0){ // if the input is valid


        if (reminder == 0) {
            System.out.println(cents + " is equal to " + dollars + " dollars");
        }else {
            System.out.println(cents + " is equal to " + dollars + " dollars and "+reminder+"cents");
        }
    }else{ // if the input is not valid
        System.out.println("Invalid Amount");

    }
    }





}
