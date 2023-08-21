package Returntype_method;

public class Calculator {

    public int addition(int a,int b){
        int result=a+b;
        return result;


    }
    public int subtraction(int a,int b){
        int result=a-b;
        return result;

    }

    public int multiplication(int a,int b){
        int result=a/b;
        return result;
    }

    public double divisiontypecast(int a, int b) {
        double result = a / b;
        return result;
    }

    public static void main(String[] args) {
        Calculator calculator1=new Calculator();
        System.out.println(calculator1.addition(40,19));
        System.out.println(calculator1.subtraction(60,40));
        System.out.println(calculator1.multiplication(30,4));
        System.out.println(calculator1.divisiontypecast(6,2));

    }




}
