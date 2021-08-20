package day12_Scanner;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the width of rectangle");
        int width = scan.nextInt();
        System.out.println("Enter the lenght of rectangle");
        int lenght = scan.nextInt();
        
        int area = width*lenght;
        int perimeter = (width+lenght) * 2;
        
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
        
        
    }
    
    
    
    
    
    
    
}
