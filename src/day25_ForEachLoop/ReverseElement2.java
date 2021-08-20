package day25_ForEachLoop;

public class ReverseElement2 {

    public static void main(String[] args) {


        String[] array = {"Java", "Python", "C#", "Cybertek", "School", "Selenium", "API"};

        for (String element : array){

            String reverse = "";
            for (int i = element.length() - 1; i >= 0; i--) { // index number of the String
                reverse += element.charAt(i); //gets the characters from the string element
                // this inner loops is responsible for reversing the string
            }

            System.out.println(reverse);

        }



    }
}
