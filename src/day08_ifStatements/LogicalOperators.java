package day08_ifStatements;

public class LogicalOperators {

    public static void main(String[] args) {

        System.out.println( !true ); // false
        System.out.println( !false ); // true

        System.out.println( true == !false );
        //                  true == true

        System.out.println( true != !true);//
        //                  true != false

        System.out.println("_____________________________");

        int score = 80;
        boolean passed = score >= 60;
        boolean filed = !passed;
        // boolean filed = score < 60;


        System.out.println("____________________________");

        int age = 21;

        boolean eligible = age >= 21;
        boolean notEligible = !eligible;

    }
}
