package day08_ifStatements;

public class SingleIfStatementIntro {

    public static void main(String[] args) {

        String name = "Muhtar";

        int score = 60;
        boolean passed = score >= 60; // true

        if(passed) { // if studen passed the exam
            System.out.println("Congrat "+name+"you passed thr exam");
        }




        if(passed) { // if student filed the exam
            System.out.println(name+ "you filed thr exam");
        }




    }
}
