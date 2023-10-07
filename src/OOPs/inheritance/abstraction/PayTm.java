package OOPs.inheritance.abstraction;

public class PayTm implements Payment {
    @Override
    public void checkBalance() {
        System.out.println("this is PayTm check balance method : ");
    }

    @Override
    public void DoPayment() {
        System.out.println("this is PayTm do payment method : ");

    }

    @Override
    public void ShowBalance() {
        System.out.println("this is PayTm Show Balance method : ");

    }

    public static void main(String[] args) {
        PayTm obj = new PayTm();
        obj.checkBalance();
        obj.DoPayment();
        obj.ShowBalance();
    }
}
