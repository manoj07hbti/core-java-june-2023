package July_2_Test;

import java.awt.*;

public class Pattern {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println();


        }
        // reverse pattern of the star pattern form of 0>-5
        //for( int k = 4; k>=1;k--)
        //for(int j= 1;j<=k;k++)
        // this above type cans as be use


        for (int k=1-1; k>=-5; k--) {

            for (int j =1-5; j<=k; j++) {

                System.out.print("*");
            }
            System.out.println();
        }

    }
}
