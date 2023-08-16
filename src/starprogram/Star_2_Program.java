package starprogram;

public class Star_2_Program {
    public static void main(String[] args) {
        /*  * * * * *


            * * * * *
         */

        for (int i=0;i<5;i++)
        {
            System.out.println();
            for (int j=0;j<5;j++)

            {
                if (i==0 || i==4)
                {
                    System.out.print("*"+"\t");
                }
                else
                {
                    System.out.print("");
                }
            }
        }
    }
}
