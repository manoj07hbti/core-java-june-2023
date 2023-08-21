package returntype_method;

public class Factorial_ReturnType {

    public int factorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Factorial_ReturnType obj = new Factorial_ReturnType();
        int output = obj.factorial(4);
        System.out.println("factorial of given number is.." + output);
    }
}