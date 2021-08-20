package day07_ShortHand_Relational;

public class MarketGroups {

    public static void main(String[] args) {
        int score = 42;

        boolean earleBird = score >= 50;
        boolean group1 = score >= 40 && score <= 49;
        boolean group2 = score >= 30 && score <= 39;
        boolean angryBirds = score < 30;

        System.out.println("earleBird = " + earleBird);
        System.out.println("group1 = " + group1);
        System.out.println("group2 = " + group2);
        System.out.println("angryBirds = " + angryBirds);

        /*
        early birds: 50-60
        groiup1: 40-49
        group2: 30-39
        angry birds: <30
         */
    }
}
