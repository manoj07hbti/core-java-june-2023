package july_25test;

public class Factorial_SecondMethod {

    public static void main(String[] args) {

        //5 will be 5*4*3*2*1=120

        int number= 5;
        int factorial = 1;
        for (int i=number; i>0; i--){

            factorial=factorial*i;//5*4*3*2*1=120
        }
        System.out.println("factorial:"+factorial);
    }
}
