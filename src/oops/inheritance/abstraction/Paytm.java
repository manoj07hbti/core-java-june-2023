package oops.inheritance.abstraction;

public class Paytm implements Payment{
    @Override
    public void checkBalance() {
        System.out.println("This is Paytm Check Balance Method");
    }

    @Override
    public void doPayment() {
        System.out.println("This is Paytm Do Payment Method");

    }

    public static void main(String[] args) {
        Paytm obj=new Paytm();
        obj.checkBalance();
        obj.doPayment();
    }
}
