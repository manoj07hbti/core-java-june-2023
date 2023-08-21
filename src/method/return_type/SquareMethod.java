package method.return_type;

public class SquareMethod {

    // TODO write a code to find particular square

    public int findSquare(int number){//TODO <----------with input
        return number*number;

    }
    public int findSquare2(){//TODO <------------without input
        int number=2;
        return number*number;
    }

    public static void main(String[] args) {
        SquareMethod obj=new SquareMethod();
        int output1=obj.findSquare(3);
        System.out.println("Square of Given number is :"+output1);
        int output2=obj.findSquare(4);
        System.out.println("Square of Given number is :"+output2);
        int output3=obj.findSquare(5);
        System.out.println("Square of Given number is :"+output3);
        int output4=obj.findSquare(6);
        System.out.println("Square of Given number is :"+output4);
        int output5=obj.findSquare(7);
        System.out.println("Square of Given number is :"+output5);
        int output6=obj.findSquare(8);
        System.out.println("Square of Given number is :"+output6);
        int output7=obj.findSquare(9);
        System.out.println("Square of Given number is :"+output7);
        int output8=obj.findSquare2();
        System.out.println("Square of Given number is :"+output8);
        System.out.println("Square of Given number is :"+(obj.findSquare(60)));
    }
}
