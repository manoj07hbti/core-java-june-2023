package method.input_parameter;

public class FactorialMethod {
    //TODO write a code to find factorial


    public void findFactorial(int number) {
        int fact = 1;
        for (int i = 2; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of given number is :" + fact);
    }


    public static void main(String[] args) {
        FactorialMethod obj = new FactorialMethod();
        obj.findFactorial(4);
    }
}

