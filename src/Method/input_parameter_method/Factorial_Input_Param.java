package Method.input_parameter_method;

public class Factorial_Input_Param {

    public void Factorial_input_Param(int number, int factorial) {
        for (int i = number; i > 0; i--) {
            factorial = factorial * i;// 3*2*1
        }
        System.out.println("find factorial number: " + factorial);

    }

    public static void main(String[] args) {

        Factorial_Input_Param obj = new Factorial_Input_Param();

        obj.Factorial_input_Param(3, 1);
        obj.Factorial_input_Param(5, 1);
        obj.Factorial_input_Param(4, 1);


    }
}