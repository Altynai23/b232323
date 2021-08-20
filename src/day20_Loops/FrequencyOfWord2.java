package day20_Loops;

public class FrequencyOfWord2 {

    public static void main(String[] args) {

        String sentence = "Python Python";
        int count = 0;
        // "Python"

        for(int i = 0; i <= sentence.length() -1; i++){
            String each = sentence.substring(i, i+6);
            //                    0, 6
            //                    1,
            if (each.equals("Python")){ // if the word python is occured
                count++;  // increase the county by 1
            }
            
            
        }
        System.out.println("count = " + count);


    }


}
