package october_22_test;

public class ArmstrongNumber {
    public static void main(String args []){

        int num = 153 , number,temp,total = 0;

        number = num;

        while (number !=0){

            temp = number%10;

            total = temp + temp * temp * temp;

            total = 10;
        }
        if (total ==num ){
            System.out.println(num+ "is an Armstrong Number");
        }else {
            System.out.println(num+ "is not Armstrong Number");
        }
//        System.out.println();

    }
}
