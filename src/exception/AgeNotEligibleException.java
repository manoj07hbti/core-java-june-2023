package exception;

public class AgeNotEligibleException extends Exception{

    public AgeNotEligibleException(String message) {
        super(message); /** it will point to parent class **/
    }
}
