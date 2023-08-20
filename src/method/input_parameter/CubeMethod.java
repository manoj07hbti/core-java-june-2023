package method.input_parameter;

public class CubeMethod {
    //TODO write a code to find particular cube
    //TODO Syntax : access_specifier return_type  method_name (Datatype varName....) { CODE..}

    public void findCube(int number) {
        System.out.println("cube of " + number + " is " + number * number * number);
    }

    public static void main(String[] args) {
        CubeMethod obj = new CubeMethod();
        obj.findCube(3);
    }
}
