package Test_number_1;

public class Factorialpractise3 {
    public static void main(String[] args) {

        int number=8;
        int factorial=1;

        for(int i=number; i>0; i--){

            factorial=factorial*i;

            System.out.println("factorial :" +factorial);
        }
    }
}
