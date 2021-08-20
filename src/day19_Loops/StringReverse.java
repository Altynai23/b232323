package day19_Loops;

public class StringReverse {

    public static void main(String[] args) {
        String name = "Muhtar";
        //index:       012345

        String reverseName = ""; //rathuM

        for (int i = 5; i >= 0; i--){
            reverseName += name.charAt(i); // getting the character starting from last index to index 0
        }

        System.out.println(reverseName);

    }

}
