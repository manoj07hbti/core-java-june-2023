package exception_demo;

public class AmountLessException extends Exception {
    public AmountLessException(String message) {
        super(message);// it will point to parent class
    }
}


