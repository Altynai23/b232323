package day23_Arrays;

public class FrequencyOfEachCharacters {

    public static void main(String[] args) {

        String str = "aabccc";

        // step 1
        String removeDup = ""; //abc
        for (int i = 0; i <= str.length()-1; i++){
            char ch = str.charAt(0);

            if ( removeDup.contains( ""+ch) ){ // if the characters already contained removeDup
                continue; // skip it
            }

            removeDup += ch;
        }

        String result = ""; //a2b1c3
                            //a b c
                            //2 1 3

        // step3
        for (int j = 0; j <= removeDup.length()-1; j++) { // outer loops is used for getting each characters from string removeDup

            // step2
            char ch = removeDup.charAt(0); //'a', 'b', 'c'
            int frequency = 0; // for the frequencies of ch: 2 1 3
            for (int i = 0; i <= str.length() - 1; i++) { // inner loops is responsible for returning the frequency of ch
                char each = str.charAt(i);
                if (each == ch) {
                    frequency++;
                }
            }

            result += "" + ch + frequency;

        }


        System.out.println(result);
    }



}
