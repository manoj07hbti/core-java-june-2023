package loop_package.myWhileloop_package;

public class MyDoWhileLoop_Odd {
    public static void main(String[] args) {

        System.out.println("odd numbers between 1 and 100:");
        int num2 =1;
        do {
            if (num2 % 2!= 0) {
                System.out.println(num2 + "");
            }
            num2++;
        } while (num2 <= 100);




    }
}
