package day10_IfStatements;

public class ConvertNumberToWord {

    public static void main(String[] args) {
        // 0~9
        // zero, one, two, three, four, five, six, seven, eight, nine, invalid
        int n = 5;
        String word = "";

        if(n == 0){
            word = "Zero";
        }else if(n == 1){
            word = "One";
        }else if(n == 2){
            word = "Two";
        }else if(n == 3){
            word = "Three";
        }else if(n == 4){
            word = "Four";
        }else if(n == 5){
            word = "Five";
        }else if(n == 6){
            word = "Six";
        }else if(n == 7){
            word = "Seven";
        }else if(n == 8){
            word = "Eight";
        }else if(n == 9){
            word = "Nine";
        }else{
            word = "Invalid";
        }



    }



}
