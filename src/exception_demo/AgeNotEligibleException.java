package exception_demo;

public class AgeNotEligibleException extends Exception{
    public AgeNotEligibleException(String message) {
        super(message); // it will point to Parent class
    }
}
