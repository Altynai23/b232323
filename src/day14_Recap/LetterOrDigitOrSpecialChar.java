package day14_Recap;

public class LetterOrDigitOrSpecialChar {

    public static void main(String[] args) {

        char ch = '0';

        boolean isDigit = ch >= '0' && ch <= '9';

        boolean isLetter = ( ch >= 'A' && ch <= 'Z') || (ch >='a' && ch<='z');

/*
        String result = "";
        if (isDigit){
            result = ch+"is digit";
        }else if (isLetter){
            result = ch+"is letter";
        }else{
            result = ch+"is special character";
        }
*/
        String result = (isDigit)? ch+ "is digit" :(isLetter)? ch+ "is letter" : ch+"is special character";

        System.out.println("Result");


    }


}
