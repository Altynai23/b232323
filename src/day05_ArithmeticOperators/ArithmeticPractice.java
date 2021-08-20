package day05_ArithmeticOperators;

public class ArithmeticPractice {

    public static void main(String[] args) {
        int number = 300;

        boolean isEvenlyDivisibleBy3 = number%3 == 0; // ==; equal operaror
        //                             1 === 0 ===> false

        boolean isEvenlyDivisibleBy5 = number%5 == 0; // if the remainder of number/5 is zero, then itS even

        System.out.println(number+" is evenly divisible by 3; "+ isEvenlyDivisibleBy3);
        System.out.println(number+" isEvenlyDivisibleBy5 by 5" + isEvenlyDivisibleBy5);
    }
}
