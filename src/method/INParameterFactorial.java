package method;

public class INParameterFactorial {
     /*TODO  access_specifier return_type  method_name (Datatype varName..) {
        CODE..   }*/
    public void INParameterFactorial(int number){

        long factorial=1;

        for(int i=number; i>0; i--){

            factorial=factorial*i;

        }

        System.out.println("The Factorial of given number is = " +factorial);
    }

    public static void main(String[] args) {
        INParameterFactorial obj= new INParameterFactorial();
        obj.INParameterFactorial(4);
        obj.INParameterFactorial(8);

    }

}
