package starprogram;

/*
    *---*
    -*-*-
    --*--
    -*-*-
    *---*
 */
public class Star_3_Prgram {

    public static void main(String[] args) {
        for (int i=0;i<5;i++)
        {
            System.out.println();
            for (int j=0;j<5;j++)
            {
                //i+j=size-1;
             if (i==j || i+j==4 )
             {
                 System.out.print("*");
             }
             else
             {
                 System.out.print(" ");
             }
            }
        }
    }
}
