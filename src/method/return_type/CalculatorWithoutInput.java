package method.return_type;

public class CalculatorWithoutInput {
    //TODO Write a code to make a calculator
    //TODO without input
    public int addition(){
        int a=5;
        int b=6;
        return a+b;
    }
    public int subtraction(){
        int a=5;
        int b=4;
        return a-b;
    }
    public int multiplication(){
        int a=6;
        int b=7;
        return a*b;

    }
    public int division(){
        int a=32;
        int b=2;
        return a/b;

    }
    public double divisionTypeCast(){
        int a=1248758567;
        int b=2;
        return (double) a/b;
    }
    public static void main(String[] args) {
        CalculatorWithoutInput obj=new CalculatorWithoutInput();
        int output= obj.addition();
        System.out.println("Addition is :"+output);
        int output2=obj.subtraction();
        System.out.println("Subtraction is :"+output2);
        int output3=obj.multiplication();
        System.out.println("Multiplication is :"+output3);
        int output4=obj.division();
        System.out.println("Division is :"+output4);
        double output5=obj.divisionTypeCast();
        System.out.println("TypeCastDivision is :"+output5);
    }
}
