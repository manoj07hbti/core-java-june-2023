package loop_working;

public class LoopforOddNumberClass {

    public static void main(String[] args) {
        int number = 100;
        for (int i = 0; i <= 100; i++) {
            if (i % 2!=0) {
                System.out.println("This are odd number" + i);
            }
        }

    }
}