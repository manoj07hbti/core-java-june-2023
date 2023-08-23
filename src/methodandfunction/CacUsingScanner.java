package methodandfunction;

import java.util.Scanner;

public class CacUsingScanner {

    public int addition(int a,int b)
    {
        int add=a+b;
        return add;

    }

    public int substraction(int a,int b)
    {
        int sub=a-b;
        return sub;

    }

    public int multiplication(int a,int b)
    {
        int mul=a*b;
        return mul;
    }

    public double division(double a,double b)
    {
        double div=a/b;
        return div;
    }

    public static void main(String[] args) {
        CacUsingScanner cus=new CacUsingScanner();


        Scanner scanner=new Scanner(System.in);
        System.out.println("Please entered value of a");
        int a= scanner.nextInt();

        System.out.println("please entered value of b");
        int b= scanner.nextInt();

        System.out.println("Please enter the your choice");
        int number= scanner.nextInt();

        switch (number)
        {

            case 1:
                int resut1= cus.addition(a,b);
                System.out.println("Addition of number is\t"+resut1);
                break;
                //int add=a+b;
            case 2:
                int resut2= cus.substraction(a,b);
                System.out.println("subtraction of number is\t " +resut2);
                break;
            case 3:
                int resut3= cus.multiplication(a,b);
                System.out.println("multiplication of number is\t " +resut3);
                break;
            case 4:
                double resut4= cus.division(a,b);
                System.out.println("division of number is\t " +resut4);
                break;
            default:
                System.out.println("Please enter valid number");
        }
    }
}
