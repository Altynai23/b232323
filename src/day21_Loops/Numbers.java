package day21_Loops;

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scan.nextInt(); //100

        if (n<0){
            System.out.println("Invalid Number");
            System.exit(0); // terminates the system
        }

        String result1 = "Disable byn 15: ";
        String result2 = "Disable byn 5: ";
        String result3 = "Disable byn 3: ";

        for (int i =-1000; i <= n; i++){ // i:1,2,3,4,5...100

            if (i%15 ==0){
                result1 += i+"";
            }else if (i%5 ==0){
                result2 += i+" ";
            }else if (i%3 ==0){
                result3 += i+ " ";
            }

        }

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);



        scan.close();
    }

}
