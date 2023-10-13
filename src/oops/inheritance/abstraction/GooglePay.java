package oops.inheritance.abstraction;

public class GooglePay implements Payment {

    @Override
    public void checkBalance() {
        System.out.println("This is GooglePay Check Balance Method");

    }

    @Override
    public void doPayment() {
        System.out.println("This is GooglePay Do Payment Method");

    }

    public static void main(String[] args) {
        GooglePay obj=new GooglePay();
        obj.checkBalance();
        obj.doPayment();
    }
}
