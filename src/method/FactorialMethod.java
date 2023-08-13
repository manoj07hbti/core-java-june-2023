package method;

public class FactorialMethod {

    //TODO Write a code for find the factorial
    //TODO  Syntax : access_specifier return_type  method_name (parameter) { CODE..}

    public void factorial() {
        int i, fact = 1;
        int number = 4;
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of given number is :" + fact);
    }


    public static void main(String[] args) {
        FactorialMethod obj = new FactorialMethod();
        obj.factorial();
    }
}
