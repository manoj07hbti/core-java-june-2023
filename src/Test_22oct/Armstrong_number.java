package Test_22oct;

public class Armstrong_number {

    public static void main(String[] args) {
        int number=153;
        int tempNumber=number;
        int NoOfDigits=0;
        int remainder=0;
        int Sum=0;

        while (tempNumber != 0){
            tempNumber=tempNumber/10;
            NoOfDigits++;
        }
        tempNumber=number;

        while (tempNumber !=0){
            remainder=tempNumber%10;
            Sum+= Math.pow(remainder,NoOfDigits);
            tempNumber=tempNumber/10;
        }
        if (number == Sum){
            System.out.println("Given Number Of Armstrong number");
        }else {
            System.out.println("Given Number is not Armstrong number");
        }
    }
}
