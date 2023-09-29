package pattern;

public class _6_HollowAlphabetRightTriangle {
    public static void main(String[] args) {
        int size = 5;
        int alpha = 65;

        for (int i = 1; i <= size; i++) {
            //printing space
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");

            }
            //printing alphabets
            for (int j = 0; j < i; j++) {
                //not last row
                if (i != size) {
                    if (j == 0 || j == i - 1) {
                        System.out.print((char) (alpha + j));
                    } else {
                        System.out.print(" ");
                    }
                }
                //last row
                else {
                    System.out.print((char) (alpha + j));
                }
            }
            System.out.println();
        }
    }
}
