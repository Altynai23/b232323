package day49_Exception;

public class BreakTimeException extends RuntimeException {

    public BreakTimeException(String message){
        super(message);
    }

    public BreakTimeException(){
        super("It's time for a short break");
    }


}
