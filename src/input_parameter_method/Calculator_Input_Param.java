package input_parameter_method;

public class Calculator_Input_Param {
    // addition,subtraction,multiply,division,percentage:

    public void Add(int a, int b) {

        int result = a + b;

        System.out.println("Addition... is " + result);

    }

    public void Subtraction(int a, int b) {

        int result = a - b;

        System.out.println("Subtraction... " + result);
    }

    public void Multiply(int a, int b) {
        int result = a * b;
        System.out.println("Multiply..." + result);

    }

    public void Division(int a, int b) {
        double result = (double) a / b;
        System.out.println("Division..." + result);
    }

    public void Percentage(String section, int number, int rollNumber, String Name) {
        double result = (double) (number * 100) / 600;

        System.out.println("% is..." + result);

        if (result >= 60) {
            System.out.println("student" + "name " + "roll number" + "roll number" + "Got first division" + section);
        }

    }


    public static void main(String[] args) {

        Calculator_Input_Param obj = new Calculator_Input_Param();

        obj.Add(3, 5);
        obj.Add(65, 43);
        obj.Subtraction(23, 13);
        obj.Subtraction(45, 15);
        obj.Multiply(12, 12);
        obj.Multiply(18, 10);
        obj.Division(250, 10);
        obj.Division(50, 5);
        obj.Percentage("ms", 380, 02, "Aabhya");
        obj.Percentage("cs", 370, 03, "Komal");

    }


}
