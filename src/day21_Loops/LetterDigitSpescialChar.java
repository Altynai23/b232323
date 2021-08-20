package day21_Loops;

public class LetterDigitSpescialChar {

    public static void main(String[] args) {

        String input = "mn@#123Ab";

        String letters = ""; //mnAb
        String digits = ""; //123
        String specialChars = ""; //@#!


        for (int i = 0; i < input.length()-1; i++){
            char each = input.charAt(i); // get each characters from the string

            if (each >= 'A' && each <= 'Z'){ //if the characters is upper case letter
                letters += each;
            }else if (each >='a' && each <= 'z'){ //if the characters is lower case letter
                letters += each;
            }else if (each >='0' && each <= '9'){ // if the characters is digit
                digits += each;
            }else{ // if the character is special char
                specialChars += each;

            }
        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);


    }

}
