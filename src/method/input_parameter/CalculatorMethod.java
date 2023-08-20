package method.input_parameter;

public class CalculatorMethod {

    //  TODO write a code to make a calculator
    //  TODO  Syntax : access_specifier return_type  method_name (Datatype varName....) { CODE..}

    public void additionMethod(int A, int B) {

        int result = A + B;
        System.out.println("Addition of " + A + " + " + B + " is :" + result);
    }

    public void subtractionMethod(int A, int B) {
        int result = A - B;
        System.out.println("Subtraction of " + A + " - " + B + " is :" + result);
    }

    public void multiplicationMethod(int A, int B) {
        int result = A * B;
        System.out.println("Multiplication of " + A + " * " + B + " is :" + result);
    }

    public void divisionMethod(int A, int B) {
        int result = A / B;
        System.out.println("Division of " + A + " / " + B + " is :" + result);

    }

    //TODO TypeCasting Method<---------------------------
    public void divisionTypeCastMethod(int A, int B) {
        double result = (double) A / B;
        System.out.println("Division of " + A + " / " + B + " with TypeCast is :" + result);
    }

    public static void main(String[] args) {
        CalculatorMethod obj = new CalculatorMethod();
        obj.additionMethod(500, 76);
        obj.additionMethod(545, 15);
        obj.additionMethod(700, 745);
        obj.additionMethod(800, 7886);
        obj.subtractionMethod(600, 67);
        obj.subtractionMethod(6008, 697);
        obj.subtractionMethod(60044, 6547);
        obj.subtractionMethod(2453, 607);
        obj.subtractionMethod(2341100, 67877);
        obj.multiplicationMethod(6336, 989);
        obj.multiplicationMethod(8000, 100);
        obj.multiplicationMethod(4587, 8777);
        obj.divisionMethod(56, 2);
        obj.divisionMethod(100, 2);
        obj.divisionMethod(68, 2);
        obj.divisionMethod(76, 2);
        obj.divisionMethod(88, 2);
        obj.divisionTypeCastMethod(100, 3);
        obj.divisionTypeCastMethod(3, 2);
        obj.divisionTypeCastMethod(6, 4);
        obj.divisionTypeCastMethod(2, 1);
        obj.divisionTypeCastMethod(150, 4);
        obj.divisionTypeCastMethod(36, 7);
        obj.divisionTypeCastMethod(34, 4);

    }
}
