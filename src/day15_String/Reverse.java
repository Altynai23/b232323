package day15_String;

public class Reverse {

    public static void main(String[] args) {

        String word = "Blank"; //knalB
        //Index: 01234

        String result = ""; //knalB

        if(word.length()>5){
            result = "Too Long";
        }else if(word.length()<5){
            result = "Too Short";
        }else{ //if length of the string is 5
            result +=word.charAt(4);
            result +=word.charAt(3);
            result +=word.charAt(2);
            result +=word.charAt(1);
            result +=word.charAt(0);
        }


        result = ""+word.charAt(4) + word.charAt(3) +word.charAt(2) + word.charAt(1) +word.charAt(0);





        System.out.println("result = " + result);









    }





}
