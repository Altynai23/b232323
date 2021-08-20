package day29_ReturnMethods;

import java.util.Arrays;

public class ReturnMethodsPractice3 {


    public static void main(String[] args) {

        String str = "AAABBBBCCCCCDDDDDDDDDEEEEEEEEEEEEFFFFFFFFFF";
        String[] arr = str.split("");
        char[] arr2 = str.toCharArray();

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        String result = removeDuplicates(str);

        System.out.println(result);


    }


    public static String removeDuplicates(String str){ //"AABBBBCCCCCC"
        String result = ""; //"ABC"

        for (String each : str.split("")){ //{"A","A"..."C"
            if (!result.contains(each)){ // if the character is not conatined in the result
                result += each; // add the character to the result
            }
        }

        return result;
    }



}


