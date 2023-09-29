package pattern;

public class _10_HollowPyramidAlphabetPattern {
    public static void main(String[] args) {
        int size = 5;
        int alpha = 65;

        for (int i = 0; i < size; i++) {
            //printing spaces
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            //printing alphabets
            for (int k = 0; k < 2 * i + 1; k++) {
                if (i == 0 || i == size - 1) {
                    System.out.print((char) (alpha + k));
                } else {
                    if (k == 0 || k == 2 * i) {
                        System.out.print((char) (alpha + k));

                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
