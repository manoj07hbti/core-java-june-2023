package Returntype_method;

public class Calculatorwithoutinput {

    public int add(){
        int a=4;
        int b=6;
        return a+b;
    }
    public int subtraction(){
        int a=10;
        int b=8;
        return a-b;
    }
    public int multiply(){
        int a=5;
        int b=4;
        return a*b;
    }
    public int divide(){
        int a=32;
        int b=4;
        return a/b;
    }
    public double divisionTypecast(){
        int a=1632;
        int b=2;
        return (double) a/b;
    }

    public static void main(String[] args) {
        Calculatorwithoutinput calculator2=new Calculatorwithoutinput();
        int output=calculator2.add();
        System.out.println("add is:"+output);
        int output2=calculator2.subtraction();
        System.out.println("subtraction is:"+output2);
        int output3=calculator2.multiply();
        System.out.println("multiply is"+output3);
        int output4=calculator2.divide();
        System.out.println("divide is"+output4);
        double output5=calculator2.divisionTypecast();
        System.out.println("typecastDivision is :"+output5);

    }
}
