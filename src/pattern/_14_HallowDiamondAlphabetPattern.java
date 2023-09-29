package pattern;

public class _14_HallowDiamondAlphabetPattern {
    public static void main(String[] args) {
        int size = 5;
        int alpha = 65;

        //upper pyramid
        for (int i = 1; i <= size; i++) {
            //printing spaces
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
            //printing alphabets
            for (int k = 0; k < i * 2 - 1; k++) {
                if (k == 0 || k == 2 * i - 2) {
                    System.out.print((char) (alpha + k));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        //lower triangle
        for (int i = 1; i < size; i++) {
            //printing spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //printing alphabets
            for (int k = 0; k <= (size - i - 1) * 2; k++) {
                if (k == 0 || k == (size - i - 1) * 2) {
                    System.out.print((char) (alpha + k));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
