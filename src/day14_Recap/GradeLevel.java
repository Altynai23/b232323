package day14_Recap;

import java.util.Scanner;

public class GradeLevel {

    public static <Grad> void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();

        System.out.println("Enter you grade number");
        byte number = (byte)scan.nextInt();
        String gradeLevel = "";

        if (number >= 1 && number <= 18){

            gradeLevel = (number<=5)? "Elementary School" :(number<= 8)? "Middle School"
                       : (number<= 12)? "High School" :(number<= 16)? "College" : "Grade School";

        }else{
            gradeLevel = "Invalid";
        }

        System.out.println("gradeLevel = " + gradeLevel);

        scan.close();

    }




}
