package pattern;

public class _1_AlphabetSquarePattern {

    public static void main(String[] args) {
        //size
        int size = 26;
        int alpha = 65;

        //printing square
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print((char) (alpha + j));
            }
            System.out.println();
        }


    }
}
