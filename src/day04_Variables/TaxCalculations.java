package day04_Variables;

public class TaxCalculations {

    public static void main(String[] args) {

        int salary = 100000;
        double stateTax = 0.08;
        double federalTax = 0.21;

        double totalStateTax = salary * stateTax;
        double totalFederalTax = salary * federalTax;
        double salaryAfterTax = salary - totalStateTax -totalFederalTax;

        System.out.println("You salary is" + salary);

        // You need to pay totalStateTax to state tax
        System.out.println("You need to pay $"+ totalStateTax + "of stateTax");

        // You need to pay totalStateTax of federal tax
        System.out.println("you need to pay $"+ totalFederalTax + "of federalTax");

        // You take home salary is salaryAfterTax
        System.out.println("Your take home salary is "+salaryAfterTax);



    }
}
