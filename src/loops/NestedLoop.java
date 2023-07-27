package loops;

public class NestedLoop {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("this is outer" + i);

/* NESTED WORKING */

             for (int j = 0; j < 5; j++) {
                System.out.println("this is inner" + j);

            }
        }
    }
}