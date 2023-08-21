package method.return_type;

public class CalculatorWithInput {

    //TODO Write a code to make a calculator
    //TODO with input
    public int addition(int a, int b) {
        int result = a + b;
        return result;
    }

    public int subtraction(int a, int b) {
        int result = a - b;
        return result;
    }

    public int multiplication(int a, int b) {
        int result = a * b;
        return result;

    }

    public int division(int a, int b) {
        int result = a / b;
        return result;
    }

    public double divisionTypeCast(int a, int b) {
        double result = (double) a / b;
        return result;
    }

    public static void main(String[] args) {
        CalculatorWithInput obj = new CalculatorWithInput();
        System.out.println(obj.addition(15, 13));
        System.out.println(obj.subtraction(21, 4));
        System.out.println(obj.multiplication(32, 2));
        System.out.println(obj.division(32, 2));
        System.out.println(obj.divisionTypeCast(3, 2));
    }


}
