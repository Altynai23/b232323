package day24_Arrays;

import java.util.Arrays;

public class ClassMates {
    public static void main(String[] args) {

        String[] classmates = {"Gulistan", "Feruza", "Ahmet", "Mehmet", "Muhtar", "Tamara", "Abbos",
                "Shirin", "Robinson", "Shirin"};

        System.out.println(Arrays.toString(classmates));

        for (int i = 0; i < classmates.length; i++){
            System.out.println( classmates[i].substring(0, 3) );
        }


    }



}
