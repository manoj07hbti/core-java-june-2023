package OOPs.inheritance.abstraction;

public class GooglePay implements Payment {
    @Override
    public void checkBalance() {
        System.out.println("this is googlePay check balance method : ");

    }

    @Override
    public void DoPayment() {
        System.out.println("this is googlePay do payment method : ");

    }

    @Override
    public void ShowBalance() {
        System.out.println("this is googlePay Show Balance method : ");

    }

    public static void main(String[] args) {
        GooglePay obj = new GooglePay();
        obj.checkBalance();
        obj.DoPayment();
        obj.ShowBalance();
    }
}
