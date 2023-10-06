package oops.inheritance.abstraction;

public class PhonePe implements Payment{
    @Override
    public void checkBalance() {
        System.out.println("This is PhonePe check balance method");
    }

    @Override
    public void doPayment() {
        System.out.println("This is PhonePe doPayment  method");
    }

    public static void main(String[] args) {
        PhonePe obj= new PhonePe();
        obj.doPayment();

    }
}
