package loop_package.myWhileloop_package;

public class MyDoWhileLoop_Even {
    public static void main(String[] args) {
        System.out.println("even numbers between 1 and 100:");
        int num1 = 1;
        do {
            if (num1 % 2 == 0) {
                System.out.println(num1 + "");
            }
            num1++;
        } while (num1 <= 100);

    }
}
