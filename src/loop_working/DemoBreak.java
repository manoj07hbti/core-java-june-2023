package loop_working;

public class DemoBreak {
    public static void main(String[] args) {

        // For Loop using break condition in loop
        // For eg int i=1/int=3
        for (int i = 3; i <= 10; i++) {

            if (i == 7) {
                break;
            }
            System.out.println("This is For loop:" + i);
        }


        int star[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
// find number 7 in the loop
        for (int var : star) {
            System.out.println("Find the number 7 in the array:" + var);
            // This below condition is used to print/check direct number
            if (var == 7) {
                System.out.println("Give the number 7 is found");
                break;
            }


        }
    }
}
