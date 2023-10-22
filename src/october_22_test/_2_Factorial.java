package october_22_test;

public class _2_Factorial {
    public static void main(String[] args) {
        int number=4;

        int factorial=1;

        for (int i=number;i>0;i--){
            factorial=factorial*i;
        }
        System.out.println("Factorial is:"+factorial);
    }
}
