package break_continue_package;

public class My_BreakClass {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            if (i == 8) {
                break;
            }
            System.out.println("This is for loop..." + i);

        }
        int arr[] = {8, 9, 10, 11, 12, 13, 14, 15, 16};
        for (int var : arr) {
            System.out.println("finding number 11 in Array ,checking...." + var);
            if (var == 11) {
                System.out.println("given number 11 is found");
                break;
            }
        }
    }
}