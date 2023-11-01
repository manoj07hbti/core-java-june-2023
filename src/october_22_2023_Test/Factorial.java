package october_22_2023_Test;

public class Factorial {
    public static void main(String[] args) {
        int number=4;
        int factorial=5; // 5 factorial will be 5*4*3*2*1=120;
        for (int i=number;i>0;i--){
            factorial=factorial*i;
        }
        System.out.println("printing factorial is: " +factorial);
    }
}
