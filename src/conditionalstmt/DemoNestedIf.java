package conditionalstmt;

public class DemoNestedIf {
    public static void main(String[] args) {
        double num=3;
        num=27;
        num=5;
        num=-9;
        if (num>0)
        {
            if(num%3==0)
            {
                System.out.println("The no is divided of three");

            }
            else {
                System.out.println("number is not divided by 3");

            }


        }
        else {

            System.out.println("Please Enter valid number");
        }
    }
}
