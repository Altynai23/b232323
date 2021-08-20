package day25_ForEachLoop;

import java.util.Arrays;

public class ReverseElements {

    public static void main(String[] args) {
        String[] array = {"Java", "Python", "C#", "Cybertek", "School", "Selenium", "API"};

        for (int j = 0; j < array.length; j++) { // j: index numbers of the array (starting from 0)

        String element = array[0]; // element og the array
        // 0123
        String reverse = ""; // to store the reversed version of the element

        for (int i = element.length() - 1; i >= 0; i--) { // index number of the string
            reverse += element.charAt(i); //gets the characters from the string element
            // this inner loops is responsible for reversing the string
        }

        array[0] = reverse; // assigning reversed element to the index of the array

    }

        System.out.println(Arrays.toString(array));

    }


}
