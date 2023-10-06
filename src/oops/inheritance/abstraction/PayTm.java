package oops.inheritance.abstraction;

public class PayTm implements Payment{
    @Override
    public void checkBalance() {
        System.out.println("This is PayTm checkBalance  method");
    }

    @Override
    public void doPayment() {
        System.out.println("This is PayTm doPayment  method");
    }
}
