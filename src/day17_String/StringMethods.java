package day17_String;

public class StringMethods {

    public static void main(String[] args) {

        String sentence = "My favorite programming language are: C#, Java, JavaScript";
        boolean hasPython = sentence.equals("Python");
        boolean hasJava = sentence.equals("Java");
        // boolean hasJava2 = sentence.toLowerCase().contains("java");

        System.out.println("hasPython = " + hasPython); //false
        System.out.println("hasJava = " + hasJava); //
        // System.out.println("hasJava2 = " + hasJava2);

        System.out.println("-------------------------");
        String sentence2 = "Cybertek school is the best";
        boolean startWithCybertek = sentence2.startsWith("Cybertek"); //true
        boolean startsWithCybertek = sentence2.startsWith("School"); //false

        System.out.println("startWithCybertek = " + startWithCybertek);
        System.out.println("startsWithCybertek = " + startsWithCybertek);


        System.out.println("------------------------");

        boolean endsWithBest = sentence2.endsWith( "Best" );

        System.out.println("endsWithBest = " + endsWithBest);






    }



}
