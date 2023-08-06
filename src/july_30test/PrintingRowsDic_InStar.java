package july_30test;

public class PrintingRowsDic_InStar {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
        }
        for (int i = 2; i > 0; i--) {
            System.out.println();

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
        }

    }
}





