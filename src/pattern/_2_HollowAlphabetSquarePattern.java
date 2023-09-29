package pattern;

public class _2_HollowAlphabetSquarePattern {

    public static void main(String[] args) {
        //size
        int size = 26;
        int alpha = 65;

        //external loop
        for (int i = 0; i < size; i++) {
            //internal loop
            for (int j = 0; j < size; j++) {
                //print only alphabets in first and last row
                if (i == 0 || i == size - 1) {
                    System.out.print((char) (alpha + j));
                } else {
                    //print alphabets first and last position of row
                    if (j == 0 || j == size - 1) {
                        System.out.print((char) (alpha + j));
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            // num = 1;
            System.out.println();
        }
    }
}
