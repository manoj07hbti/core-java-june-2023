package july_30_test;

public class Factorial {

    public static void main(String[] args) {
    //4 will be 4*3*2*1=24

        int number=5;

        int factorial=1;

        for(int i=number; i>0; i--){

            factorial=factorial*i;//4*3*2*1=24

        }

        System.out.println("Factorial: "+factorial);






    }
}
