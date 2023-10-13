package oops.inheritance.abstraction;

public class PhonePe implements Payment {
    @Override
    public void checkBalance() {
        System.out.println("This is PhonePe Check Balance Method");

    }

    @Override
    public void doPayment() {
        System.out.println("This is PhonePe Do Payment Method");

    }
    public static void main(String[] args) {
        PhonePe obj=new PhonePe();
        obj.checkBalance();
        obj.doPayment();
    }
}
