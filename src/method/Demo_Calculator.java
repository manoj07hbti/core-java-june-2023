package method;

public class Demo_Calculator {
    //TODO Write a method for calculator

    public void Addition(){
        int a= 5;
        int b= 7;
        int result= a+b;
        System.out.println("The addition of a & b is = " +result);
    }
    public void Subtraction(){
        int c= 4;
        int d=1;
        int result = c-d;
        System.out.println("The subtraction of c & d is = " +result);
    }
    public void Multiplication(){
        int a = 5;
        int b= 9;
        int result= a*b;
        System.out.println("The multiplication a & b is = " +result);
    }
    public void Divide(){
        int c=10;
        int d=2;
        int result = c/d;
        System.out.println("The division of c & d is = " +result );
    }

    //TODO Write Method to find factorial
    public void Factorial(){

            int number=5;

            long factorial=1;

            for(int i=number; i>0; i--){

                factorial=factorial*i;

            }

            System.out.println("The Factorial of 5 is = " +factorial);

        }

    // TODO Write Method to calculate percentage

    public void  Percentage(){
        int percentage=(500/100)*2;

        System.out.println("Percentage of:" +percentage);
    }

    public static void main(String[] args) {
        Demo_Calculator obj= new Demo_Calculator();
        obj.Addition();
        obj.Subtraction();
        obj.Multiplication();
        obj.Divide();
        obj.Factorial();
        obj.Percentage();
    }
}
