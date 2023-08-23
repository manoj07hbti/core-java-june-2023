package Returntype_method;

public class Calculator_without_input2practise {

    public int addition(){
        int a=8;
        int b=10;
        return a+b;
    }

    public int sub(){
        int a=20;
        int b=10;
        return a-b;
    }

    public int multiply(){
        int a=10;
        int b=8;
        return a*b;
    }

    public int divide(){
        int a=10;
        int b=2;
        return a/b;
    }




    public static void main(String[] args) {
        Calculator_without_input2practise calculator3=new Calculator_without_input2practise();
        int output=calculator3.addition();
        System.out.println("addition is:"+output);
        int output2=calculator3.sub();
        System.out.println("sub is:"+output2);
        int output3=calculator3.multiply();
        System.out.println("multiply is:"+output3);
        int output4=calculator3.divide();
        System.out.println("divide is"+output4);


    }
}
