package method;

public class DemoReturnType {
    //Cube of given number:
    public int makeCube(int number) {

        int Cube = number * number * number;

        return Cube;

    }

    public int Calculator(int a, int b) {
        int addition = a + b;
        return addition;

    }

    public int Subtraction(int a, int b) {
        int subtraction = a - b;
        return subtraction;

    }

    public int Multiple(int a, int b) {
        int multiple = a * b;
        return multiple;

    }

    public int Divide(int a, int b) {
        int divide =  a / b;
        return divide;
    }

    public int percentage (int number,int percentage){
        int par =number*10/100;
        return par;
    }
    public int square(int number){
        int square = number*number;
        return square;
    }

    public static void main(String args []){
        DemoReturnType obj =new DemoReturnType();

       int output =obj.makeCube(4);
       System.out.println("The cube of number: "+output);
       output =obj.Calculator(6,4);
       System.out.println("The Addition: "+output);
       output =obj.Subtraction(6,4);
       System.out.println("The subtraction: "+output);
       output = obj.Multiple(6,4);
       System.out.println("The Multiple: "+output);
       output= obj.Divide(2,6);
       System.out.println("Printing of divide: "+output);
       output= obj.percentage(600,5);
       System.out.println("Printing of percentage: "+output);
       output= obj.square(5);
       System.out.println("Printing square number of 5: "+output);

    }
}
