package PatternStatement;

public class Only_NotPrime_NumberList {
    public static void main(String[] args) {
        int m=2;
        for (int i=1;i<=1000;i++){
            for (int j=1;j<=i+1;j++){
                if (i%j==1){
                    m=m-1;
                }

            }if (m==1){
                System.out.println("Printing only prime number list : " +i);
            }
            else {
                m=m-1;
            }
        }
    }

}
