package day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmupTasks {

    public static void main(String[] args) {
        ArrayList<Integer>List = new ArrayList<>();
        List.addAll(Arrays.asList( 1,2,3,4,5,6,7,8,9) );

        System.out.println(List);

        List.set(List.size()-1, 0);

        System.out.println(List);

        System.out.println("----------------------------------");

        ArrayList<Integer>List2 = new ArrayList<>( );
        List2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(List2);

        for (int i = 0; i < List2.size(); i++){ // i: index numbers of the List2
            if ( List2.get(i) % 2 != 0){ // if the elements is odd number
                List2.set(i,  List2.get(i)*2 );
            }
        }

        System.out.println(List2);


        System.out.println("--------------------------------------");
        String[] arr1 = {"A", "B", "C"},
                arr2 = {"D", "E", "F", "G"};

        ArrayList<String> result = new ArrayList<>( Arrays.asList(arr1));
        result.addAll( Arrays.asList(arr2));

        /*
        for (String each : arr1){
            result.add(each);
        }

        for (String each : arr2){
             result.add(each);
        }
         */

        System.out.println(result);


        System.out.println("----------------------------------------");
        int[] numbers = {1,2,3,4,5,6,7};
        ArrayList<Integer> List4 = new ArrayList<>();
        // List4.addAll( Arrays.asList(numbers) );

        for (int each : numbers){
            List4.add(each);
        }

        System.out.println(List4);





    }

}
