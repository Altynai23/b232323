package day08_ifStatements;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {
        int score = 75;

        if(score >= 90 && score <= 100){ // 90, 91, 92, 93, 94.....100
            System.out.println("Excellent, You made A");
        }


        if (score>=80 && score < 89){ // 80, 81, 82, 83, 84... 89
            System.out.println("Good job, you made a B");
        }

        if(score>=70 && score <=79){
            System.out.println("Good, You made a C");
        }

       if (score>=60 && score <= 69){
           System.out.println("You made a D");
       }

       if (score < 60){
           System.out.println("Failed");
       }


    }
}
