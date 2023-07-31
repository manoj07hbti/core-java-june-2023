package loop_working;

public class Whileloop{

    public static void main(String[] args) {
        int i = 1;
//using while loop to find even and odd number Loop working
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println("This are even number" + i);
            } else {
                System.out.println("This are odd number" + i);
            }
            i++;
        }
    }
}