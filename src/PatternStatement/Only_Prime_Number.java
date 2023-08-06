package PatternStatement;

public class Only_Prime_Number {
    public static void main(String[] args) {
        int m=0;
        for (int i=1;i<=1000;i++){
            for (int j=2;j<=i-1;j++){
                if (i%j==0){
                    m=m+1;
                }

            }if (m==0){
                System.out.println("Printing only prime number list : " +i);
            }
            else {
                m=0;
            }
        }
    }

}
