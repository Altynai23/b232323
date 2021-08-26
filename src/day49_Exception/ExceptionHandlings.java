package day49_Exception;

public class ExceptionHandlings {

    public static void main(String[] args) {

        String str = "Cybertek";

        try {
            System.out.println(str.charAt(200)); // StringIndexOutOfBounds
            System.out.println("Try block");
        }catch (RuntimeException e) {
            System.out.println("Catch Block: Runtime exception occured");
        }
            str += " School";

            System.out.println(str);


        }
}
