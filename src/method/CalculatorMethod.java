package method;

public class CalculatorMethod {

    // TODO Write a code to make a calculator
    // TODO  Syntax : access_specifier return_type  method_name (parameter) { CODE..}

    public void additionMethod() {
        int A = 78;
        int B = 22;
        int result = A + B;
        System.out.println("Addition of A and B is :" + result);
    }

    public void subtractionMethod() {
        int A = 78;
        int B = 22;
        int result = A - B;
        System.out.println("Subtraction of " + A + " - " + B + " is :" + result);
    }

    public void multiplicationMethod() {
        int A = 78;
        int B = 33;
        int result = A * B;
        System.out.println("Multiplication of " + A + " * " + B + " is :" + result);
    }

    public void divisionMethod() {
        double A = 6;
        double B = 4;
        double result = A / B;
        System.out.println("Division of " + A + " / " + B + " is :" + result);
    }

    public static void main(String[] args) {
        CalculatorMethod obj = new CalculatorMethod();
        obj.additionMethod();
        obj.subtractionMethod();
        obj.multiplicationMethod();
        obj.divisionMethod();
    }
}
