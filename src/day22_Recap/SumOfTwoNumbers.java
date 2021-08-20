package day22_Recap;

import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "";

        do {
            System.out.println("Enter two numbers");
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();

            System.out.println("Addition: " + (n1 + n2));

            while (!(answer.equals("yes") || answer.equals("no"))) { // while the answer is invalid
                System.out.println("Do you want to continue?");
                answer = scan.next().toLowerCase();
            }

        /*
        //while (answer.equalsIgnoreCase("yes") || answer.equals("no")) )
        System.out.println("Invalid answer, Please re-enter!");
        System.out.println("Do you want to continue?");
        answer = scan.next().toLowerCase();
        }
        */

        }while (answer.equalsIgnoreCase("yes"));

        System.out.println("Thank you for using our calculator");
        scan.close();

    }


}
