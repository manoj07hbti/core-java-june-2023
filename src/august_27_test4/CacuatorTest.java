package august_27_test4;

import methodandfunction.CacUsingScanner;

import java.util.Scanner;

public class CacuatorTest {

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

        public double division(int a,int b)
        {
            double div=(double) a/b;
            return div;
        }





        public static void main(String[] args) {
            int number=0;
            String choice="y";
            int a=0;
            int b=0;
            CacuatorTest ct=new CacuatorTest();
            while (choice.equals("y"))
            {



                Scanner scanner=new Scanner(System.in);
                System.out.println("Please entered value of a");
                a= scanner.nextInt();

                System.out.println("please entered value of b");
                b= scanner.nextInt();

                System.out.println("Please enter the your choice");
                number= scanner.nextInt();

                switch (number)
                {

                    case 10:
                        int result1= ct.addition(a,b);
                        System.out.println("Addition of number is\t"+result1);
                        break;
                    //int add=a+b;
                    case 20:
                        int result2= ct.substraction(a,b);
                        System.out.println("subtraction of number is\t " +result2);
                        break;
                    case 30:
                        int result3= ct.multiplication(a,b);
                        System.out.println("multiplication of number is\t " +result3);
                        break;
                    case 40:
                        double result4= ct.division(a,b);
                        System.out.println("division of number is\t " +result4);
                        break;
                    default:
                        System.out.println("Please enter valid number");
                }
                //
                System.out.println("Enter y to continue or press any other key to exit");
                Scanner sc=new Scanner(System.in);
                choice=sc.nextLine();
            }


        }
    }


