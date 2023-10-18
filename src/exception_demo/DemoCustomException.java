package exception_demo;

public class DemoCustomException {

    public void Account(int balance) throws AmountLessException {
        if (balance > 5000){
            throw new AmountLessException("Amount should be greater or equal to 5000 to open bank Account");
        }else {
            System.out.println(" You are ready for open bank account....");
        }
    }
    public static void main(String args []){
        DemoCustomException Obj = new DemoCustomException();

        try {
            Obj.Account(6000);
        }
        catch (Exception e){
            System.out.println(" Exception occurred : "+e);
        }
    }
}
