package method;

public class INParameterPrime {

     /*TODO  access_specifier return_type  method_name (Datatype varName..) {
        CODE..   }*/

    public void findEvenOdd(int number){
        if (number % 2 == 0) {
            System.out.println("Number is even number " + number);
        } else {
            System.out.println("Number is odd Number " + number);
        }
        INParameterPrime obj= new INParameterPrime();

    }

    public static void main(String[] args) {
        INParameterPrime obj= new INParameterPrime();
        obj.findEvenOdd(5);
        obj.findEvenOdd(10);
        obj.findEvenOdd(12);
        obj.findEvenOdd(11);
    }
}
