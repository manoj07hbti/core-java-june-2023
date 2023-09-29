package pattern;

public class _7_LeftDownAlphabetTriangle {
    public static void main(String[] args) {
        int size = 5;
        int alpha = 65;

        for (int i = 0; i < size; i++) {
            //printing alphabets
            for (int j = 0; j < size - i; j++) {
                System.out.print((char) (alpha + j));
            }
            System.out.println();
        }
    }
}
