package day05_ArithmeticOperators;

public class BirthDay {

    public static void main(String[] args) {
        String name = "Tugba",
                birthMonth = "May";

        int birthDay = 16,
                birthYear = 1992;

        System.out.println(name+" was born on "+birthMonth+"/"+birthDay+"/"+birthYear);

        int age = 2021 - birthYear;
        System.out.println(name+" is "+age+" years old");



    }
}
