package method;

public class DemoInputParameter {

    // SYNTAX: Access_specifier return_type method_name (parameter){code}

    public void addition(int a,int b){
        int a1;
        int b1;
        int result = a+b;
        System.out.println("Addition: "+result);
    }
    public void findQube(int number){
        int result = number*number*number;
        System.out.println("Qube number is: "+result);

    }
    public void factorialNumber(int number,int factorial) {
        for (int i = number; i > 0; i--) {
            factorial = factorial * i;// 5*4*3*2*1
        }
        System.out.println("find factorial number: " + factorial);

    }
    public void percentage(int number,double percentage1){
        double percentage = number*10/100;
        System.out.println("Percentage of number is: "+number + " is "+ percentage + " % ");
    }
    public void primeNumber(int number,boolean True){
        int number1;
        boolean isPrime = true;
        for (int i = 2; i<number; i++){
            if (number%i==0){
                isPrime = true;

            }
        }
        if (isPrime){
            System.out.println("Number is prime: "+number);
        }else {
            System.out.println("Number is not prime: "+number);
        }

    }
    public void calculator(int a,int b){
        int a1;
        int b1;
        int result = a - b;
        System.out.println("Subtraction is: "+result);

    }
    public void multiple(int a,int b){
        int result = a*b;
        System.out.println("Multiple is: "+result);
    }
    public void divide(int a,int b){
        double result = (double) a / b;


        System.out.println("Divide is: "+result);

    }

    public static void main(String args []){
        DemoInputParameter demoInputParameter= new DemoInputParameter();
        demoInputParameter.addition(8,5);
        demoInputParameter.addition(7,9);
        demoInputParameter.addition(4,8);
        demoInputParameter.findQube(5);
        demoInputParameter.findQube(7);
        demoInputParameter.findQube(2);
        demoInputParameter.factorialNumber(5,1);
        demoInputParameter.factorialNumber(6,1);
        demoInputParameter.factorialNumber(4,1);
        demoInputParameter.percentage(500,5);
        demoInputParameter.percentage(600,6);
        demoInputParameter.percentage(400,4);
        demoInputParameter.calculator(8,6);
        demoInputParameter.calculator(10,5);
        demoInputParameter.calculator(6,5);
        demoInputParameter.divide(67,56);
        demoInputParameter.divide(78,45);
        demoInputParameter.divide(98,67);
        demoInputParameter.multiple(6,7);
        demoInputParameter.multiple(68,34);
        demoInputParameter.multiple(56,34);
        demoInputParameter.divide(8,4);
        demoInputParameter.divide(89,5);
        demoInputParameter.divide(78,12);
        demoInputParameter.primeNumber(7,true);
        demoInputParameter.primeNumber(8,false);

    }
}
