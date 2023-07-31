package practicjava;

public class Practice {
    public static void main(String[] args) {
        int number=5;
        for(int i=1; i<=5; i++){
            if(5%i==0){
                System.out.println("printing the factor value of 5 is :  "+ i);
            }
        }
        number=3;
        for(int i=1; i<=3; i++){
            if (3 % i == 0) {
                System.out.println("printing the factor value of 3 is : " +i);
            }
            number=4;
            for(int j=1; j<=4; j++){
                if(4%j==0){
                    System.out.println("printing the factor value of 4 is :  " + j);
                }
            }
        }
        number=6;
        for(int i=1;i<=6;i++){
            if(6%i==0){
                System.out.println("printing the factor value of 6 is : " + i);
            }
        }
        number=7;
        for(int i=1; i<=7; i++){
            if(7%i==0){
                System.out.println("printing the factor value of 7 is : " + i);
            }
        }
        number =8;
        for(int i=1; i<=8; i++){
            if(8%i==0){
                System.out.println("printing the factor value of 8 is : " + i);
            }
        }
        number=9;
        for(int i=1; i<=8; i++){
            if(9%i==0){
                System.out.println("printing the factor value 9 is : " + i);
            }
        }
        int i=1000;
        for(int j=1; j<=100;j++){
            if(j%2==0){
                System.out.println("printing the even number up to 100 is : " + j );
            }
        }
        int number1=500;
        for(int k=1; k<=200; k++){
            if(k%3==1){
                System.out.println("printing the odd number  " + k);
            }
        }
        int number2=11;
        for(int q=1;q<=10;q++){
            System.out.println("11x" +q+ "=" + number2 *q);
        }
        int number22=3;
        while(i<=10){
            System.out.println("3x"+i+"="+number22*i);
            i++;
        }
    }
}
