package method;

public class INParameterCalculator {
    /*TODO  access_specifier return_type  method_name (Datatype varName..) {
        CODE..   }*/
    public void Addition(int a, int b){

        int result= a+b;
        System.out.println("The addition of a & b is = " +result);
    }
    public void Subtraction(int c , int d){

        int result = c-d;
        System.out.println("The subtraction of c & d is = " +result);
    }
    public void Multiplication(int a , int b){

        int result= a*b;
        System.out.println("The multiplication a & b is = " +result);
    }
    public void Divide(int c, int d){

        int result = c/d;
        System.out.println("The division of c & d is = " +result );
    }
    // TODO Write Method to calculate percentage


    public void  Percentage(int number){
        int percentage=(number/100)*2;

        System.out.println("Percentage of:" +percentage);
    }


    public static void main(String[] args) {
        INParameterCalculator obj= new INParameterCalculator();
        obj.Addition(55,88);
        obj.Subtraction(85,77);
        obj.Multiplication(55,20);
        obj.Divide(100,2);
        obj.Percentage(500);

    }
}
