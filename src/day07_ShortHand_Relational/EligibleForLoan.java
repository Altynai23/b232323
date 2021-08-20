package day07_ShortHand_Relational;

public class EligibleForLoan {

    public static void main(String[] args) {
        String name = "Randy";
        int age = 49;
        int workHistory = 7;
        int creditScore = 760;
        double income = 45000;

        boolean isEligible = age >= 18 &&workHistory >= 2 && creditScore >= 700 && income >=60000;
        //                    49 >= 18  && 7 >= 2 && 760 >= 700 && 45000 >= 6000
        //                       true   &&  true  &&    true    &&     true
        //                       true

        System.out.println(name + " is eligible for loan: "+isEligible);



    }
}
