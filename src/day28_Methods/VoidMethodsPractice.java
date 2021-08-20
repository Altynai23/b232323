package day28_Methods;

import java.time.LocalDate;
import java.util.Scanner;

public class VoidMethodsPractice {

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // printOddNumber(scan.nextInt(), scan.nextInt() );

        printOddNumber(100, 125);

        // printEvenNumber("12", "25");
        printEvenNumber(100, 200);

        calculateAge(1990, 2021);

        System.out.println("------------------------------------------------");

        eligibleToVote(42, false);

        System.out.println("-------------------------------------------------");

        calculate(10, '%', 2);

    }


    public static void printOddNumber(int from, int to){

        for (int i = from; i <= to; i++  ){
            if ( i %2 != 0 ){
                System.out.println(i+" ");
            }
        }

        System.out.println();

    }

    public static void printEvenNumber(int from, int to) {

        for (int i = from; i <= to; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }

        System.out.println();
    }

        public static void calculateAge (int birthYear, int currentYear){
            System.out.println("Your age is: "+ (currentYear - birthYear));
        }

        public static void eligibleToVote(int age, boolean isUSCitizen){

            if (age >= 21 && isUSCitizen){
                System.out.println("Your are eligible to vote");
            }else{
                System.out.println("Your are not eligible to vote");
            }
        }

        public static void calculate(int num1, char operator, int num2){ // +, -, *, /, %

            switch (operator){
                case '-':
                    System.out.println("Subtraction: " + (num1 - num2));
                    break;

                case '+':
                    System.out.println("Addition: " + (num1 + num2));
                    break;

                case '*':
                    System.out.println("Multiplication: " + (num1 * num2));
                    break;

                case '/':
                    System.out.println("Division: " + (num1 / num2));
                    break;

                case '%':
                    System.out.println("Remainder: " + (num1 % num2));
                    break;

                default:
                    System.out.println("Invalid Operator");

            }

        }



}
