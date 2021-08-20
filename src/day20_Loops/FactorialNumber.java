package day20_Loops;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {

        System.out.println("Enter a number");
        int number = new Scanner(System.in).nextInt(); //5 * 4 * 3 *2 * 1
        int result = 1; //

        for(int i = number; i >= 1; i-- ){ //i: 5, 4, 3, 2, 1
            result *= i;
        }

        System.out.println("result = " + result);




    }


}
