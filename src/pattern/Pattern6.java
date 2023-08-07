package pattern;

public class Pattern6 {

    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            System.out.println();
            for (int j=0;j<=i;j++){
                System.out.print(" *");
            }
        }
        for (int i=6;i>0;i--){
            System.out.println();
            for (int j=0;j<i;j++){
                System.out.print(" *");
            }
        }


        for (int i=0;i<5;i++){
            System.out.println();
            for (int j=0;j<=i;j++){
                System.out.print(" a");
            }
        }
        for (int i=6;i>0;i--){
            System.out.println();
            for (int j=0;j<i;j++){
                System.out.print(" b");
            }
        }


    }
}
