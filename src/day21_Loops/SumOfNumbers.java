package day21_Loops;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;


        while (true){

            System.out.println("Enter a number");
            int n = scan.nextInt();

           if (n < 0){ // if user entered negative number
               break; // exits the loop
           }else{
               sum += n;
           }


        }

        System.out.println("sum = " + sum);

        scan.close();
    }

}
