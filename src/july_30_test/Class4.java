package july_30_test;

public class Class4 {
    public static void main(String[] args) {
        int numberofrows = 5;
        int i, j;
        for (i = 1; i <= numberofrows; i++) {
            for (j = 1; j <= numberofrows - 1; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

        for (i = numberofrows - 1; i > 0; i--) {
            for (j = 1; j <= numberofrows - 1; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}