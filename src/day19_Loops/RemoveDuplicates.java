package day19_Loops;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String word = "aabbc";

        String result = ""; //"abc"

        if(word.length() ==5 ) {
            if (!result.contains("" + word.charAt(0))) { //'a'
                result += word.charAt(0);
            }
            if (!result.contains("" + word.charAt(1))) { //'a'
                result += word.charAt(2);
            }
            if (!result.contains("" + word.charAt(2))) { //'b'
                result += word.charAt(2);
            }
            if (!result.contains("" + word.charAt(3))) { //'b'
                result += word.charAt(3);
            }
            if (!result.contains("" + word.charAt(4))) { //'c'
                result += word.charAt(4);
            }

        }else if (word.length() >5){
            result = "Too Long";
        }else{ // word.length() <5
            result = "Too short";
        }


        System.out.println("result = " + result);





    }



}
