package test_22october;

import java.util.Scanner;

public class Demo_ArmstrongNumber {

    //NUMBER IS ARMSTRONG OR NOT

    public int armstrong(){
    int number, arm=0,reminder, a;
        System.out.println("ENTER THE 3 DIGIT NUMBER");
    Scanner scanner=new Scanner(System.in);
    number=scanner.nextInt();
    a=number;
        while(number>0){
        reminder=number%10;
        arm=reminder*reminder*reminder+arm;
        number=number/10;
    }
        if(a==arm){
        System.out.println("THE NUMBER "+a +" IS AN ARMSTRONG NUMBER");
    }else{
        System.out.println("THE NUMBER "+a +" IS NOT AN ARMSTRONG NUMBER");
    }
        return a;

}

    public static void main(String[] args) {
        Demo_ArmstrongNumber obj = new Demo_ArmstrongNumber();
        obj.armstrong();
    }

}
