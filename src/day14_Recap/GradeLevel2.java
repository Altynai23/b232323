package day14_Recap;

import java.util.Scanner;

public class GradeLevel2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter you grade number");
        byte number = (byte)scan.nextInt();
        String gradeLevel = "";
        // switch does not accept: long, float, double, boolean



        switch (number){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                gradeLevel = "Elementary School";

            case 6:
            case 7:
            case 8:
                gradeLevel = "Middle School";
                break;

            case 9:
            case 10:
            case 11:
            case 12:
                gradeLevel = "High School";
                break;

            case 13:
            case 14:
            case 15:
            case 16:
                gradeLevel = "College";
                break;

            case 17:
            case 18:
                gradeLevel = "Grad School";
                break;

            default:
                gradeLevel = "Invalid";

                System.out.println("gradeLevel = " + gradeLevel);


        }






    }




}
