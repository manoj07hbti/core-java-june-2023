package Method.input_parameter_method;

public class Cube_Input_param {

    public void Cube_Input_param(int a) {

        int cubeResult = a * a * a;

        System.out.println("printing cube is " + cubeResult);

    }

    public static void main(String[] args) {

        Cube_Input_param obj = new Cube_Input_param();

        obj.Cube_Input_param(5);
        obj.Cube_Input_param(9);

    }

}

