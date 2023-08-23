package method;

public class INParameterCube {
    /*TODO  access_specifier return_type  method_name (Datatype varName..) {
        CODE..   }*/
    public void INParameterCube(int number){

        System.out.println("Print the cube of given number is = "  +number*number*number);
    }

    public static void main(String[] args) {
        INParameterCube obj= new INParameterCube();
        obj.INParameterCube(5);
        obj.INParameterCube(55);
        obj.INParameterCube(35);
    }
}
