package day04_Variables;

public class ConcatenationPractice<so, todayClass, tomorrow, today, favoriteSeries, favoriteBook, name, subtraction, multiplication, word, additional, euro, lira, dollar, sout> {

    public void main(String[] args) {


        String word = "C#";

        System.out.println("My favorite language is" + word + "programing language");


        System.out.println("_________________________________________");

        int dollar = 100;
        double lira = dollar * 8.41;
        double euro = dollar * 0.88;

        System.out.println(dollar + "US dollars equal to" + lira + "Turkish lira");
        System.out.println(dollar + "US dollars equal to" + euro + "euros");

        System.out.println("_____________________________");
        int a = 10;
        int b = 20;
        int additional = a + b;
        int subtraction = a - b;
        int multiplication = a * b;

        // 10 + 20 = 30
        System.out.println(a + " + " + b + " = " + additional);

        // 10 - 20 = -10
        System.out.println(a + " - " + b + " = " + subtraction);

        // 100 * 200 = 20000
        System.out.println(a + " * " + b + " = " + multiplication);

        System.out.println("________________________________________");
        String name = "John";
        String favoriteMusic = "Rock Musics";
        String favoriteBook = "How to win friends";
        String favoriteSeries = "The walking dead";

        System.out.println("tHello my name is " + name + "\n my favoeite music is \""
                + favoriteMusic + "\", my favorite book title is \"" + favoriteBook
                + "\"\n my favorite TV series is \"" + favoriteSeries + "\"");

        System.out.println("__________________________");
        String today = "Monday";
        String todayClass = "Java";
        String tomorrow = "Tuesday";
        String tomorrowClass = "Selenium";

        System.out.println("Today is " + today + ", today we have " + todayClass + " class.");
        System.out.println("Tomorrow is" + tomorrow + ", tomorrow we will have " + tomorrowClass + " class.");

    }

}
