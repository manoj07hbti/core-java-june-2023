package function_and_method;

public class Calculator_InputParam {

    public void addition(int a , int b){
        int sum = a+b;
        System.out.println("Addition is "+sum);
    }

    public void subtract (int a,int b){
        int sub=a-b;
        System.out.println("Subtract of Number is "+ sub);
    }
    public void multiply(int a, int b){
        int multi=a*b;
        System.out.println("Multiply of Number is "+multi);
    }

    public void divide (double a,double b){
        double div=a/b;
        System.out.println("Divide of Number is "+div);
    }
    public void percent(double a, double b ){
        double per= a*b/100;
        System.out.println("Percent of Number is "+per);
    }
    public static void main(String[] args) {
        Calculator_InputParam obj = new Calculator_InputParam();
        obj.addition(40,50);
        obj.subtract(80,20);
        obj.multiply(8,4);
        obj.divide(42,8);
        obj.percent(60,6);
    }
}
