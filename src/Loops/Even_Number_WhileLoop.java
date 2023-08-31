package Loops;

public class Even_Number_WhileLoop {
    public static void main(String[] args) {
        // even number 1 to 100 using while loop

        int i=1;
        // declare last number
        while (i<=100){

            // check even number
            if (i%2==0) {
                System.out.println("Even number while loop " + i);
            }
            // increment
            i++;
        }
    }
}


