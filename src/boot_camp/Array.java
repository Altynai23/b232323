package boot_camp;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        int[] numbers = new int[5]; // 0~5
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        // numbers[5] = 60;

        System.out.println(Arrays.toString(numbers));


        System.out.println("___________________________");

        int[] arr = {100, 200, 300, 400, 500};
        int[] reversed = new int[arr.length];

        for (int i = arr.length -1; i >=0; i--){
           reversed[i] = arr[i];
        }

        System.out.println(Arrays.toString(reversed));

    }

}
