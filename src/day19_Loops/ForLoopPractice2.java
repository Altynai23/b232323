package day19_Loops;

public class ForLoopPractice2 {

    public static void main(String[] args) {
        // A ~ Z
        for (int i = 65; i <=91; i++){
            System.out.println((char)i+" ");
        }

        System.out.println();

        System.out.println("---------------------------------------------");
        // A ~ Z
        for (char i = 'A'; i <='Z'; i++){
            System.out.println(i+" ");
        }

        System.out.println();

        System.out.println("----------------------------------------------");

        for (char i = 'Z'; i <= 'A'; i--){
            System.out.println(i+" ");
        }

        System.out.println();

        System.out.println("-------------------------------------------");

        // print the characters from 1000~3000 in same line separated by a space

        for (char i = 10000; i <= 60000; i++){
            System.out.println(i+" ");
        }



    }

}
