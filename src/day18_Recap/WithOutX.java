package day18_Recap;

import java.util.Scanner;

public class WithOutX {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();

        //if (word.startsWith("x"));
        if ( word.charAt(0) == 'x' ){
            System.out.println( word.substring(1) );
        }else{
            System.out.println(word);
        }


        scan.close();

    }



}
