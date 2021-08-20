package day07_ShortHand_Relational;

public class EligibleToVote {

    public static void main(String[] args) {
        String name = "Aaorn King";

        int age =34;
        String citizen = "UK";

        boolean eligibleToVote = age >= 18  &&  citizen == "USA";
        //                        34 >= 18  &&  "UK" == "USA"
        //                          true && false
        //                          false

        System.out.println(name+ "is eligible to vote for Biden: "+eligibleToVote);






    }
}
