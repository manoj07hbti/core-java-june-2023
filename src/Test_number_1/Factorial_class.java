package Test_number_1;

public class Factorial_class {
    public static void main(String[] args) {

        int number =5;
        long result = factorial(number);
        System.out.println("factorial of"+number+"is:"+result);
    }
    public static long factorial(int n){
        if (n==0 || n==1){
            return 1;
        }else {
            return  n* factorial(n-1);
        }
    }
}

