package method.return_type;

public class CubeMethod {


    public int makeCube(int number){//TODO<-------- with input

        return number*number*number;
    }
    public int findCube(){//TODO<--------- without input
        int cube=3;
        return cube*cube*cube;
    }

    public static void main(String[] args) {
        CubeMethod obj=new CubeMethod();
        int output= obj.makeCube(3);
        System.out.println("Cube of Given number is :"+output);
        int output2= obj.makeCube(33);
        System.out.println("Cube of Given number is :"+output2);
        int output3= obj.makeCube(12);
        System.out.println("Cube of Given number is :"+output3);
        int output4= obj.makeCube(4);
        System.out.println("Cube of Given number is :"+output4);
        int output5= obj.makeCube(15);
        System.out.println("Cube of Given number is :"+output5);
        int output6=obj.findCube();
        System.out.println("Cube of Given number is :"+output6);

    }
}
