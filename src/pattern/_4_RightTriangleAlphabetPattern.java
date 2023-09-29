package pattern;

public class _4_RightTriangleAlphabetPattern {
    public static void main(String[] args) {
        //size
        int size = 5;
        int alpha = 65;
        //printing pattern

        for (int i = 0; i < size; i++) {
            //print space
            for (int j = 1; j < size - i; j++) {
                System.out.print(" ");
            }
            //print alphabets
            for (int k = 0; k <= i; k++) {
                System.out.print((char) (alpha + k));
            }
            System.out.println();
        }


        for (int i = 0; i < size; i++) {
            //print space
            for (int j = 1; j < size - 1; j++) {
                System.out.print(" ");
            }
            //print alphabets
            for (int k = 0; k <= i; k++) {
                System.out.print((char) (alpha + k));
            }
            System.out.println();
        }

    }
}
