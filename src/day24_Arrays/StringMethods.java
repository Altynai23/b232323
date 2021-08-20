package day24_Arrays;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {
        //split
        String sentence = "I love learning java programming language";

        String[] word = sentence.split("");

        System.out.println(Arrays.toString(word));

        for (int i = word.length-1; i >= 0; i--){
            System.out.println(word[i]+" ");
        }

        System.out.println();

        String email = "James@gmail.com";

        String[] arrays = email.split("@"); //{James, gmail.com}
        System.out.println(Arrays.toString(arrays));

        String firstname = arrays[0];

        System.out.println("firstname = " + firstname);

        // toCharArray()

        String str = "ABCDE!@#$";
        char[] characters = str.toCharArray();

        System.out.println( Arrays.toString(characters));



    }

}
