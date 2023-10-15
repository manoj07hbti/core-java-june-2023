package oop.exception;

public class DemoAccountOpeningException {


    public void Balance(double bal) throws AmountLessException
    {

        if (bal<5000)
        {

            throw new AmountLessException("Minimum balance required more than equal to 50000");
        }

        else {

            System.out.println("Congratulation ...welcome to your bank account");
        }
    }

    public static void main(String[] args) {
        DemoAccountOpeningException obj=new DemoAccountOpeningException();
        try {
            obj.Balance(4500);
        }
        catch (Exception e)
        {
            System.out.println("Exception occurred"+e);
        }
    }
}


