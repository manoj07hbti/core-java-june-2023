package exceptionHandling;

public class ageNotEligibalException extends Exception {

    public ageNotEligibalException(String message) {
        super(message); // Ii will point to parent class
    }

public static class LessAmountException extends Exception{


    public LessAmountException(String message) {
        super(message);
    }
}




}
