package loop_working;

public class Assignment_Loop_Odd {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}